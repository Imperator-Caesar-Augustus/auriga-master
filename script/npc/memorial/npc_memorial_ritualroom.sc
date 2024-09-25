1@mir.gat,0,0,0		script	Mir_Contorl	-1,{
OnStart:
	hideonnpc getmdnpcname("�p���t���A���_���C�X#03");
	hideonnpc getmdnpcname("#result");
	hideonnpc getmdnpcname("#effect01");
	hideonnpc getmdnpcname("�r�W���E#00");
	hideonnpc getmdnpcname("�r�W���E#02");
	hideonnpc getmdnpcname("�r�W���E#03");
	hideonnpc getmdnpcname("�r�W���E#04");
	hideonnpc getmdnpcname("�r�W���E#ex");
	hideonnpc getmdnpcname("�T��#04");
	hideonnpc getmdnpcname("#mir_bgm01");
	hideonnpc getmdnpcname("#mir_bgm02");
	areasetcell getmdmapname("1@mir.gat"),88,52,115,53,1;
	areasetcell getmdmapname("1@mir.gat"),78,83,125,84,1;
	set 'cell,1;
	initnpctimer;
	end;
OnTimer3000:
	areasetcell getmdmapname("1@mir.gat"),88,52,115,53,'cell;
	areasetcell getmdmapname("1@mir.gat"),78,83,125,84,'cell;
	initnpctimer;
	end;
}
1@mir.gat,0,1,0		script	Mir_Phase1	-1,{
OnStart:
	set 'mob,9;
	monster getmdmapname("1@mir.gat"),97,71,"�p���t��A�X�P���g��",3445,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),107,72,"�p���t��A�X�P���g��",3445,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),106,69,"�p���t��A�X�P���g��",3445,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),99,77,"�p���t���X�P���g��",3446,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),104,77,"�p���t���X�P���g��",3446,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),107,75,"�p���t���X�P���g��",3446,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),97,76,"�p���t��S�X�P���g��",3447,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),98,69,"�p���t��S�X�P���g��",3447,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),102,69,"�p���t��S�X�P���g��",3447,1,getmdnpcname("Mir_Phase1")+"::OnKilled";
	end;
OnKilled:
	set 'mob,'mob-1;
	if('mob <= 0)
		initnpctimer;
	end;
OnTimer5000:
	stopnpctimer;
	announce "�r�W���E : �ӂӂӁc�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	hideonnpc getmdnpcname("�r�W���E#00");
	hideoffnpc getmdnpcname("�r�W���E#02");
	end;
}

1@mir.gat,0,2,0		script	Mir_Phase2	-1,{
OnStart:
	monster getmdmapname("1@mir.gat"),101,75,"�p���t���A���_���C�X",3448,1,getmdnpcname("Mir_Phase2")+"::OnKilled";
	end;
OnKilled:
	announce "�r�W���E : �ւ��c�c�Ȃ��Ȃ���邶��Ȃ����B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	hideonnpc getmdnpcname("�r�W���E#00");
	hideoffnpc getmdnpcname("�r�W���E#03");
	end;
}

1@mir.gat,0,3,0		script	#�r�W���E�Ǘ�	-1,{
OnStart:
	set 'bijou,callmonster(getmdmapname("1@mir.gat"),101,79,"�r�W���E",3450,getmdnpcname("#�r�W���E�Ǘ�")+"::OnKilled");
	initnpctimer;
	end;
OnTimer3000:
	set 'mobhp,getmobhp('bijou);
	if('mobhp < 7000000) {
		stopnpctimer;
		killmonster getmdmapname("1@mir.gat"),getmdnpcname("#�r�W���E�Ǘ�")+"::OnKilled";
		initnpctimer getmdnpcname("#�����̃A���_");
		hideoffnpc getmdnpcname("�r�W���E#ex");
		end;
	}
	initnpctimer;
	end;
OnKilled:
	stopnpctimer;
	stopnpctimer getmdnpcname("#�r�W���E�Ǘ�2");
	hideoffnpc getmdnpcname("�r�W���E#04");
	hideoffnpc getmdnpcname("#result");
	end;
}

