#pragma once

#include "Human.hpp"
#include <iostream>

class BlackHuman : public Human
{
public:
    BlackHuman()
    {
        std::cout << "Constructor of BlackHuman." << std::endl;
    }
    ~BlackHuman()
    {
        std::cout << "Destructor of BlackHuman." << std::endl;
    }
    void getColor();
    void talk();
};