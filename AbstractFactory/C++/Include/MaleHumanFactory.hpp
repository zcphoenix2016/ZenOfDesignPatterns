#pragma once

#include "HumanFactory.hpp"

class Human;

class MaleHumanFactory : public HumanFactory
{
public:
    Human* createBlackHuman() override;
    Human* createWhiteHuman() override;
    Human* createYellowHuman() override;
};