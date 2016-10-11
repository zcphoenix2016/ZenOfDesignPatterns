#pragma once

#include "ICar.hpp"

class Driver : public IDriver
{
public:
    virtual void drive(const ICar* car) override
    {
        car->run();
    }
};