1@mir.gat,0,4,0		script	#�����̃A���_	-1,{
OnTimer2000:
	announce "�r�W���E : �Ȃ��Ȃ��撣��ȁc�c�Ȃ�΂���͂ǂ����H", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	end;
OnTimer4000:
	hideoffnpc getmdnpcname("#mir_bgm01");
	end;
OnTimer6000:
	monster getmdmapname("1@mir.gat"),101,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,69,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer10000:
	announce "�r�W���E : ������̓A���_���C�X�̎��s�삳�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	monster getmdmapname("1@mir.gat"),102,81,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),102,73,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),102,63,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer12000:
	monster getmdmapname("1@mir.gat"),118,78,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,68,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,63,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer14000:
	announce "�r�W���E : ���̂܂ܔj�������Ȃ�ĉ��z���낤�H", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	monster getmdmapname("1@mir.gat"),101,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,69,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer15000:
	monster getmdmapname("1@mir.gat"),102,58,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,58,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),101,57,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer16000:
	monster getmdmapname("1@mir.gat"),102,68,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,63,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer18000:
	announce "�r�W���E : �v��������V��ł���Ă������B�͂͂͂͂�!!", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	monster getmdmapname("1@mir.gat"),102,81,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),102,78,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),111,81,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer20000:
	monster getmdmapname("1@mir.gat"),118,78,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,73,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),102,58,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer22000:
	monster getmdmapname("1@mir.gat"),101,57,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),118,69,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),91,61,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer24000:
	monster getmdmapname("1@mir.gat"),90,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	monster getmdmapname("1@mir.gat"),101,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnTimer40000:
	stopnpctimer;
	killmonster getmdmapname("1@mir.gat"),getmdnpcname("#�����̃A���_")+"::OnKilled";
	end;
OnKilled:
	end;
}

1@mir.gat,0,5,0		script	#�r�W���E�Ǘ�2	-1,{
OnStart:
	set 'bijou,callmonster(getmdmapname("1@mir.gat"),101,79,"�r�W���E",3450,getmdnpcname("#�r�W���E�Ǘ�")+"::OnKilled");
	setmobhp 'bijou,getvariableofnpc('mobhp,getmdnpcname("#�r�W���E�Ǘ�"));
	initnpctimer;
	end;
OnTimer16000:
	switch(rand(4)) {
	case 0: donpcevent getmdnpcname("#�}���g��")+"::OnStart"; break;
	case 1: donpcevent getmdnpcname("#�t���X�g�_�C�o�[")+"::OnStart"; break;
	case 2: donpcevent getmdnpcname("#�ς�����")+"::OnStart"; break;
	case 3: donpcevent getmdnpcname("#�A���_���C�X")+"::OnStart"; break;
	}
	initnpctimer;
	end;
}

