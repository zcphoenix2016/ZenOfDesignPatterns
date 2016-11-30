#pragma once

#include "Human.hpp"

class AbstractBlackHuman : public Human
{
public:
    virtual ~AbstractBlackHuman() = default;
    void getColor() override;
    void talk() override;
};