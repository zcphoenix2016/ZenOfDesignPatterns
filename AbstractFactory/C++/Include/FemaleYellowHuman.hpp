#pragma once

#include "AbstractYellowHuman.hpp"

class FemaleYellowHuman : public AbstractYellowHuman
{
public:
    virtual ~FemaleYellowHuman();
    void getSex() override;
};