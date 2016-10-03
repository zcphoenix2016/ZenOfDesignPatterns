#pragma once

#include <memory>
#include <iostream>
#include "AbstractGun.hpp"

class Soldier
{
public:
    void setGun(std::unique_ptr<AbstractGun> p_gun)
    {
        m_gun = std::move(p_gun);
    }

    void killEnemy()
    {
        std::cout << "Soldier killing enemy ..." << std::endl;
        m_gun->shoot();
    }

private:
    std::unique_ptr<AbstractGun> m_gun;
};
