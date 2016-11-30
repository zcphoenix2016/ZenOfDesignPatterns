#pragma once

#include "AbstractBlackHuman.hpp"

class MaleBlackHuman : public AbstractBlackHuman
{
public:
    virtual ~MaleBlackHuman() = default;
    void getSex() override;
};