#include "../Include/AbstractBlackHuman.hpp"
#include <iostream>

void AbstractBlackHuman::getColor()
{
    std::cout << "The skin color of BlackHuman is black." << std::endl;
}

void AbstractBlackHuman::talk()
{
    std::cout << "BlackHuman is talking..." << std::endl;
}