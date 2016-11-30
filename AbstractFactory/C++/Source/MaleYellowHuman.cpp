#include "../Include/MaleYellowHuman.hpp"
#include <iostream>

MaleYellowHuman::~MaleYellowHuman()
{
    std::cout << "Destructor of MaleYellowHuman." << std::endl;
}

void MaleYellowHuman::getSex()
{
    std::cout << "The sex of MaleYellowHuman is 'Male'." << std::endl;
}