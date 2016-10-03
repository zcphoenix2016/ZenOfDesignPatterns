#include "Soldier.hpp"
#include "Rifle.hpp"

int main()
{
    Soldier sanMao;
    sanMao.setGun(std::make_unique<Rifle>());
    sanMao.killEnemy();

    return 0;
}
