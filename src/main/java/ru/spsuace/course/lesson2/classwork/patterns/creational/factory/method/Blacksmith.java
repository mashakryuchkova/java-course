package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.method;

/**
 *
 * The interface containing method for producing objects.
 *
 */
public interface Blacksmith {

    Weapon manufactureWeapon(WeaponType weaponType);

}
