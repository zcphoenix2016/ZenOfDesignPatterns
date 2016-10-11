#pragma once

#include "ICar.hpp"
#include <iostream>

class BMW : public ICar
{
public:
    virtual void run() const override
    {
        std::cout << "BMW starts to run ..." << std::endl;
    }
};
