#include "../Include/FemaleYellowHuman.hpp"
#include <iostream>

FemaleYellowHuman::~FemaleYellowHuman()
{
    std::cout << "Destructor of FemaleYellowHuman." << std::endl;
}

void FemaleYellowHuman::getSex()
{
    std::cout << "The sex of FemaleYellowHuman is 'Female'." << std::endl;
}