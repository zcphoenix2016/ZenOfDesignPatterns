#include <iostream>
#include <memory>
#include "../Include/HumanFactory.hpp"
#include "../Include/MaleHumanFactory.hpp"
#include "../Include/FemaleHumanFactory.hpp"
#include "../Include/Human.hpp"

int main()
{
    std::shared_ptr<HumanFactory> l_maleHumanFactory = std::make_shared<MaleHumanFactory>();
    std::shared_ptr<HumanFactory> l_femaleHumanFactory = std::make_shared<FemaleHumanFactory>();

    std::cout << "--FemaleYellowHuman created--" << std::endl;
    std::shared_ptr<Human> l_femaleYellowHuman = std::shared_ptr<Human>(l_femaleHumanFactory->createYellowHuman());
    l_femaleYellowHuman->getColor();
    l_femaleYellowHuman->getSex();
    l_femaleYellowHuman->talk();
    std::cout << "-------------------------------" << std::endl;

    std::cout << "--MaleYellowHuman created--" << std::endl;
    std::shared_ptr<Human> l_maleYellowHuman = std::shared_ptr<Human>(l_maleHumanFactory->createYellowHuman());
    l_maleYellowHuman->getColor();
    l_maleYellowHuman->getSex();
    l_maleYellowHuman->talk();
    std::cout << "-------------------------------" << std::endl;

    return 0;
}