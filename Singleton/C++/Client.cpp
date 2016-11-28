#include "Singleton.hpp"
#include <iostream>

int main()
{
    Singleton* l_st0 = Singleton::getInstance();

    for(int l_index = 0; l_index < 3; l_index ++)
    {
        l_st0->say();
    }
    
    Singleton* l_st1 = Singleton::getInstance();
    
    std::cout << "Singleton-0: " << l_st0 << ", Singleton-1: " << l_st1 << std::endl;

    //Singleton::releaseInstance();
    
    return 0;
}