1@mir.gat,1,0,0		script	#�}���g��	-1,{
OnStart:
	set '@mob_id,getvariableofnpc('bijou,getmdnpcname("#�r�W���E�Ǘ�2"));
	unittalk '@mob_id,"�r�W���E : �}���g���E�G�N�X�v���[�W�����I";
	set 'mob1,callmonster(getmdmapname("1@mir.gat"),85,83,"�r�W���E#01",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob2,callmonster(getmdmapname("1@mir.gat"),85,78,"�r�W���E#02",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob3,callmonster(getmdmapname("1@mir.gat"),85,73,"�r�W���E#03",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob4,callmonster(getmdmapname("1@mir.gat"),85,68,"�r�W���E#04",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob5,callmonster(getmdmapname("1@mir.gat"),85,63,"�r�W���E#05",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob7,callmonster(getmdmapname("1@mir.gat"),102,83,"�r�W���E#07",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob8,callmonster(getmdmapname("1@mir.gat"),102,78,"�r�W���E#08",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob9,callmonster(getmdmapname("1@mir.gat"),102,73,"�r�W���E#09",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob10,callmonster(getmdmapname("1@mir.gat"),102,68,"�r�W���E#10",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob11,callmonster(getmdmapname("1@mir.gat"),102,63,"�r�W���E#11",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob13,callmonster(getmdmapname("1@mir.gat"),118,83,"�r�W���E#13",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob14,callmonster(getmdmapname("1@mir.gat"),118,78,"�r�W���E#14",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob15,callmonster(getmdmapname("1@mir.gat"),118,73,"�r�W���E#15",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob16,callmonster(getmdmapname("1@mir.gat"),118,68,"�r�W���E#16",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	set 'mob17,callmonster(getmdmapname("1@mir.gat"),118,63,"�r�W���E#17",3773,getmdnpcname("#�}���g��")+"::OnKilled");
	sleep 2000;
	mobuseskill 'mob7,2216,5,0,0,0,-1,0;
	mobuseskill 'mob8,2216,5,0,0,0,-1,0;
	mobuseskill 'mob9,2216,5,0,0,0,-1,0;
	mobuseskill 'mob10,2216,5,0,0,0,-1,0;
	mobuseskill 'mob11,2216,5,0,0,0,-1,0;
	sleep 2000;
	mobuseskill 'mob1,2216,5,0,0,0,-1,0;
	mobuseskill 'mob2,2216,5,0,0,0,-1,0;
	mobuseskill 'mob3,2216,5,0,0,0,-1,0;
	mobuseskill 'mob4,2216,5,0,0,0,-1,0;
	mobuseskill 'mob5,2216,5,0,0,0,-1,0;
	mobuseskill 'mob13,2216,5,0,0,0,-1,0;
	mobuseskill 'mob14,2216,5,0,0,0,-1,0;
	mobuseskill 'mob15,2216,5,0,0,0,-1,0;
	mobuseskill 'mob16,2216,5,0,0,0,-1,0;
	mobuseskill 'mob17,2216,5,0,0,0,-1,0;
	sleep 1000;
	killmonster getmdmapname("1@mir.gat"),getmdnpcname("#�}���g��")+"::OnKilled";
	end;
