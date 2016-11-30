#include "../Include/MaleHumanFactory.hpp"
#include "../Include/MaleBlackHuman.hpp"
#include "../Include/MaleWhiteHuman.hpp"
#include "../Include/MaleYellowHuman.hpp"

Human* MaleHumanFactory::createBlackHuman()
{
    return dynamic_cast<Human*>(new MaleBlackHuman());
}

Human* MaleHumanFactory::createWhiteHuman()
{
    return dynamic_cast<Human*>(new MaleWhiteHuman());
}

Human* MaleHumanFactory::createYellowHuman()
{
    return dynamic_cast<Human*>(new MaleYellowHuman());
}