#include "HumanFactory.hpp"
#include "Human.hpp"
#include "BlackHuman.hpp"
#include "WhiteHuman.hpp"
#include "YellowHuman.hpp"
#include <iostream>
#include <memory>

int main()
{    
    std::cout << "**WhiteHuman created**" << std::endl;
    std::shared_ptr<Human> l_wh = std::shared_ptr<Human>(HumanFactory::createHuman<WhiteHuman>());
    l_wh->getColor();
    l_wh->talk();
    std::cout << "--------------------------------" << std::endl;

    std::cout << "**BlackHuman created**" << std::endl;
    std::shared_ptr<Human> l_bh = std::shared_ptr<Human>(HumanFactory::createHuman<BlackHuman>());
    l_bh->getColor();
    l_bh->talk();
    std::cout << "--------------------------------" << std::endl;

    std::cout << "**YellowHuman created**" << std::endl;
    std::shared_ptr<Human> l_yh = std::shared_ptr<Human>(HumanFactory::createHuman<YellowHuman>());
    l_yh->getColor();
    l_yh->talk();
    std::cout << "--------------------------------" << std::endl;
    
    return 0;
}