OnKilled:
	end;
}
1@mir.gat,2,0,0		script	#�t���X�g�_�C�o�[	-1,{
OnStart:
	set '@mob_id,getvariableofnpc('bijou,getmdnpcname("#�r�W���E�Ǘ�2"));
	unittalk '@mob_id,"�r�W���E : ������c�c";
	set 'mob1,callmonster(getmdmapname("1@mir.gat"),85,80,"�r�W���E#01",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	set 'mob2,callmonster(getmdmapname("1@mir.gat"),85,66,"�r�W���E#02",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	set 'mob4,callmonster(getmdmapname("1@mir.gat"),101,70,"�r�W���E#04",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	set 'mob5,callmonster(getmdmapname("1@mir.gat"),101,80,"�r�W���E#05",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	set 'mob6,callmonster(getmdmapname("1@mir.gat"),118,80,"�r�W���E#06",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	set 'mob7,callmonster(getmdmapname("1@mir.gat"),118,69,"�r�W���E#07",3773,getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled");
	sleep 2000;
	mobuseskill '@mob_id,720,5,0,0,0,-1,0;
	mobuseskill 'mob1,720,5,0,0,0,-1,0;
	mobuseskill 'mob4,720,5,0,0,0,-1,0;
	mobuseskill 'mob6,720,5,0,0,0,-1,0;
	unittalk '@mob_id,"�r�W���E : �t���X�g�_�C�o�[�I";
	sleep 1000;
	mobuseskill 'mob2,720,5,0,0,0,-1,0;
	mobuseskill 'mob5,720,5,0,0,0,-1,0;
	mobuseskill 'mob7,720,5,0,0,0,-1,0;
	sleep 1000;
	mobuseskill '@mob_id,720,5,0,0,0,-1,0;
	mobuseskill 'mob1,720,5,0,0,0,-1,0;
	mobuseskill 'mob4,720,5,0,0,0,-1,0;
	mobuseskill 'mob6,720,5,0,0,0,-1,0;
	sleep 1000;
	mobuseskill 'mob2,720,5,0,0,0,-1,0;
	mobuseskill 'mob5,720,5,0,0,0,-1,0;
	mobuseskill 'mob7,720,5,0,0,0,-1,0;
	sleep 1000;
	killmonster getmdmapname("1@mir.gat"),getmdnpcname("#�t���X�g�_�C�o�[")+"::OnKilled";
	end;
OnKilled:
	end;
}
1@mir.gat,2,0,0		script	#�ς�����	-1,{
OnStart:
	set '@mob_id,getvariableofnpc('bijou,getmdnpcname("#�r�W���E�Ǘ�2"));
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'@mob_id);
	mobuseskillpos '@mob_id,727,1,'@x,'@y,0,0;
	unittalk '@mob_id,"�r�W���E : �ς����ɂ�^���Ă�낤�B";
	sleep 1000;
	mobuseskillpos '@mob_id,483,1,'@x-6,'@y-3,0,0;
	mobuseskillpos '@mob_id,483,1,'@x-6,'@y+3,0,0;
	mobuseskillpos '@mob_id,483,1,'@x-3,'@y-6,0,0;
	mobuseskillpos '@mob_id,483,1,'@x-3,'@y,0,0;
	mobuseskillpos '@mob_id,483,1,'@x-3,'@y+6,0,0;
	mobuseskillpos '@mob_id,483,1,'@x,'@y-3,0,0;
	mobuseskillpos '@mob_id,483,1,'@x,'@y+3,0,0;
	mobuseskillpos '@mob_id,483,1,'@x+3,'@y+6,0,0;
	mobuseskillpos '@mob_id,483,1,'@x+3,'@y,0,0;
	mobuseskillpos '@mob_id,483,1,'@x+3,'@y-6,0,0;
	mobuseskillpos '@mob_id,483,1,'@x+6,'@y-3,0,0;
	mobuseskillpos '@mob_id,483,1,'@x+6,'@y+3,0,0;
	sleep 1000;
	unittalk '@mob_id,"�r�W���E : ���ˁI";
	mobuseskill '@mob_id,661,5,0,0,0,-1,0;
	end;
}

1@mir.gat,3,0,0		script	#�A���_���C�X	-1,{
OnStart:
	set '@mob_id,getvariableofnpc('bijou,getmdnpcname("#�r�W���E�Ǘ�2"));
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'@mob_id);
	unittalk '@mob_id,"�r�W���E : �A���_���C�X�I";
	areamonster getmdmapname("1@mir.gat"),80,59,90,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�A���_���C�X")+"::OnKilled";
	areamonster getmdmapname("1@mir.gat"),90,59,100,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�A���_���C�X")+"::OnKilled";
	areamonster getmdmapname("1@mir.gat"),100,59,110,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�A���_���C�X")+"::OnKilled";
	areamonster getmdmapname("1@mir.gat"),110,59,120,80,"�����̃A���_���C�X",3778,1,getmdnpcname("#�A���_���C�X")+"::OnKilled";
	initnpctimer;
	end;
OnTimer10000:
	killmonster getmdmapname("1@mir.gat"),getmdnpcname("#�A���_���C�X")+"::OnKilled";
	end;
OnKilled:
	end;
}

