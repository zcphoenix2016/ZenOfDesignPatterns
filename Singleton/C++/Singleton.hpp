#pragma once

class Singleton
{
public:
    ~Singleton();
    static Singleton* getInstance();
    //static void releaseInstance(); //manually release
    void say();
    
    class GC
    {
    public:
        GC() = default;
        ~GC()
        {
            if(nullptr != m_instance)
            {
                delete m_instance;
            }
        }
    };

private:
    Singleton() = default;
    static Singleton* m_instance;
    static GC m_gc;
};
