#pragma once

#include <iostream>
#include "AbstractGun.hpp"

class MachineGun : public AbstractGun
{
public:
    virtual void shoot() override
    {
        std::cout << "MachineGun shooting ..." << std::endl;
    }
};
