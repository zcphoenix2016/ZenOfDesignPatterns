#include "Singleton.hpp"
#include <iostream>

Singleton::GC Singleton::m_gc = {};
Singleton* Singleton::m_instance = new Singleton();

Singleton::~Singleton()
{
    std::cout << "Destructor of Singleton..." << std::endl;
}

Singleton* Singleton::getInstance()
{
    return m_instance;
}

/*
void Singleton::releaseInstance()
{
    if(nullptr != m_instance)
    {
        delete m_instance;
    }
}
*/

void Singleton::say()
{
    std::cout << "I'm Singleton..." << std::endl;
}
