#include "ICar.hpp"
#include "IDriver.hpp"
#include "Driver.hpp"
#include "Benz.hpp"
#include "BMW.hpp"
#include <memory>

int main()
{
    std::unique_ptr<IDriver> d1 = std::make_unique<Driver>();
    std::unique_ptr<IDriver> d2 = std::make_unique<Driver>();

    std::shared_ptr<ICar> benz = std::make_shared<Benz>();
    std::shared_ptr<ICar> bmw = std::make_shared<BMW>();

    d1->drive(benz.get());
    d2->drive(bmw.get());

    return 0;
}

