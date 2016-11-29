#pragma once

class Human
{
public:
    virtual ~Human() = default;
    virtual void getColor() = 0;
    virtual void talk() = 0;
};