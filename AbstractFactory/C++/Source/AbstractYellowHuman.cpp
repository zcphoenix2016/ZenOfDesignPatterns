#include "../Include/AbstractYellowHuman.hpp"
#include <iostream>

void AbstractYellowHuman::getColor()
{
    std::cout << "The skin color of YellowHuman is yellow." << std::endl;
}

void AbstractYellowHuman::talk()
{
    std::cout << "YellowHuman is talking..." << std::endl;
}