#include "Soldier.hpp"
#include "HandGun.hpp"
#include "MachineGun.hpp"
#include "Rifle.hpp"

int main()
{
    Soldier s1, s2, s3;

    s1.setGun(std::make_unique<HandGun>());
    s2.setGun(std::make_unique<Rifle>());
    s3.setGun(std::make_unique<MachineGun>());

    s1.killEnemy();
    s2.killEnemy();
    s3.killEnemy();

    return 0;
}