1@mir.gat,101,75,3	script	�p���t���A���_���C�X#03	3448,{}
1@mir.gat,101,75,0	script	#result	139,{}
1@mir.gat,101,79,0	script	#effect01	139,{}
1@mir.gat,101,81,3	script	�r�W���E#01	10143,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	mes "�]�Ւd�̑O�ɐl�e������]";
	next;
	mes "^ff0000�]���Ӂ]";
	mes "�@^ff0000�u��ɐi�ށv��I�񂾎��_��";
	mes "�@^ff0000���̃}�b�v�ɂ��Ȃ�";
	mes "�@^ff0000�p�[�e�B�[�����o�[��";
	mes "�@^ff0000��V���󂯎�邱�Ƃ��ł��܂���B^000000";
	next;
	mes "^ff0000�]���Ӂ]";
	mes "�@^ff0000���Ƀp�[�e�B�[�����o�[��";
	mes "�@^ff0000�����ꍇ�A�����o�[���������̂�";
	mes "�@^ff0000�m�F���Ă����ɐi��ł��������B^000000";
	next;
	mes "�]��ɐi�݂܂����H�]";
	next;
	if(select("�����҂�","��ɐi��")==1) {
		mes "�]���Ȃ��͗l�q�����邱�Ƃɂ����]";
		close;
	}
	cutin "bijou_01.bmp", 2;
	mes "[�r�W���E]";
	mes "�l�Ԃ��c�c";
	mes "���E�𒣂�������";
	mes "�O����͓���Ȃ��͂������c�c";
	mes "�ǂ�����Ē��ɓ����Ă����H";
	mes "�M�l�����~���̐S�����ړI���H";
	unittalk "�r�W���E : �l�Ԃ��c�c���E�𒣂�������O����͓���Ȃ��͂������c�c�ǂ�����Ē��ɓ����Ă����H�@�M�l�����~���̐S�����ړI���H";
	next;
	mes "[�r�W���E]";
	mes "�c�c�܂������B";
	mes "�������������܂ŗ����񂾁B";
	mes "�����V��ł����������B";
	unittalk "�r�W���E : �c�c�܂������B�������������܂ŗ����񂾁B�����V��ł����������B";
	next;
	mes "[�r�W���E]";
	mes "�q�������Y�l�̏j�����󂯂�";
	mes "���̕s���̌R�c�ƂȁI";
	unittalk "�r�W���E : �q�������Y�l�̏j�����󂯂����̕s���̌R�c�ƂȁI";
	close2;
	cutin "bijou_01.bmp", 255;
	if(!sleep2(1000)) end;
	hideonnpc getmdnpcname("�r�W���E#01");
	misceffect 90,getmdnpcname("#effect01");
	donpcevent getmdnpcname("Mir_Phase1")+ "::OnStart";
	end;
}

