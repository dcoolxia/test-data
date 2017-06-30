CREATE TABLE `tb_item` (
   `id` int(11) NOT NULL auto_increment,
   `title` varchar(20) default NULL,
   `sell_point` varchar(20) default NULL,
   `price` int(11) default NULL,
   `num` int(11) default NULL,
   `barcode` varchar(20) default NULL,
   `image` varchar(20) default NULL,
   `cid` int(11) default NULL,
   `status` tinyint(4) default NULL,
   `created` datetime default NULL,
   `updated` datetime default NULL,
   PRIMARY KEY  (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8