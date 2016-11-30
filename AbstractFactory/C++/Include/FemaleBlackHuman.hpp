#pragma once

#include "AbstractBlackHuman.hpp"

class FemaleBlackHuman : public AbstractBlackHuman
{
public:
    virtual ~FemaleBlackHuman() = default;
    void getSex() override;
};