1@mir.gat,101,81,3	script	�r�W���E#02	10143,{
	cutin "bijou_01.bmp", 2;
	mes "[�r�W���E]";
	mes "�ӂӂӁc�c";
	mes "�l�Ԃ̂����Ɋ撣�邶��Ȃ����B";
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close2;
		cutin "bijou_01.bmp", 255;
		end;
	}
	unittalk "�r�W���E : �ӂӂӁc�c�l�Ԃ̂����Ɋ撣�邶��Ȃ����B";
	next;
	cutin "bijou_02.bmp", 2;
	mes "[�r�W���E]";
	mes "���Ⴀ����͂ǂ����H";
	mes "�����A�����オ��I�@���̂����ׂ�I";
	unittalk "�r�W���E : ���Ⴀ����͂ǂ����H�@�����A�����オ��I�@���̂����ׂ�I";
	misceffect 8,getmdnpcname("�p���t���A���_���C�X#03");
	if(!sleep2(2000)) end;
	misceffect 6,getmdnpcname("�p���t���A���_���C�X#03");
	hideoffnpc getmdnpcname("�p���t���A���_���C�X#03");
	if(!sleep2(1000)) end;
	misceffect 668,getmdnpcname("�p���t���A���_���C�X#03");
	next;
	cutin "bijou_01.bmp", 2;
	mes "[�r�W���E]";
	mes "���ʑO�ɋ����Ă�낤�B";
	mes "���̖��O�̓r�W���E�B";
	mes "12���@���L���[�A�q�������Y�l��";
	mes "�������΂߂Ă���B";
	unittalk "�r�W���E : ���ʑO�ɋ����Ă�낤�B���̖��O�̓r�W���E�B12���@���L���[�A�q�������Y�l�̕������΂߂Ă���B";
	next;
	mes "[�r�W���E]";
	mes "�����҂��Ă���B";
	mes "���~���̐S���̕��󂪉�������c�c";
	mes "�������瑊������Ă�낤�B";
	unittalk "�r�W���E : �����҂��Ă���B���~���̐S���̕��󂪉�������c�c�������瑊������Ă�낤�B";
	next;
	mes "[�r�W���E]";
	mes "�����Ƃ��c�c";
	mes "���O�����̎��܂�";
	mes "�A���_���C�X�𑊎��";
	mes "�����Ă���ꂽ��̘b�����ȁB";
	unittalk "�r�W���E : �����Ƃ��c�c���O�����̎��܂ŃA���_���C�X�𑊎�ɐ����Ă���ꂽ��̘b�����ȁB";
	close2;
	cutin "bijou_01.bmp", 255;
	hideonnpc getmdnpcname("�p���t���A���_���C�X#03");
	hideonnpc getmdnpcname("�r�W���E#02");
	hideoffnpc getmdnpcname("�r�W���E#00");
	donpcevent getmdnpcname("Mir_Phase2")+ "::OnStart";
	end;
}
1@mir.gat,101,81,3	script	�r�W���E#03	10143,{
	cutin "bijou_01.bmp", 2;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�r�W���E]";
		mes "�ӂӂӁc�c";
		mes "����ȂɊȒP�ɎE���͂��Ȃ��B";
		mes "3�N���̑㉿�c�c";
		mes "�x�����Ă��炤�Ƃ��悤���B";
		close2;
		cutin "bijou_01.bmp", 255;
		end;
	}
	mes "[�r�W���E]";
	mes "�ӊO��������B";
	mes "�ӂӂӁc�c";
	mes "�܂�������3�N�̌�����������";
	mes "�����������A���_���C�X��";
	mes "�|���Ƃ́c�c";
	unittalk "�r�W���E : �ӊO��������B�ӂӂӁc�c�܂�������3�N�̌����������Ċ����������A���_���C�X��|���Ƃ́c�c";
	next;
	mes "[�r�W���E]";
	mes "�ӂӂӁc�c";
	mes "����ȂɊȒP�ɎE���͂��Ȃ��B";
	mes "3�N���̑㉿�c�c";
	mes "�x�����Ă��炤�Ƃ��悤���B";
	unittalk "�r�W���E : �ӂӂӁc�c����ȂɊȒP�ɎE���͂��Ȃ��B3�N���̑㉿�c�c�x�����Ă��炤�Ƃ��悤���B";
	next;
	cutin "bijou_02.bmp", 2;
	mes "[�r�W���E]";
	mes "�������Ɓc�c";
	mes "�ő�̋�ɂłȂ��B";
	unittalk "�r�W���E : �������Ɓc�c�ő�̋�ɂłȂ��B";
	close2;
	cutin "bijou_02.bmp", 255;
	misceffect 383,getmdnpcname("�r�W���E#03");
	if(!sleep2(900)) end;
	misceffect 408,getmdnpcname("�r�W���E#03");
	if(!sleep2(1000)) end;
	misceffect 409,getmdnpcname("�r�W���E#03");
	hideonnpc getmdnpcname("�r�W���E#03");
	donpcevent getmdnpcname("#�r�W���E�Ǘ�")+ "::OnStart";
	end;
}
1@mir.gat,101,81,3	script	�r�W���E#ex	10143,{
	cutin "bijou_01.bmp", 2;
	if(getnpctimer(1,getmdnpcname("#�����̃A���_"))) {
		mes "[�r�W���E]";
		mes "�ӂӂӁc�c";
		mes "������Ƃ͗]�T���˂��H";
		close2;
		cutin "bijou_01.bmp", 255;
		end;
	}
	mes "[�r�W���E]";
	mes "�ӂӂӁc�c";
	mes "�\���Ɋy����ŖႦ�����ȁH";
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close2;
		cutin "bijou_01.bmp", 255;
		end;
	}
	unittalk "�r�W���E : �ӂӂӁc�c�\���Ɋy����ŖႦ�����ȁH";
	next;
	mes "[�r�W���E]";
	mes "���ꂶ��A";
	mes "���낻��I���ɂ��悤���B";
	unittalk "�r�W���E : ���ꂶ��A���낻��I���ɂ��悤���B";
	close2;
	cutin "bijou_01.bmp", 255;
	hideonnpc getmdnpcname("�r�W���E#ex");
	hideonnpc getmdnpcname("#mir_bgm01");
	hideoffnpc getmdnpcname("#mir_bgm02");
	areawarp getmdmapname("1@mir.gat"),0,0,200,200,getmdmapname("1@mir.gat"),100+rand(3),75+rand(3);
	donpcevent getmdnpcname("#�r�W���E�Ǘ�2")+ "::OnStart";
	end;
}

