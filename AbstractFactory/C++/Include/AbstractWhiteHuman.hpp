#pragma once

#include "Human.hpp"

class AbstractWhiteHuman : public Human
{
public:
    virtual ~AbstractWhiteHuman() = default;
    void getColor() override;
    void talk() override;
};