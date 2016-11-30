#pragma once

#include "Human.hpp"

class HumanFactory
{
public:
    virtual Human* createYellowHuman() = 0;
    virtual Human* createWhiteHuman() = 0;
    virtual Human* createBlackHuman() = 0;
};