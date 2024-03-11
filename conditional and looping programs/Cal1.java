class  Cal1
{
	public static void main(String[] args) 
	{
		int a=23;
		double b=5.0;
		double c=a/b;

		//double d=c+(0.0*d);

	

		 update iplpoints_table set nrr=0,win=0,loss=0,forc=0,aganist=0,points=0,played=0 where team='rcb';



 create table users(
     user_id int(5) NOT NULL AUTO_INCREMENT, 
     user_name varchar2(20) NOT NULL,
     password varchar2(20) NOT NULL
	 role varchar2(20) NOT NULL,
     enabled tinyint(4) NOT NULL,
     primary key (userid) 
	 );


  create table users(
      user_id int(5) NOT NULL AUTO_INCREMENT,
      username varchar(20) NOT NULL,
      password varchar(60) NOT NULL,
      role varchar(20) NOT NULL,
      enabled tinyint(4) DEFAULT NULL,
      PRIMARY KEY (user_id)
    );

  mysql> insert into users (username,password,role,enabled) values ('admin','123','ROLE_ADMIN',1);


mongodb connection url

	:::::::


		mongodb+srv://gujjari:gujjari@bprasad.rsm032v.mongodb.net/?retryWrites=true&w=majority

		System.out.println(c);
	}
}
