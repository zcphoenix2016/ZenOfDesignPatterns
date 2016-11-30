#include "../Include/AbstractWhiteHuman.hpp"
#include <iostream>

void AbstractWhiteHuman::getColor()
{
    std::cout << "The skin color of WhiteHuman is white." << std::endl;
}

void AbstractWhiteHuman::talk()
{
    std::cout << "WhiteHuman is talking..." << std::endl;
}