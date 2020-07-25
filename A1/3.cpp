#include<iostream>
using namespace std;

class fuel {
  public:
      void setprice(float p)
          {price = p;}
  protected:
       float price;
};

class liquid {
  public:
      void setsg(float s)
          {specificgravity = s;}
  protected:
       float specificgravity;
};

class petrol: public fuel,public liquid {
   public:
    void display()
      {
        cout<<specificgravity<<" "<<price<<endl;
      }
};

int main()
 {
   float a,b;
   petrol temp;
   cout<<"Specific gravity and price of petrol"<<endl;
   cin>>a>>b;
   temp.setsg(a);
   temp.setprice(b);
   temp.display();  
   return 0;
 }
   
    
    
