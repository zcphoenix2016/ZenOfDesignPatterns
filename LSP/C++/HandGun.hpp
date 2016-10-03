#pragma once

#include <iostream>
#include "AbstractGun.hpp"

class HandGun : public AbstractGun
{
public:
    virtual void shoot() override
    {
        std::cout << "HandGun shooting ..." << std::endl;
    }
};
