package bridge.first;

import bridge.first.devices.Device;
import bridge.first.devices.Radio;
import bridge.first.devices.TV;
import bridge.first.remote.AdvancedRemote;
import bridge.first.remote.BasicRemote;

/**
 *
 * Паттерн "Мост"
 *
 * Группа: структурный
 *
 * Назначение: Отделить абстракцию от ее реализации так, чтобы то и другое можно было изменять независимо
 *
 * Другие названия: Handle/Body (описатель/тело).
 *
 * Полезные сслыки:
 * https://refactoring.guru/ru/design-patterns/bridge
 * https://www.youtube.com/watch?v=1KOkb-B2qnM
 *
 * Литература:
 *  "Приемы объектно-ориентированного проектирования. Паттерны проектирования"- страница 153
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/bridge/java/example
 */
public class Main {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