1@mir.gat,101,79,3	script	�r�W���E#04	10143,{
	cutin "bijou_03.bmp", 2;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�r�W���E]";
		mes "�o�A�o�J�Ȃ��I";
		mes "��������Ȃ�Ɂc�c�I";
		close2;
		cutin "bijou_03.bmp", 255;
		end;
	}
	mes "[�r�W���E]";
	mes "���c�c�I";
	unittalk "�r�W���E : ���c�c�I";
	next;
	mes "[�r�W���E]";
	mes "�o�A�o�J�Ȃ��I";
	mes "��������Ȃ�Ɂc�c�I";
	unittalk "�r�W���E : �o�A�o�J�Ȃ��I�@��������Ȃ�Ɂc�c�I";
	hideoffnpc getmdnpcname("�T��#04");
	next;
	cutin "sarah_hero3.bmp", 2;
	mes "[�T��]";
	mes "����ȂƂ����";
	mes "�������Ă���񂾁H";
	mes "�r�W���E�H";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : ����ȂƂ���ŉ������Ă���񂾁H�@�r�W���E�H";
	next;
	cutin "bijou_02.bmp", 2;
	mes "[�r�W���E]";
	mes "�T�c���c�l!?";
	unittalk "�r�W���E : �T�c���c�l!?";
	next;
	cutin "sarah_hero3.bmp", 2;
	mes "[�T��]";
	mes "���̂��O�͂���ȂƂ����";
	mes "���𔄂��Ă���H";
	mes "���~���̐S���͂ǂ������H";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : ���̂��O�͂���ȂƂ���Ŗ��𔄂��Ă���H�@���~���̐S���͂ǂ������H";
	next;
	cutin "bijou_02.bmp", 2;
	mes "[�r�W���E]";
	mes "���c�c���ꂪ�c�c�B";
	unittalk "�r�W���E : ���c�c���ꂪ�c�c�B";
	next;
	mes "[�r�W���E]";
	mes "���c�c�����͂����ɕЕt���܂��B";
	mes "�킴�킴�T���l������������";
	mes "�K�v�Ȃǁc�c�B";
	unittalk "�r�W���E : ���c�c�����͂����ɕЕt���܂��B�킴�킴�T���l������������K�v�Ȃǁc�c�B";
	next;
	misceffect 565;
	if(!sleep2(1000)) end;
	cutin "bijou_03.bmp", 2;
	mes "[�r�W���E]";
	mes "�T�c�c�T���l�H";
	mes "�c�c�ǂ�����!?";
	unittalk "�r�W���E : �T�c�c�T���l�H�@�c�c�ǂ�����!?";
	next;
	cutin "bijou_death.bmp", 4;
	mes "[�T��]";
	mes "���S���ȁB";
	mes "�q�������Y�ɂ͎�����";
	mes "�悭�����Ă�����B";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : ���S���ȁB�q�������Y�ɂ͎�����悭�����Ă�����B";
	next;
	mes "[�r�W���E]";
	mes "���c�c";
	mes "������!!";
	mes "���c�c����ȁc�c!!";
	unittalk "�r�W���E : ���c�c������!!�@���c�c����ȁc�c!!";
	next;
	misceffect 567;
	if(!sleep2(1000)) end;
	hideonnpc;
	hideonnpc getmdnpcname("���E#00");
	hideonnpc getmdnpcname("���E#01");
	hideonnpc getmdnpcname("���E#02");
	hideonnpc getmdnpcname("���E#03");
	hideonnpc getmdnpcname("���E#04");
	hideonnpc getmdnpcname("���E#05");
	hideonnpc getmdnpcname("���E#06");
	hideonnpc getmdnpcname("���E#07");
	hideonnpc getmdnpcname("���E#08");
	hideonnpc getmdnpcname("���E#09");
	hideonnpc getmdnpcname("���E#10");
	set getvariableofnpc('cell,getmdnpcname("Mir_Contorl")), 0;
	areasetcell getmdmapname("1@mir.gat"),88,52,115,53,0;
	areasetcell getmdmapname("1@mir.gat"),78,83,125,84,0;
	cutin "sarah_hero3.bmp", 2;
	mes "[�T��]";
	mes "�c�c���O�̍��͂������R���B";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : �c�c���O�̍��͂������R���B";
	next;
	mes "[�T��]";
	mes "�c�c�B";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : �c�c�B";
	next;
	mes "[�T��]";
	mes "���������~���̐S����";
	mes "����Ă������B";
	mes "�ז������Ȃ���Ό������Ă��B";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : ���������~���̐S���͖���Ă������B�ז������Ȃ���Ό������Ă��B";
	next;
	mes "[�T��]";
	mes "�͂������������I";
	unittalk getnpcid(0,getmdnpcname("�T��#04")),"�T�� : �͂������������I";
	next;
	misceffect 90;
	if(!sleep2(2000)) end;
	cutin "sarah_hero3.bmp", 255;
	hideonnpc getmdnpcname("�T��#04");
	mes "�]�T���͓V���j�󂵂�";
	mes "�@���~���̐S����";
	mes "�@���������Ă��܂����]";
	unittalk getcharid(3),""+strcharinfo(0)+" : �]�T���͓V���j�󂵂ă��~���̐S�������������Ă��܂����]";
	next;
	misceffect 92;
	if(!sleep2(1000)) end;
	misceffect 92,getmdnpcname("�T��#04");
	mes "�]���̂܂܂����ɋ��Ă͊댯���B";
	mes "�@���E�����������̕�������";
	mes "�@�����E�o���悤�]";
	unittalk getcharid(3),""+strcharinfo(0)+" : �]���̂܂܂����ɋ��Ă͊댯���B���E�����������̕������瑁���E�o���悤�]";
	close;
}
1@mir.gat,101,81,3	script	�T��#04		10066,{}

1@mir.gat,101,81,0	script	#mir_bgm01	139,16,16,{
OnTouch:
	musiceffect "108";
	end;
}
1@mir.gat,101,81,0	script	#mir_bgm02	139,16,16,{
OnTouch:
	musiceffect "166";
	end;
}

1@mir.gat,101,88,3	script	�r�W���E#00	10143,{}

1@mir.gat,101,8,0	warp	#mir_exit_00	2,2,prt_lib_q.gat,88,83

1@mir.gat,78,83,3	script	���E#00	1914,{}
1@mir.gat,85,83,3	script	���E#01	1914,{}
1@mir.gat,93,83,3	script	���E#02	1914,{}
1@mir.gat,101,83,3	script	���E#03	1914,{}
1@mir.gat,110,83,3	script	���E#04	1914,{}
1@mir.gat,118,83,3	script	���E#05	1914,{}
1@mir.gat,96,53,3	script	���E#06	1914,{}
1@mir.gat,107,53,3	script	���E#07	1914,{}
1@mir.gat,125,83,3	script	���E#08	1914,{}
1@mir.gat,88,53,3	script	���E#09	1914,{}
1@mir.gat,115,53,3	script	���E#10	1914,{}