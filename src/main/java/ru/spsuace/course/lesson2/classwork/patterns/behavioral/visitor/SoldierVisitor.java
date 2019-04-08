package ru.spsuace.course.lesson2.classwork.patterns.behavioral.visitor;


/**
 * SoldierVisitor
 */
public class SoldierVisitor implements UnitVisitor {


    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println("Greetings " + soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
