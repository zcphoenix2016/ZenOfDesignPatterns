#pragma once

#include "Human.hpp"

class AbstractYellowHuman : public Human
{
public:
    virtual ~AbstractYellowHuman() = default;
    void getColor() override;
    void talk() override;
};