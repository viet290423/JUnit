using System;
using System.Collections.Generic;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;

namespace QUANLIKH
{
    public class DataProvider :DataTable
    {
          static SqlConnection m_Connection;

        public SqlConnection Connection
        {
            get { return m_Connection; }
            set { m_Connection = value; }
        }
	
        public SqlDataAdapter m_DataAdapter;

        public SqlDataAdapter DataAdapter
        {
            get { return m_DataAdapter; }
            set { m_DataAdapter = value; }
        }

        SqlCommand m_Command;
        //string strConn = "Data Source=localhost;Initial Catalog=QLKhachHang;User Id=sa; Password;";// quyen slq
        string strConn = "Server=localhost;Database=QLKhachHang;Trusted_Connection=True;";// quyen windows
        
        public DataProvider()
        {
        }

        public void Connect()
        {
            if (m_Connection == null || m_Connection.State == ConnectionState.Closed)
            {
                try
                {
                    m_Connection = new SqlConnection(strConn);
                    m_Connection.Open();
                }
                catch (Exception e) 
                {
                    MessageBox.Show(e.Message+ "Kết nối cơ sở dữ liệu không thành công.","Thông báo");
                }
            }
        }

        public void Load(SqlCommand command)
        {
            
                this.Connect();
                m_Command = command;
                m_Command.Connection = m_Connection;

                m_DataAdapter = new SqlDataAdapter(m_Command);

                this.Clear();
                m_DataAdapter.Fill(this);
                m_Connection.Close();
           
        }
      
        public void Update()
        {
            
                SqlCommandBuilder builder = new SqlCommandBuilder(m_DataAdapter);
                m_DataAdapter.Update(this);
            
        }

        public void Update(DataTable dtb)
        {
            SqlCommandBuilder builder = new SqlCommandBuilder(m_DataAdapter);
            m_DataAdapter.Update(dtb);
        }
    }
}
