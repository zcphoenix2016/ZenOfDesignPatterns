#include "../Include/FemaleHumanFactory.hpp"
#include "../Include/FemaleBlackHuman.hpp"
#include "../Include/FemaleWhiteHuman.hpp"
#include "../Include/FemaleYellowHuman.hpp"

Human* FemaleHumanFactory::createBlackHuman()
{
    return dynamic_cast<Human*>(new FemaleBlackHuman());
}

Human* FemaleHumanFactory::createWhiteHuman()
{
    return dynamic_cast<Human*>(new FemaleWhiteHuman());
}

Human* FemaleHumanFactory::createYellowHuman()
{
    return dynamic_cast<Human*>(new FemaleYellowHuman());
}