#pragma once

class Human;

class HumanFactory
{
public:
    template<typename T>
    static Human* createHuman()
    {
        return dynamic_cast<Human*>(new T());
    }
};