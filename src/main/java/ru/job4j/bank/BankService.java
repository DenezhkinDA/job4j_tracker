package ru.job4j.bank;

import java.lang.ref.SoftReference;
import java.util.*;

/**
 * Класс описывает модель работы банковской системы, а именно:
 * регистрация/удаление нового пользователя из системы, добавление банковского счета пользователю,
 * перевод денег с одного счета на другой.
 * @author Dmitriy Denezhkin
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему, если такого ещё не существует.
     * @param user пользователь, объект класса User.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход данные паспорта и проверяет существование данного пользователя.
     * Если пользователь найден и добавляемый счет отсутствует - добавляем новый счет.
     * @param passport данные паспорта.
     * @param account данные счета.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport паспортные данные.
     * @return возвращает пользователя, или null, если ничего не найдено.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход данные паспорта и проверяет существование данного пользователя.
     * Если пользователь найден - получаем список счетов. Ищем нужный счет.
     * @param passport паспортные данные.
     * @param requisite реквизит счета.
     * @return возвращает необходимый нам счет, если он найден у пользователя, иначе вернется null.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод проверяет по реквизитам есть ли в базе пользователи для перевода денег со счета одного другому,
     * если данное условие выполняется и на балансе с которого переводят денег не меньше, чем требуется
     * для перевода - выполняется изменение счетов.
     * @param srcPassport паспортные данные пользователя, со счета которого нужно перевести деньги.
     * @param srcRequisite реквизиты счета, с которого нужно перевести деньги.
     * @param destPassport паспортные данные пользователя, на счет которого нужно перевести деньги.
     * @param destRequisite реквизиты счета, на который нужно перевести деньги.
     * @param amount сумма, которую необходимо перевести деньги.
     * @return если перевод денег выполнен возвращаем true, иначе false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
