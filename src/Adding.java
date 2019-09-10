
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youssef
 */
public class Adding {
     ArrayList<Variables> varb=new ArrayList<Variables>();
    public String Addi(String st,ArrayList<Variables>varb,int ry,String Values,int line_count,int klm,int tempflag,String tempoo,String tempoo2)
    {
        int temp;
        for (;ry<st.length();ry++)
        {
            if (st.charAt(ry)==';'||st.charAt(ry)=='+'||st.charAt(ry)=='-'||st.charAt(ry)=='*'||st.charAt(ry)=='/')
            {
                //==============================================================================
                //Digits
                if (Character.isDigit(tempoo.charAt(0)))
                {
                    if (st.charAt(ry)==';'&&tempflag==0)
                {
                    Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempoo+System.getProperty("line.separator"); 
                    varb.get(klm).value=tempoo;
                    return varb.get(klm).value;
                }
                else if (tempflag!=0)
                    {
                        if (st.charAt(ry)==';')
                        {
                            break;
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                    }
                    else 
                    {
                        tempoo2=tempoo;
                    }
                    if (st.charAt(ry)=='+')
                    {
                        tempflag=1;
                    }
                    else if(st.charAt(ry)=='-')
                    {
                        tempflag=2;
                    }
                    else if (st.charAt(ry)=='*')
                    {
                        tempflag=3;
                    }
                    else if (st.charAt(ry)=='/')
                    {
                        tempflag=4;
                    }
                    if (st.charAt(ry)==' ')
                    {
                        ry+=2;
                    }
                    else
                    {
                        ry++;
                    }
                    Addi(st, varb, ry, Values, line_count, klm,tempflag,"",tempoo2);
                    return varb.get(klm).value;
                }
                //==============================================================================
                //Charachters
                else
                {
                    if (st.charAt(ry)==';'&&tempflag==0)
                {
                    int h=0;
                    for (;h<varb.size();h++)
                    {
                        if (varb.get(h).name.equals(tempoo))
                            {
                                break;
                            }
                    }
                    Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempoo+System.getProperty("line.separator"); 
                    varb.get(klm).value=varb.get(h).value;
                    return varb.get(klm).value;
                }
                else if (tempflag!=0)
                    {
                        if (st.charAt(ry)==';')
                        {
                            break;
                        }
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                    }
                    else 
                    {
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        tempoo2=varb.get(k).value;
                    }
                    if (st.charAt(ry)=='+')
                    {
                        tempflag=1;
                    }
                    else if(st.charAt(ry)=='-')
                    {
                        tempflag=2;
                    }
                    else if (st.charAt(ry)=='*')
                    {
                        tempflag=3;
                    }
                    else if (st.charAt(ry)=='/')
                    {
                        tempflag=4;
                    }
                    if (st.charAt(ry)==' ')
                    {
                        ry+=2;
                    }
                    else
                    {
                        ry++;
                    }
                    Addi(st, varb, ry, Values, line_count, klm,tempflag,"",tempoo2);
                    return varb.get(klm).value;
                }
            }  
            else
            {
                  tempoo+=st.charAt(ry);
            }
        }
        //=========================================================================================================
        if (Character.isDigit(tempoo.charAt(0)))
        {
            if (tempflag==1)
            {
                temp=Integer.parseInt(tempoo2)+Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==2)
            {
                temp=Integer.parseInt(tempoo2)-Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==3)
            {
                temp=Integer.parseInt(tempoo2)*Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==4)
            {
                temp=Integer.parseInt(tempoo2)/Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
        }
        else
        {
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
        }
        String goo="";
        int tempooo=Integer.parseInt(tempoo2);
        Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempooo+System.getProperty("line.separator"); 
        varb.get(klm).value=Integer.toString(tempooo);
        NewJFrame nj =new NewJFrame();
        System.out.println(Values);
        nj.jTextArea1.setText(Values);
        return varb.get(klm).value;
    }
    
    
    //==========================================================================================
    public String val(String st,ArrayList<Variables>varb,int ry,String Values,int line_count,int klm,int tempflag,String tempoo,String tempoo2)
    {
        int temp;
        for (;ry<st.length();ry++)
        {
            if (st.charAt(ry)==';'||st.charAt(ry)=='+'||st.charAt(ry)=='-'||st.charAt(ry)=='*'||st.charAt(ry)=='/')
            {
                //==============================================================================
                //Digits
                if (Character.isDigit(tempoo.charAt(0)))
                {
                    if (st.charAt(ry)==';'&&tempflag==0)
                {
                    Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempoo+System.getProperty("line.separator"); 
                    varb.get(klm).value=tempoo;
                    return Values;
                }
                else if (tempflag!=0)
                    {
                        if (st.charAt(ry)==';')
                        {
                            break;
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(tempoo);
                            tempoo2=Integer.toString(temp);
                        }
                    }
                    else 
                    {
                        tempoo2=tempoo;
                    }
                    if (st.charAt(ry)=='+')
                    {
                        tempflag=1;
                    }
                    else if(st.charAt(ry)=='-')
                    {
                        tempflag=2;
                    }
                    else if (st.charAt(ry)=='*')
                    {
                        tempflag=3;
                    }
                    else if (st.charAt(ry)=='/')
                    {
                        tempflag=4;
                    }
                    if (st.charAt(ry)==' ')
                    {
                        ry+=2;
                    }
                    else
                    {
                        ry++;
                    }
                    Addi(st, varb, ry, Values, line_count, klm,tempflag,"",tempoo2);
                    return Values;
                }
                //==============================================================================
                //Charachters
                else
                {
                    if (st.charAt(ry)==';'&&tempflag==0)
                {
                    int h=0;
                    for (;h<varb.size();h++)
                    {
                        if (varb.get(h).name.equals(tempoo))
                            {
                                break;
                            }
                    }
                    Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempoo+System.getProperty("line.separator"); 
                    varb.get(klm).value=varb.get(h).value;
                    return Values;
                }
                else if (tempflag!=0)
                    {
                        if (st.charAt(ry)==';')
                        {
                            break;
                        }
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                    }
                    else 
                    {
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        tempoo2=varb.get(k).value;
                    }
                    if (st.charAt(ry)=='+')
                    {
                        tempflag=1;
                    }
                    else if(st.charAt(ry)=='-')
                    {
                        tempflag=2;
                    }
                    else if (st.charAt(ry)=='*')
                    {
                        tempflag=3;
                    }
                    else if (st.charAt(ry)=='/')
                    {
                        tempflag=4;
                    }
                    if (st.charAt(ry)==' ')
                    {
                        ry+=2;
                    }
                    else
                    {
                        ry++;
                    }
                    Addi(st, varb, ry, Values, line_count, klm,tempflag,"",tempoo2);
                    return Values;
                }
            }  
            else
            {
                  tempoo+=st.charAt(ry);
            }
        }
        //=========================================================================================================
        if (Character.isDigit(tempoo.charAt(0)))
        {
            if (tempflag==1)
            {
                temp=Integer.parseInt(tempoo2)+Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==2)
            {
                temp=Integer.parseInt(tempoo2)-Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==3)
            {
                temp=Integer.parseInt(tempoo2)*Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
            if (tempflag==4)
            {
                temp=Integer.parseInt(tempoo2)/Integer.parseInt(tempoo);
                tempoo2=Integer.toString(temp);
            }
        }
        else
        {
                        int k=0;
                        for (;k<varb.size();k++)
                        {
                            if (varb.get(k).name.equals(tempoo))
                            {
                                break;
                            }
                        }
                        if (tempflag==1)
                        {
                            temp=Integer.parseInt(tempoo2)+Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==2)
                        {
                            temp=Integer.parseInt(tempoo2)-Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==3)
                        {
                            temp=Integer.parseInt(tempoo2)*Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
                        if (tempflag==4)
                        {
                            temp=Integer.parseInt(tempoo2)/Integer.parseInt(varb.get(k).value);
                            tempoo2=Integer.toString(temp);
                        }
        }
        String goo="";
        int tempooo=Integer.parseInt(tempoo2);
        Values+="The Value Of Variable [ "+varb.get(klm).name+" ] In line "+line_count+" From { "+varb.get(klm).value+" }To "+tempooo+System.getProperty("line.separator"); 
        varb.get(klm).value=Integer.toString(tempooo);
        return Values;
    }
    
}
