#pragma once

#include <iostream>
#include "AbstractGun.hpp"

class Rifle : public AbstractGun
{
public:
    virtual void shoot() override
    {
        std::cout << "Rifle shooting ..." << std::endl;
    }
};
