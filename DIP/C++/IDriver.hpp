#pragma once

#include "ICar.hpp"

class IDriver
{
public:
    virtual void drive(const ICar* car) = 0;
};
