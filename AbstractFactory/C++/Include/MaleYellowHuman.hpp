#pragma once

#include "AbstractYellowHuman.hpp"

class MaleYellowHuman : public AbstractYellowHuman
{
public:
    virtual ~MaleYellowHuman();
    void getSex() override;
};