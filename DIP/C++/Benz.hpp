#pragma once

#include "ICar.hpp"
#include <iostream>

class Benz : public ICar
{
public:
    virtual void run() const override
    {
        std::cout << "Benz starts to run ..." << std::endl;
    }
};
