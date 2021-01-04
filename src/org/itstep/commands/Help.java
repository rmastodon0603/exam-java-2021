package org.itstep.commands;

public class Help {

    private final String TEXT = "Командная оболочка Java Command Line \n" +
            "Список поддерживаемых команд:\n" +
            "\tdir — выводит список файлов в текущей директории\n" +
            "\tcd “путь” — перейти в директорию, путь к которой задан первым аргументом\n" +
            "\tpwd — вывести полный путь до текущей директории\n" +
            "\tcat «имя_файла» - выводит содержимое текстового файла «имя_файла»\n" +
            "\thelp - выводит эту справку\n" +
            "\texit - выход";

    public void command() {
        System.out.println(TEXT);
    }
}
