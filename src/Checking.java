/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youssef
 */
public class Checking {
    public String variabless(String st,String errors,int line_count,int l)     
    {
        boolean flag=false;
           if (!Character.isLetter(st.charAt(l)))
           {
               errors="Error In Line "+ line_count + " Wrong If Format"+System.getProperty("line.separator");
               return errors;
           }
           else 
           {
               for (;;l++)
               {
                    if (st.charAt(l)==' '||st.charAt(l)=='='||st.charAt(l)=='<'||st.charAt(l)=='>'||st.charAt(l)=='!')
                    {
                        break;
                    }
                }
                if (st.charAt(l)==' '||st.charAt(l)=='='||st.charAt(l)=='<'||st.charAt(l)=='>'||st.charAt(l)=='!')
                {
                    if ((st.charAt(l)=='='||st.charAt(l)=='!')&&st.charAt(l+1)!='=')
                    {
                        errors="Error In Line "+ line_count + " Missing * = * Sign"+System.getProperty("line.separator");
                        return errors;
                    }
                    else if (st.charAt(l+1)!='='
                            &&((st.charAt(l)=='>'||st.charAt(l)=='<')
                            &&(!Character.isLetter(st.charAt(l+1))
                            &&!Character.isDigit(st.charAt(l+1))))
                                                )
                    {
                                            
                        errors="Error In Line "+ line_count + " Missing Comparing Factor"+System.getProperty("line.separator");
                        return errors;
                    }
                    else
                    {
                        if (st.charAt(l+1)=='=')
                        {
                            l+=2;
                            if (!Character.isLetter(st.charAt(l))&&!Character.isDigit(st.charAt(l)))
                            {
                                errors="Error In Line "+ line_count + " Wrong If Formast"+System.getProperty("line.separator");
                                return errors;
                            }
                            else 
                            {
                                flag=true;
                            }
                        }
                        else
                        {
                            l++;
                            if (!Character.isLetter(st.charAt(l))&&!Character.isDigit(st.charAt(l)))
                            {
                                errors="Error In Line "+ line_count + " Wrong If Formazzt"+System.getProperty("line.separator");
                                return errors;
                            }
                            else 
                            {
                                flag=true;
                            }
                        }
                        if (flag)
                        {
                            for (;l<st.length()-1;l++)
                            {
                                if (st.charAt(l)=='&'||st.charAt(l)=='|'||st.charAt(l)==')')
                                {
                                    break;
                                }
                            }
                            if (st.charAt(l)=='&'&&st.charAt(l+1)!='&')
                            {
                                errors="Error In Line "+ line_count + " Missing * & *"+System.getProperty("line.separator");
                                return errors;
                            }
                            else if (st.charAt(l)=='&'&&st.charAt(l+1)=='&')
                            {
                                l+=2;
                                errors=variabless(st, errors, line_count, l);
                                return errors;
                            }
                            else if (st.charAt(l)=='|'&&st.charAt(l+1)!='|')
                            {
                                errors="Error In Line "+ line_count + " Missing * | *t"+System.getProperty("line.separator");
                                return errors;
                            }
                            else if (st.charAt(l)=='|'&&st.charAt(l+1)=='|')
                            {
                                l+=2;
                               errors=variabless(st, errors, line_count, l);
                                return errors;
                            }
                            else if  (st.charAt(l)!=')')
                            {
                                errors="Error In Line "+ line_count + " Missing Closing Bracket"+System.getProperty("line.separator");
                                return errors;
                            }
                        }
                    }
                }
                return "";
           }
    }
    //=====================================================================================================================
    public String variabless2(String st,String errors,int line_count,int l)
    {
        boolean flag=false;
        int count_simi=0;
        int l2=l;
        for(;l<st.length();l++)
        {
            if (st.charAt(l)==';')
            {
                count_simi++;
                if(count_simi>2)
                {
                    break;
                }
            }
        }
        l=l2;
        if(count_simi==2)
        { 
                if (st.charAt(l)!=' '&&!Character.isLetter(st.charAt(l)))
                {
                    errors="Error In Line "+ line_count + " Wrong For Formattt"+System.getProperty("line.separator");
                    return errors;
                }
                else
                {
                   if (st.charAt(l)==' ')
                   {
                       l++;
                   }
                   for (;st.charAt(l)==';';l++)
                   {
                       if(st.charAt(l)=='=')
                       {
                           if(!Character.isLetter(st.charAt(l+1))&&!Character.isDigit(l+1))
                           {
                               errors="Error In Line "+ line_count + " Wrong For Formatyy"+System.getProperty("line.separator");
                                return errors;
                           }
                           else
                           {
                               for (;st.charAt(l)==';';l++)
                                {
                                    
                                }
                           }
                       }
                           break;
                    }
                    l++;
                    if (st.charAt(l)==' ')
                    {
                        l++;
                    }
                    for (;st.charAt(l)==';';l++)
                    {
                        if(st.charAt(l)=='='||st.charAt(l)=='>'||st.charAt(l)=='<'||st.charAt(l)=='!')
                        {
                            if(!Character.isLetter(st.charAt(l+1))&&!Character.isDigit(l+1))
                            {
                                errors="Error In Line "+ line_count + " Wrong For Formatzz"+System.getProperty("line.separator");
                                return errors;
                              
                            }
                            if (st.charAt(l)=='='||st.charAt(l)=='!')
                            {
                                if(st.charAt(l+1)!='=')
                                {
                                    errors="Error In Line "+ line_count + " Wrong For Formataa"+System.getProperty("line.separator");
                                    return errors;
                                }
                            }
                            else if (st.charAt(l+1)=='<'||st.charAt(l+1)=='>')
                            {
                                if(st.charAt(l+1)!='='&&(!Character.isDigit(l+2)||!Character.isDigit(l+2)))
                                {
                                    errors="Error In Line "+ line_count + " Wrong For Format"+System.getProperty("line.separator");
                                    return errors;
                                
                                }
                            }
                        }
                    }
                }
                   
            }      
            else
            {
                errors="Error In Line "+ line_count + " Wrong For Format"+System.getProperty("line.separator");
                return errors;
            }
        
        
            return "";
        }
    //=====================================================================================================================
     public String Array(String st,String errors,int line_count,int l,Variables var)
     {
         String temp="";
         for (int k=l;;k++)
         {
             if (st.charAt(k)==']')
             {
                 break;
             }
             temp+=st.charAt(k);
         }
         int x=Integer.parseInt(temp);
         l--;
         int k=l;
         temp="";
         for (;l>=0;l--)
         {
             if ((!Character.isLetter(st.charAt(l))&&!Character.isDigit(l))&&l!=k)
             {
                 break;
             }
             if (Character.isLetter(st.charAt(l)))
             {
                 temp+=st.charAt(l);
             }
         }
         if (temp.equals(var.name))
         {
             int y=Integer.parseInt(var.Count);
             if (x>=y)
             {
                errors="Error In Line "+ line_count + " Exceeding Index"+System.getProperty("line.separator");
                return errors;
             }
         }
         
         return "";
     }
}
