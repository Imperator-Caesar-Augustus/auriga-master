prt_q.gat,250,61,0	script	�v�����e�����m#a1	105,{
	if(!(checkquest(9418) & 0x8)) {
		mes "[�v�����e�����m]";
		mes "�܂����v�����e��������Ȏ��Ԃ�";
		mes "�ׂ��������Ȃ�āc�c�B";
		next;
		mes "[�v�����e�����m]";
		mes "����Ȃ��̗v�ǂ̂�����";
		mes "�v�����e���͍��A";
		mes "��ςȎ��ԂɌ������Ă��܂��B";
		mes "�v�Ǔ����玟�X��";
		mes "�A���f�b�h�����X�^�[��";
		mes "����Ă���̂ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�����炭�A�v�ǂ̒���";
		mes "���X�ƐV���������X�^�[��";
		mes "����Ă���̂ł��傤�c�c�B";
		mes "���̂܂܂ł̓v�����e����";
		mes "�����X�^�[�Ŗ��ߐs�������";
		mes "���܂��܂��B";
		next;
		mes "[�v�����e�����m]";
		mes "�����ł������X�^�[�����炷���߁A";
		mes "�v�Ǔ��֓˓����āA";
		mes "�����X�^�[�𓢔����Ă����";
		mes "�`���҂������ŕ���Ă���̂ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�댯�����m�ŋ��͂��Ă��炨����";
		mes "�����̂ł��B";
		mes "������񂻂�Ȃ�̕�V��";
		mes "���n�����܂��B";
		next;
		if(select("���͂���","���̏������")==2) {
			mes "[�v�����e�����m]";
			mes "�����͊댯�ł��B";
			mes "���������̒���";
			mes "���Ă��������B";
			close;
		}
		mes "[�v�����e�����m]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "���Ȃ��̂悤�Ȗ`���҂�";
		mes "���Ă���Ė{���ɗǂ������B";
		next;
		mes "[�v�����e�����m]";
		mes "��ɐN�����������̘b�ł́A";
		mes "�v�Ǔ��͈�{���ł�����ʂ�";
		mes "�����X�^�[�ň�ꂩ�����Ă���A";
		mes "�ŉ����ɂ͎w�����炵�������X�^�[��";
		mes "�����Ƃ̂��Ƃł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�܂��r���ɕ���������������A";
		mes "�����������X�^�[���炯�Ȃ̂ł����A";
		mes "�������̕����ɂ͗��̂悤�ȕ���";
		mes "�����������ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�����������炻�̕����̒���";
		mes "�V���ȃ����X�^�[��";
		mes "����Ă���̂�������܂���B";
		next;
		mes "[�v�����e�����m]";
		mes "�w�����炵�������X�^�[��|���̂�";
		mes "�ŗD��ł����A�\�ł�����";
		mes "�����̒��̃����X�^�[��";
		mes "�|���Ă����Ă��������B";
		mes "�e�����̃����X�^�[��S�ē|�����Ƃ�";
		mes "�ǉ��̕�V�����n�����܂��B";
		next;
		mes "[�v�����e�����m]";
		mes "�������o�����玄��";
		mes "���������Ă��������B";
		mes "�v�Ǔ��͔��Ɋ댯�ł��B";
		mes "���S�̑����Œ���ł��������B";
		setquest 9418;
		compquest 9418;
		close;
	}
	if(getonlinepartymember() < 1 || getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�v�����e�����m]";
		mes "���̗v�ǂ͊댯�ł��I";
		mes "�v�Ǔ��ɏ�荞�ނƂ����Ȃ�A";
		mes "�p�[�e�B�[���[�_�[�̕���";
		mes "���b���������Ă��炦�܂����H";
		close;
	}
	if(checkquest(9419)) {
		if(checkquest(9419) & 0x2 && checkquest(73061) & 0x2) {
			delquest 9419;
			delquest 73059;
			if(checkquest(73060) & 0x8) {
				setquest 73060;
				delquest 73060;
			}
			delquest 73061;
		} else {
			mes "[�v�����e�����m]";
			mes "�܂��˓�����̂ł���!?";
			mes "���C�����͂��肪�����ł����A";
			mes "���܂薳���͂��Ȃ��ł��������B";
			next;
			mes "[�v�����e�����m]";
			mes "�����ł��ˁc�c�Œ�ł�";
			mes "^ff0000���̌ߑO5��^000000���߂���܂ł�";
			mes "�҂��Ă��������B";
			mes "�܂��A^ff0000�Ō�ɓ��ꂵ�Ă���1����^000000��";
			mes "�x�܂Ȃ���΋��͏o���܂���B";
			close;
		}
	}
	if(checkquest(9427) & 0x8) {
		mes "[�v�����e�����m]";
		mes "�����X�^�[�̑����鐨����";
		mes "�����Ă��܂����B";
		mes "�܂��󒆗v�ǂɍs���Ă���܂����H";
	} else {
		mes "[�v�����e�����m]";
		mes "�v�ǂɓ˓����鏀���͂����ł����H";
	}
	next;
	switch(select("�󒆗v�ǂɓ˓�����","�󒆗v�ǂ̐����𕷂�","�܂��������o���Ă��Ȃ�")) {
	case 1:
		mes "[�v�����e�����m]";
		mes "����ł͗v�ǂ̓��������ē����܂��B";
		mes "�������J������v�Ǔ���";
		mes "�˓����Ă��������B";
		close2;
		mdcreate "aerial_fortress";
		end;
	case 2:
		mes "[�v�����e�����m]";
		mes "��ɐN�����������̘b�ł́A";
		mes "�v�Ǔ��͈�{���ł�����ʂ�";
		mes "�����X�^�[�ň�ꂩ�����Ă���A";
		mes "�ŉ����ɂ͎w�����炵�������X�^�[��";
		mes "�����Ƃ̂��Ƃł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�܂��r���ɕ���������������A";
		mes "�����������X�^�[���炯�Ȃ̂ł����A";
		mes "�������̕����ɂ͗��̂悤�ȕ���";
		mes "�����������ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�����������炻�̕����̒���";
		mes "�V���ȃ����X�^�[��";
		mes "����Ă���̂�������܂���B";
		next;
		mes "[�v�����e�����m]";
		mes "�w�����炵�������X�^�[��|���̂�";
		mes "�ŗD��ł����A�\�ł�����";
		mes "�����̒��̃����X�^�[��";
		mes "�|���Ă����Ă��������B";
		mes "^ff0000�e�����̃����X�^�[��S�ē|�����Ƃ�";
		mes "^ff0000�ǉ��̕�V^000000�����n�����܂��B";
		next;
	case 3:
		mes "[�v�����e�����m]";
		mes "�������o�����玄��";
		mes "���������Ă��������B";
		mes "�v�Ǔ��͔��Ɋ댯�ł��B";
		mes "���S�̑����Œ���ł��������B";
		close;
	}
}

prt_q.gat,259,57,0	script	#aerial_fortress	45,3,3,{
OnTouch:
	if(checkquest(9419)) {
		if(checkquest(9419) & 0x2 && checkquest(73061) & 0x2) {
			delquest 9419;
			delquest 73059;
			if(checkquest(73060) & 0x8) {
				setquest 73060;
				delquest 73060;
			}
			delquest 73061;
		} else {
			mes "[�v�����e�����m]";
			mes "�܂��˓�����̂ł���!?";
			mes "���C�����͂��肪�����ł����A";
			mes "���܂薳���͂��Ȃ��ł��������B";
			next;
			mes "[�v�����e�����m]";
			mes "�����ł��ˁc�c�Œ�ł�";
			mes "^ff0000���̌ߑO5��^000000���߂���܂ł�";
			mes "�҂��Ă��������B";
			mes "�܂��A^ff0000�Ō�ɓ��ꂵ�Ă���1����^000000��";
			mes "�x�܂Ȃ���΋��͏o���܂���B";
			close;
		}
	}
	mes "�]�󒆗v�ǂɓ˓����܂����H�]";
	next;
	if(select("�˓�����","�������Ȃ���") == 2) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	switch(mdenter("aerial_fortress")) {
	case 0:		// �G���[�Ȃ�
		announce "�������A���_���W����[aerial_fortress] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9419;
		setquest 73059;
		setquest 73061;
		donpcevent getmdnpcname("�v�����e�����m#01")+ "::OnStart";
		close;
	case 1:		// �p�[�e�B�[������
		mes "�]�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
		mes "�@�������A���_���W�����ɓ���܂��]";
		close;
	case 2:		// �_���W�������쐬
		mes "�]�������A���_���W����";
		mes "�@aerial_fortress�����݂��܂���B";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@�������Ă��Ȃ���Ԃł��]";
		close;
	default:	// ���̑��G���[
		close;
	}
}

// warp
1@sthb.gat,34,86,0	warp	#sthd_move_02_a2_1	2,2,1@sthc.gat,66,96
1@sthb.gat,84,99,0	warp	#sthd_move_02_b2_1	2,2,1@sthc.gat,116,96
1@sthb.gat,24,40,0	warp	#sthd_move_02_c2_1	2,2,1@sthc.gat,16,13
1@sthb.gat,206,80,0	warp	#sthd_move_02_d2_1	2,2,1@sthc.gat,66,14
1@sthb.gat,147,86,0	warp	#sthd_move_02_e2_1	2,2,1@sthc.gat,115,14
1@sthb.gat,179,51,0	warp	#sthd_move_02_f2_1	2,2,1@sthc.gat,15,96

1@sthb.gat,93,77,0	warp	#sthd_move_02_01	2,2,1@sthb.gat,210,96
1@sthb.gat,190,54,0	warp	#sthd_move_02_02	2,2,1@sthd.gat,103,71

1@sthc.gat,66,88,0	warp	#roomback1	2,2,1@sthb.gat,39,85
1@sthc.gat,116,88,0	warp	#roomback2	2,2,1@sthb.gat,83,95
1@sthc.gat,16,6,0	warp	#roomback3	2,2,1@sthb.gat,28,39
1@sthc.gat,66,6,0	warp	#roomback4	2,2,1@sthb.gat,210,79
1@sthc.gat,115,6,0	warp	#roomback5	2,2,1@sthb.gat,143,87
1@sthc.gat,15,88,0	warp	#roomback6	2,2,1@sthb.gat,179,47

1@sthb.gat,34,81,6	script	#barricade1-1-1	1905,{}
1@sthb.gat,35,81,6	script	#barricade1-1-2	1905,{}
1@sthb.gat,36,81,6	script	#barricade1-1-3	1905,{}
1@sthb.gat,37,81,6	script	#barricade1-1-4	1905,{}
1@sthb.gat,38,81,6	script	#barricade1-1-5	1905,{}
1@sthb.gat,39,81,6	script	#barricade1-1-6	1905,{}
1@sthb.gat,40,81,6	script	#barricade1-1-7	1905,{}
1@sthb.gat,41,81,6	script	#barricade1-1-8	1905,{}

1@sthb.gat,79,92,6	script	#barricade1-2-1	1905,{}
1@sthb.gat,79,93,6	script	#barricade1-2-2	1905,{}
1@sthb.gat,79,94,6	script	#barricade1-2-3	1905,{}
1@sthb.gat,79,95,6	script	#barricade1-2-4	1905,{}
1@sthb.gat,79,96,6	script	#barricade1-2-5	1905,{}
1@sthb.gat,79,97,6	script	#barricade1-2-6	1905,{}
1@sthb.gat,79,98,6	script	#barricade1-2-7	1905,{}
1@sthb.gat,79,99,6	script	#barricade1-2-8	1905,{}

1@sthb.gat,32,36,6	script	#barricade1-3-1	1905,{}
1@sthb.gat,32,37,6	script	#barricade1-3-2	1905,{}
1@sthb.gat,32,38,6	script	#barricade1-3-3	1905,{}
1@sthb.gat,32,39,6	script	#barricade1-3-4	1905,{}
1@sthb.gat,32,40,6	script	#barricade1-3-5	1905,{}
1@sthb.gat,32,41,6	script	#barricade1-3-6	1905,{}
1@sthb.gat,32,42,6	script	#barricade1-3-7	1905,{}
1@sthb.gat,32,43,6	script	#barricade1-3-8	1905,{}

1@sthb.gat,90,72,6	script	#barricade1-4-1	1905,{}
1@sthb.gat,91,72,6	script	#barricade1-4-2	1905,{}
1@sthb.gat,92,72,6	script	#barricade1-4-3	1905,{}
1@sthb.gat,93,72,6	script	#barricade1-4-4	1905,{}
1@sthb.gat,94,72,6	script	#barricade1-4-5	1905,{}
1@sthb.gat,95,72,6	script	#barricade1-4-6	1905,{}
1@sthb.gat,96,72,6	script	#barricade1-4-7	1905,{}
1@sthb.gat,97,72,6	script	#barricade1-4-8	1905,{}

1@sthb.gat,206,43,6	script	#barricade2-1-1	1905,{}
1@sthb.gat,207,43,6	script	#barricade2-1-2	1905,{}
1@sthb.gat,208,43,6	script	#barricade2-1-3	1905,{}
1@sthb.gat,209,43,6	script	#barricade2-1-4	1905,{}
1@sthb.gat,210,43,6	script	#barricade2-1-5	1905,{}
1@sthb.gat,211,43,6	script	#barricade2-1-6	1905,{}
1@sthb.gat,212,43,6	script	#barricade2-1-7	1905,{}
1@sthb.gat,213,43,6	script	#barricade2-1-8	1905,{}

1@sthb.gat,148,34,6	script	#barricade2-2-1	1905,{}
1@sthb.gat,148,35,6	script	#barricade2-2-2	1905,{}
1@sthb.gat,148,36,6	script	#barricade2-2-3	1905,{}
1@sthb.gat,148,37,6	script	#barricade2-2-4	1905,{}
1@sthb.gat,148,38,6	script	#barricade2-2-5	1905,{}
1@sthb.gat,148,39,6	script	#barricade2-2-6	1905,{}
1@sthb.gat,148,40,6	script	#barricade2-2-7	1905,{}
1@sthb.gat,148,41,6	script	#barricade2-2-8	1905,{}

1@sthb.gat,140,89,6	script	#barricade2-3-1	1905,{}
1@sthb.gat,141,89,6	script	#barricade2-3-2	1905,{}
1@sthb.gat,142,89,6	script	#barricade2-3-3	1905,{}
1@sthb.gat,143,89,6	script	#barricade2-3-4	1905,{}
1@sthb.gat,144,89,6	script	#barricade2-3-5	1905,{}
1@sthb.gat,145,89,6	script	#barricade2-3-6	1905,{}
1@sthb.gat,146,89,6	script	#barricade2-3-7	1905,{}
1@sthb.gat,147,89,6	script	#barricade2-3-8	1905,{}

1@sthb.gat,195,90,6	script	#barricade2-4-1	1905,{}
1@sthb.gat,195,91,6	script	#barricade2-4-2	1905,{}
1@sthb.gat,195,92,6	script	#barricade2-4-3	1905,{}
1@sthb.gat,195,93,6	script	#barricade2-4-4	1905,{}
1@sthb.gat,195,94,6	script	#barricade2-4-5	1905,{}
1@sthb.gat,195,95,6	script	#barricade2-4-6	1905,{}
1@sthb.gat,195,96,6	script	#barricade2-4-7	1905,{}
1@sthb.gat,195,97,6	script	#barricade2-4-8	1905,{}

1@sthb.gat,188,44,6	script	#barricade2-5-1		1905,{}
1@sthb.gat,188,45,6	script	#barricade2-5-2		1905,{}
1@sthb.gat,188,46,6	script	#barricade2-5-3		1905,{}
1@sthb.gat,188,47,6	script	#barricade2-5-4		1905,{}
1@sthb.gat,188,48,6	script	#barricade2-5-5		1905,{}
1@sthb.gat,188,49,6	script	#barricade2-5-6		1905,{}
1@sthb.gat,188,50,6	script	#barricade2-5-7		1905,{}
1@sthb.gat,188,51,6	script	#barricade2-5-8		1905,{}
1@sthb.gat,173,44,6	script	#barricade2-5-9		1905,{}
1@sthb.gat,173,45,6	script	#barricade2-5-10	1905,{}
1@sthb.gat,173,46,6	script	#barricade2-5-11	1905,{}
1@sthb.gat,173,47,6	script	#barricade2-5-12	1905,{}
1@sthb.gat,173,48,6	script	#barricade2-5-13	1905,{}
1@sthb.gat,173,49,6	script	#barricade2-5-14	1905,{}
1@sthb.gat,173,50,6	script	#barricade2-5-15	1905,{}
1@sthb.gat,173,51,6	script	#barricade2-5-16	1905,{}

1@sthb.gat,0,0,0	script	#aerial_start		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	areamonster '@map$,196,44,203,97,"�s���̃]���r",3476,5;
	areamonster '@map$,196,44,203,97,"�s���̃]���r�}�X�^�[",3479,4;
	areamonster '@map$,196,44,203,97,"�s���̃��M�b�h�]���r",3480,3;
	areamonster '@map$,150,44,157,87,"�s���̃]���r",3476,5;
	areamonster '@map$,150,44,157,87,"�s���̗v�Ǖ�",3477,1;
	areamonster '@map$,150,44,157,87,"�s���̃]���r�}�X�^�[",3479,4;
	areamonster '@map$,150,44,157,87,"�s���̃��M�b�h�]���r",3480,3;
	areamonster '@map$,158,80,193,87,"�s���̃]���r",3476,4;
	areamonster '@map$,158,80,193,87,"�s���̗v�Ǖ�",3477,1;
	areamonster '@map$,158,80,193,87,"�s���̃]���r�}�X�^�[",3479,4;
	areamonster '@map$,158,80,193,87,"�s���̃��M�b�h�]���r",3480,4;
	areamonster '@map$,186,64,193,80,"�s���̃]���r",3476,2;
	areamonster '@map$,186,64,193,80,"�s���̃��M�b�h�]���r",3480,2;
	while(1) {
		areasetcell '@map$,70,72,77,73,0;
		sleep 3000;
	}
	end;
}

1@sthb.gat,1,0,0	script	#barricade1-1_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade1-1_sub")+"::OnKilled";
	areamonster '@map$,36,82,51,89,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,36,82,51,89,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,36,82,51,89,"�s���̃]���r�}�X�^�[",3479,2,'@label$;
	areamonster '@map$,36,82,51,89,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),34,80,41,81,'flag,0;
		sleep 3000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade1-1-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade1-1-2");
	misceffect 106,getmdnpcname("#barricade1-1-2");
	misceffect 585,getmdnpcname("#barricade1-1-6");
	misceffect 106,getmdnpcname("#barricade1-1-6");
	end;
}

1@sthb.gat,2,0,0	script	#barricade1-2_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade1-2_sub")+"::OnKilled";
	areamonster '@map$,80,46,87,99,"�s���̃]���r",3476,7,'@label$;
	areamonster '@map$,80,46,87,99,"�s���̗v�Ǖ�",3477,2,'@label$;
	areamonster '@map$,80,46,87,99,"�s���̃]���r�}�X�^�[",3479,5,'@label$;
	areamonster '@map$,80,46,87,99,"�s���̃��M�b�h�]���r",3480,5,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),78,92,79,99,'flag,0;
		sleep 3000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade1-2-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade1-2-2");
	misceffect 106,getmdnpcname("#barricade1-2-2");
	misceffect 585,getmdnpcname("#barricade1-2-6");
	misceffect 106,getmdnpcname("#barricade1-2-6");
	end;
}

1@sthb.gat,3,0,0	script	#barricade1-3_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade1-3_sub")+"::OnKilled";
	areamonster '@map$,24,36,31,99,"�s���̃]���r",3476,4,'@label$;
	areamonster '@map$,24,36,31,99,"�s���̗v�Ǖ�",3477,2,'@label$;
	areamonster '@map$,24,36,31,99,"�s���̃]���r�}�X�^�[",3479,5,'@label$;
	areamonster '@map$,24,36,31,99,"�s���̃��M�b�h�]���r",3480,8,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),32,36,33,43,'flag,0;
		sleep 3000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade1-3-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade1-3-2");
	misceffect 106,getmdnpcname("#barricade1-3-2");
	misceffect 585,getmdnpcname("#barricade1-3-6");
	misceffect 106,getmdnpcname("#barricade1-3-6");
	end;
}

1@sthb.gat,4,0,0	script	#barricade1-4_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade1-4_sub")+"::OnKilled";
	areamonster '@map$,34,36,97,43,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,34,36,97,43,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,34,36,97,43,"�s���̃]���r�}�X�^�[",3479,3,'@label$;
	areamonster '@map$,34,36,97,43,"�s���̃��M�b�h�]���r",3480,2,'@label$;
	areamonster '@map$,90,45,97,71,"�s���̃]���r",3476,5,'@label$;
	areamonster '@map$,90,45,97,71,"�s���̗v�Ǖ�",3477,2,'@label$;
	areamonster '@map$,90,45,97,71,"�s���̃]���r�}�X�^�[",3479,5,'@label$;
	areamonster '@map$,90,45,97,71,"�s���̃��M�b�h�]���r",3480,4,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),90,72,97,73,'flag,0;
		sleep 3000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade1-4-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade1-4-2");
	misceffect 106,getmdnpcname("#barricade1-4-2");
	misceffect 585,getmdnpcname("#barricade1-4-6");
	misceffect 106,getmdnpcname("#barricade1-4-6");
	end;
}

1@sthb.gat,2,1,0	script	#barricade2-1_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled";
	monster '@map$,208,90,"�s���̃]���r",3476,1,'@label$;
	monster '@map$,210,90,"�s���̃]���r",3476,1,'@label$;
	monster '@map$,211,90,"�s���̃]���r",3476,1,'@label$;
	monster '@map$,209,87,"�s���̃]���r�}�X�^�[",3479,1,'@label$;
	monster '@map$,210,88,"�s���̃]���r�}�X�^�[",3479,1,'@label$;
	monster '@map$,211,88,"�s���̃]���r�}�X�^�[",3479,1,'@label$;
	monster '@map$,207,85,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	monster '@map$,206,85,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$) + 44;
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),206,42,213,43,'flag,0;
		sleep 3000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade2-1-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-1-2");
	misceffect 106,getmdnpcname("#barricade2-1-2");
	misceffect 585,getmdnpcname("#barricade2-1-6");
	misceffect 106,getmdnpcname("#barricade2-1-6");
	end;
OnSummon:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled1";
	areamonster '@map$,207,46,211,53,"�s���̃]���r",3476,8,'@label$;
	monster '@map$,207,46,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	monster '@map$,207,54,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	monster '@map$,211,46,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	monster '@map$,211,54,"�s���̃��M�b�h�]���r",3480,1,'@label$;
	set 'count1,getmapmobs('@map$,'@label$);
	end;
OnKilled1:
	set 'count1,'count1-1;
	set 'count,'count-1;
	if('count1 > 0)
		end;
	sleep 1000;
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled2";
	areamonster '@map$,207,46,211,53,"�s���̃]���r",3476,8,'@label$;
	set 'count2,getmapmobs('@map$,'@label$);
	end;
OnKilled2:
	set 'count2,'count2-1;
	set 'count,'count-1;
	if('count2 > 0)
		end;
	sleep 1000;
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled3";
	areamonster '@map$,207,46,211,53,"�s���̃]���r",3476,8,'@label$;
	set 'count3,getmapmobs('@map$,'@label$);
	end;
OnKilled3:
	set 'count3,'count3-1;
	set 'count,'count-1;
	if('count3 > 0)
		end;
	sleep 1000;
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled4";
	areamonster '@map$,207,46,211,53,"�s���̃]���r",3476,8,'@label$;
	set 'count4,getmapmobs('@map$,'@label$);
	end;
OnKilled4:
	set 'count4,'count4-1;
	set 'count,'count-1;
	if('count4 > 0)
		end;
	sleep 1000;
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-1_sub")+"::OnKilled5";
	areamonster '@map$,207,46,211,53,"�s���̃]���r",3476,8,'@label$;
	set 'count5,getmapmobs('@map$,'@label$);
	end;
OnKilled5:
	set 'count5,'count5-1;
	set 'count,'count-1;
	if('count > 0)
		end;
	if('count5 > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade2-1-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-1-2");
	misceffect 106,getmdnpcname("#barricade2-1-2");
	misceffect 585,getmdnpcname("#barricade2-1-6");
	misceffect 106,getmdnpcname("#barricade2-1-6");
	end;
}

1@sthb.gat,210,44,0	script	#mobpop2_1	139,5,5,{
OnTouch:
	hideonnpc;
	donpcevent getmdnpcname("#barricade2-1_sub")+ "::OnSummon";
	end;
}
1@sthb.gat,210,43,0	script	#mobpop2_1_ex	139,{}

1@sthb.gat,2,2,0	script	#barricade2-2_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-2_sub")+"::OnKilled";
	areamonster '@map$,150,34,213,41,"�s���̃]���r",3476,48,'@label$;
	areamonster '@map$,150,34,213,41,"�s���̃]���r�}�X�^�[",3479,48,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),148,34,149,41,'flag,0;
		sleep 1000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade2-2-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-2-2");
	misceffect 106,getmdnpcname("#barricade2-2-2");
	misceffect 585,getmdnpcname("#barricade2-2-6");
	misceffect 106,getmdnpcname("#barricade2-2-6");
	end;
}

1@sthb.gat,2,3,0	script	#barricade2-3_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-3_sub")+"::OnKilled";
	areamonster '@map$,140,38,147,87,"�s���̃]���r�X���[�^�[",3478,28,'@label$;
	areamonster '@map$,140,38,147,87,"�s���̃��M�b�h�]���r",3480,5,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),140,89,147,90,'flag,0;
		sleep 1000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade2-3-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-3-2");
	misceffect 106,getmdnpcname("#barricade2-3-2");
	misceffect 585,getmdnpcname("#barricade2-3-6");
	misceffect 106,getmdnpcname("#barricade2-3-6");
	end;
}

1@sthb.gat,2,4,0	script	#barricade2-4_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-4_sub")+"::OnKilled";
	areamonster '@map$,147,90,194,97,"�s���̗v�Ǖ�",3477,6,'@label$;
	areamonster '@map$,147,90,194,97,"�s���̃]���r�X���[�^�[",3478,12,'@label$;
	areamonster '@map$,147,90,194,97,"�s���̃]���r�}�X�^�[",3479,12,'@label$;
	areamonster '@map$,147,90,194,97,"�s���̃��M�b�h�]���r",3480,5,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	while(1) {
		areasetcell getmdmapname("1@sthb.gat"),195,90,196,97,'flag,0;
		sleep 1000;
	}
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@name$,"#barricade2-4-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-4-2");
	misceffect 106,getmdnpcname("#barricade2-4-2");
	misceffect 585,getmdnpcname("#barricade2-4-6");
	misceffect 106,getmdnpcname("#barricade2-4-6");
	end;
}

1@sthb.gat,2,5,0	script	#barricade2-5_sub		-1,{
OnStart:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-5_sub")+"::OnKilled";
	areamonster '@map$,177,49,181,51,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�X���[�^�[",3478,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�}�X�^�[",3479,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃��M�b�h�]���r",3480,2,'@label$;
	set 'count,36;
	set 'flag,1;
	for(set '@i,1; '@i <= 16; set '@i,'@i+1) {
		set '@name$,"#barricade2-5-"+ '@i;
		hideoffnpc getmdnpcname('@name$);
	}
	initnpctimer;
	while(1) {
		areasetcell '@map$,188,44,189,51,'flag,0;
		areasetcell '@map$,173,44,174,51,'flag,0;
		sleep 3000;
	}
	end;
OnTimer2000:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-5_sub")+"::OnKilled";
	areamonster '@map$,177,49,181,51,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�X���[�^�[",3478,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�}�X�^�[",3479,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃��M�b�h�]���r",3480,2,'@label$;
	end;
OnTimer4000:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-5_sub")+"::OnKilled";
	areamonster '@map$,177,49,181,51,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�X���[�^�[",3478,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�}�X�^�[",3479,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃��M�b�h�]���r",3480,2,'@label$;
	end;
OnTimer6000:
	set '@map$,getmdmapname("1@sthb.gat");
	set '@label$,getmdnpcname("#barricade2-5_sub")+"::OnKilled";
	areamonster '@map$,177,49,181,51,"�s���̃]���r",3476,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̗v�Ǖ�",3477,1,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�X���[�^�[",3478,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃]���r�}�X�^�[",3479,2,'@label$;
	areamonster '@map$,177,49,181,51,"�s���̃��M�b�h�]���r",3480,2,'@label$;
	end;
OnTimer80000:
	stopnpctimer;
	set 'count,0;
OnKilled:
	if('flag == 0)
		end;
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'flag,0;
	stopnpctimer getmdnpcname("#trap01");
	for(set '@i,1; '@i <= 16; set '@i,'@i+1) {
		set '@name$,"#barricade2-5-"+ '@i;
		hideonnpc getmdnpcname('@name$);
	}
	misceffect 585,getmdnpcname("#barricade2-5-2");
	misceffect 106,getmdnpcname("#barricade2-5-2");
	misceffect 585,getmdnpcname("#barricade2-5-6");
	misceffect 106,getmdnpcname("#barricade2-5-6");
	misceffect 585,getmdnpcname("#barricade2-5-10");
	misceffect 106,getmdnpcname("#barricade2-5-10");
	misceffect 585,getmdnpcname("#barricade2-5-14");
	misceffect 106,getmdnpcname("#barricade2-5-14");
	end;
}

1@sthb.gat,56,69,3	script	�v�����e�����m#01	105,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�v�����e�����m]";
		mes "�����N�����邱�Ƃ�";
		mes "�ł����悤�ł��ˁB";
		mes "�p�[�e�B�[�̃��[�_�[��";
		mes "�ǂȂ��ł����H";
		close;
	}
	mes "[�v�����e�����m]";
	mes "�����N�����邱�Ƃ�";
	mes "�ł����悤�ł��ˁB";
	mes "���̗v�ǂɂ��āA";
	mes "��X���m���Ă������";
	mes "���������܂��傤�B";
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �����N�����邱�Ƃ��ł����悤�ł��ˁB���̗v�ǂɂ��āA��X���m���Ă���������������܂��傤�B";
	next;
	if(select("�����Ă��炤","�����܂ł��Ȃ�")==2) {
		mes "[�v�����e�����m]";
		mes "�����c�c";
		mes "�Ȃ�Ǝ��M�ɖ�����ꂽ���t�B";
		mes "�����͂��C�����܂���I";
		unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �����c�c�Ȃ�Ǝ��M�ɖ�����ꂽ���t�B�����͂��C�����܂���I";
		close2;
	} else {
		mes "[�v�����e�����m]";
		mes "���̗v�ǂ���葱���A";
		mes "�ŏ�K��ڎw���Ă��������B";
		mes "�Ƃ���ǂ���ɓ����ǂ�";
		mes "�o���P�[�h������܂����A";
		mes "�����͎���̃����X�^�[��";
		mes "�|���ΊJ���͂��ł��B";
		unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : ���̗v�ǂ���葱���A�ŏ�K��ڎw���Ă��������B�Ƃ���ǂ���ɓ����ǂ��o���P�[�h������܂����A�����͎���̃����X�^�[��|���ΊJ���͂��ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�r���ɕ���������܂����A";
		mes "���̓����X�^�[�B�̑���";
		mes "�Ȃ��Ă���悤�ł��B";
		unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �r���ɕ���������܂����A���̓����X�^�[�B�̑��ɂȂ��Ă���悤�ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�X�ɑ��荞�܂��A���f�b�h��";
		mes "���炷���߁A�ł���΂����";
		mes "�r�ł��Ăق����Ƃ���ł����c�c�B";
		mes "�����͂��Ȃ��ł��������B";
		mes "�D�悷��͍̂ŏ�K�ɂ���";
		mes "���̗v�ǂ̎w�����ł��B";
		unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �X�ɑ��荞�܂��A���f�b�h�����炷���߁A�ł���΂�����r�ł��Ăق����Ƃ���ł����c�c�B�����͂��Ȃ��ł��������B�D�悷��͍̂ŏ�K�ɂ��邱�̗v�ǂ̎w�����ł��B";
		next;
		mes "[�v�����e�����m]";
		mes "�v�Ǔ����ł͂��Ȃ�̌��킪";
		mes "�\�z����܂��B";
		mes "���ꂮ������C�������������B";
		unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �v�Ǔ����ł͂��Ȃ�̌��킪�\�z����܂��B���ꂮ������C�������������B";
		close2;
	}
	sleep 2000;
	announce "???? : �N���ҁc�c�l�ԁc�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	emotion 0,getmdnpcname("�v�����e�����m#01");
	donpcevent getmdnpcname("#aerial_start")+ "::OnStart";
	sleep 3000;
	announce "???? : �s���̌R�c�c�c�r�W���E�l�̖��߁c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	announce "???? : �����Ă�������A���ȁc�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : �����ɗ��܂�̂͊댯�̂悤�ł��ˁB";
	sleep 2000;
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : ��U���͖߂�܂��B���̕��̏�������������A�ォ��ǂ������܂��B";
	sleep 2000;
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#01")),"�v�����e�����m : ����ł͂��ꂮ������C�����āI";
	sleep 2000;
	hideonnpc getmdnpcname("�v�����e�����m#01");
	end;
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	set getvariableofnpc('flag,getmdnpcname("#barricade1-1_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade1-2_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade1-3_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade1-4_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade2-1_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade2-2_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade2-3_sub")), 1;
	set getvariableofnpc('flag,getmdnpcname("#barricade2-4_sub")), 1;
	donpcevent getmdnpcname("#mobcnt2")+ "::OnStart";
	donpcevent getmdnpcname("#barricade1-1_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade1-2_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade1-3_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade1-4_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade2-1_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade2-2_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade2-3_sub")+ "::OnStart";
	donpcevent getmdnpcname("#barricade2-4_sub")+ "::OnStart";
	for(set '@i,1; '@i <= 16; set '@i,'@i+1) {
		set '@name$,"#barricade2-5-" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	hideonnpc getmdnpcname("#Last_Boss");
	hideonnpc getmdnpcname("#Last_Boss_Monster");
	hideonnpc getmdnpcname("#Last_Boss_Monster2");
	hideonnpc getmdnpcname("�v�����e�����m#exit");
	hideonnpc getmdnpcname("�v�����e�����m#exit02");
	hideonnpc getmdnpcname("S�EJ�E�A�[�l�X�g�E���t#");
	for(set '@i,1; '@i <= 27; set '@i,'@i+1) {
		set '@name$,"#pantheon_damage" +'@i;
		hideonnpc getmdnpcname('@name$);
	}
	end;
}

1@sthc.gat,1,0,0	script	#roommobpop1_sub	-1,{
OnSummon:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#roommobpop1_sub")+"::OnKilled";
	monster '@map$,61,101,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,70,101,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,70,108,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,62,108,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,59,97,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,69,93,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,61,127,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,62,120,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,62,121,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,72,133,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,63,133,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,64,132,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,69,127,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,67,127,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,65,122,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,60,134,"�s���̎􂢂̉e",3483,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�ꕔ���ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}

1@sthc.gat,66,94,0	script	#roommobpop1	139,3,3,{
OnTouch:
	donpcevent getmdnpcname("#roommobpop1_sub")+"::OnSummon";
	hideonnpc;
	end;
}
1@sthc.gat,116,94,0	script	#mobcnt2	139,{
OnStart:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#mobcnt2")+"::OnKilled";
	monster '@map$,121,90,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,113,95,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,111,106,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,116,111,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,120,121,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,118,134,"�s���̎􂢂̉e",3483,1,'@label$;
	set 'count,24;
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�񕔉��ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}
1@sthc.gat,122,88,0		script	#mobegg2-1	139,3,3,{
	end;
OnTouch:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#mobcnt2")+"::OnKilled";
	setarray '@mobid,3476,3478,3479,3480;
	setarray '@x,121,113,113,121,115,111,117,120,116,111,110,116,113,117,120,118,110,118;
	setarray '@y, 90, 89, 95, 95,102,106,103,108,111,103,117,118,125,121,121,129,132,134;
	for(set '@i,1; '@i <= 18; set '@i,'@i+1) {
		set '@name$,"mobegg2-"+ '@i;
		if(strnpcinfo(2) == '@name$) {
			misceffect 129;
			hideonnpc;
			monster '@map$,'@x['@i-1],'@y['@i-1],"--ja--",'@mobid[rand(4)],1,'@label$;
			break;
		}
	}
	end;
}
1@sthc.gat,111,89,0		duplicate(#mobegg2-1)	#mobegg2-2	139,3,3
1@sthc.gat,111,95,0		duplicate(#mobegg2-1)	#mobegg2-3	139,3,3
1@sthc.gat,123,95,0		duplicate(#mobegg2-1)	#mobegg2-4	139,3,3
1@sthc.gat,112,102,0	duplicate(#mobegg2-1)	#mobegg2-5	139,3,3
1@sthc.gat,109,105,0	duplicate(#mobegg2-1)	#mobegg2-6	139,3,3
1@sthc.gat,119,103,0	duplicate(#mobegg2-1)	#mobegg2-7	139,3,3
1@sthc.gat,122,108,0	duplicate(#mobegg2-1)	#mobegg2-8	139,3,3
1@sthc.gat,119,111,0	duplicate(#mobegg2-1)	#mobegg2-9	139,3,3
1@sthc.gat,109,113,0	duplicate(#mobegg2-1)	#mobegg2-10	139,3,3
1@sthc.gat,107,117,0	duplicate(#mobegg2-1)	#mobegg2-11	139,3,3
1@sthc.gat,113,118,0	duplicate(#mobegg2-1)	#mobegg2-12	139,3,3
1@sthc.gat,111,123,0	duplicate(#mobegg2-1)	#mobegg2-13	139,3,3
1@sthc.gat,117,123,0	duplicate(#mobegg2-1)	#mobegg2-14	139,3,3
1@sthc.gat,121,123,0	duplicate(#mobegg2-1)	#mobegg2-15	139,3,3
1@sthc.gat,120,128,0	duplicate(#mobegg2-1)	#mobegg2-16	139,3,3
1@sthc.gat,107,131,0	duplicate(#mobegg2-1)	#mobegg2-17	139,3,3
1@sthc.gat,118,136,0	duplicate(#mobegg2-1)	#mobegg2-18	139,3,3

1@sthc.gat,3,0,0	script	#roommobpop3_sub	-1,{
OnSummon:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#roommobpop3_sub")+"::OnKilled";
	monster '@map$,12,41,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,19,41,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,12,39,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,19,40,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,14,48,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,15,45,"�s���̎􂢂̉e",3483,1,'@label$;
	announce "�s���̃E�B���h�S�[�X�g : �N�b�N�b�N�c�c�߂����D��S�͐g��łڂ����H", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	monster '@map$,16,50,"�s���̃E�B���h�S�[�X�g",3775,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�O�����ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}

1@sthc.gat,16,54,3	script	����#roommobpop3	844,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	hideonnpc;
	misceffect 106;
	donpcevent getmdnpcname("#roommobpop3_sub")+"::OnSummon";
	end;
}

1@sthc.gat,4,0,0	script	#roommobpop4_sub	-1,{
OnSummon:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#roommobpop4_sub")+"::OnKilled";
	monster '@map$,64,11,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,66,11,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,65,9,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,64,15,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,63,16,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,68,19,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,64,18,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,67,16,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,66,18,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,69,37,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,65,34,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,62,38,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,57,43,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,66,39,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,69,47,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,64,50,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,62,47,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,61,52,"�s���̎􂢂̉e",3483,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�l�����ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}
1@sthc.gat,66,12,0	script	#roommobpop4	139,3,3,{
OnTouch:
	hideonnpc;
	donpcevent getmdnpcname("#roommobpop4_sub")+"::OnSummon";
	end;
}

1@sthc.gat,5,0,0	script	#roommobpop5_sub	-1,{
OnSummon:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#roommobpop5_sub")+"::OnKilled";
	monster '@map$,115,34,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,115,34,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,115,34,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,115,34,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,115,34,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,115,34,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,115,34,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,115,34,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,115,34,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,121,44,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,111,40,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,119,40,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,111,45,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,119,45,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,114,49,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,111,50,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,120,50,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,114,52,"�s���̎􂢂̉e",3483,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�ܕ����ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}
1@sthc.gat,115,12,0	script	#roommobpop5	139,3,3,{
OnTouch:
	hideonnpc;
	donpcevent getmdnpcname("#roommobpop5_sub")+"::OnSummon";
	end;
}

1@sthc.gat,6,0,0	script	#roommobpop6_sub	-1,{
OnSummon:
	set '@map$,getmdmapname("1@sthc.gat");
	set '@label$,getmdnpcname("#roommobpop6_sub")+"::OnKilled";
	announce "�s���̃u���b�f�B�i�C�g : ��ɖڂ�ῂ񂾋����҂߁B�~�[���Ȃ�����ނ������B", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	monster '@map$,12,121,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,19,125,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,12,127,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,20,131,"�s���̈����̉e",3481,1,'@label$;
	monster '@map$,16,130,"�s���̓{��̉e",3482,1,'@label$;
	monster '@map$,15,119,"�s���̎􂢂̉e",3483,1,'@label$;
	monster '@map$,19,129,"�s���̃u���b�f�B�i�C�g",3774,1,'@label$;
	set 'count,getmapmobs('@map$,'@label$);
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	sleep 1000;
	announce "�]�Z�����ڂ̃����X�^�[�͂��ׂē|�����悤���B�������o�Đ�ɐi�����]", 0x9, 0xffff00, 0x0190, 20, 0, 0;
	set 'flag,1;
	end;
}
1@sthc.gat,16,131,0	script	��#roommobpop6	844,{
	mes "�]�����ɂ���󔠂̒��ł�";
	mes "�@�ЂƂ���ῂ��������";
	mes "�@�����̕󔠂�����]";
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		close;
	next;
	if(select("�����J����","�����J���Ȃ�")==2) {
		mes "�]�s�p�ӂȍs���͂�߂Ă������]";
		close;
	}
	mes "�]���̒����牽������������Ă���B";
	mes "�@����́c�c�]";
	close2;
	hideonnpc getmdnpcname("��#roommobpop6");
	donpcevent getmdnpcname("#roommobpop6_sub")+"::OnSummon";
	misceffect 409;
	end;
}

1@sthb.gat,179,48,0	script	#trap01	139,6,4,{
	end;
OnTouch:
	hideonnpc;
	donpcevent getmdnpcname("#barricade2-5_sub")+ "::OnStart";
	end;
}
1@sthb.gat,154,68,0	script	#trap_last1	139,4,4,{
OnTouch:
	set '@map$,getmdmapname("1@sthb.gat");
	hideonnpc;
	monster '@map$,152,62,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,153,62,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,154,62,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,155,62,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,156,62,"�s���̗v�Ǖ�",3477,1;
	end;
}
1@sthb.gat,154,78,0	script	#trap_last2	139,4,4,{
OnTouch:
	set '@map$,getmdmapname("1@sthb.gat");
	hideonnpc;
	monster '@map$,152,70,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,153,70,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,154,70,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,155,70,"�s���̃]���r�}�X�^�[",3479,1;
	monster '@map$,156,70,"�s���̗v�Ǖ�",3477,1;
	end;
}
1@sthb.gat,165,83,0	script	#trap_last3	139,4,4,{
OnTouch:
	set '@map$,getmdmapname("1@sthb.gat");
	hideonnpc;
	monster '@map$,159,82,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,159,83,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,159,84,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,159,85,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,159,86,"�s���̗v�Ǖ�",3477,1;
	end;
}
1@sthb.gat,178,83,0	script	#trap_last4	139,4,4,{
OnTouch:
	set '@map$,getmdmapname("1@sthb.gat");
	hideonnpc;
	monster '@map$,178,82,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,178,83,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,178,84,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,178,85,"�s���̃]���r�X���[�^�[",3478,1;
	monster '@map$,178,86,"�s���̗v�Ǖ�",3477,1;
	end;
}

1@sthb.gat,146,44,0	script	�|�ꂽ���m#0	849,1,1,{
	end;
OnTouch:
	for(set '@i,0; '@i <= 11; set '@i,'@i+1) {
		set '@name$,'@i;
		if(strnpcinfo(2) == '@name$) {
			set '@dummy,getmapxy('@map$,'@x,'@y,1);
			switch('@i) {
				case 1:  set '@mes$,"�}�b�e�N���c�c"; break;
				case 2:  set '@mes$,"�A�J�A�J�A�J�c�c"; break;
				case 3:  set '@mes$,"�_���J�c�c"; break;
				case 4:  set '@mes$,"�^�X�P�e�N���c�c"; break;
				case 5:  set '@mes$,"�J�G�����_�c�c"; break;
				case 6:  set '@mes$,"�E�E�E�c�c"; break;
				case 7:  set '@mes$,"�ǂ����āc�c�R���i�R�g�j�c�c"; break;
				case 8:  set '@mes$,"�I�C�e�C�J�i�C�f�c�c"; break;
				case 9:  set '@mes$,"�X�����Ȃ����o�c�c"; break;
				case 10: set '@mes$,"�R�m�T�L�j�n�c�c"; break;
				case 11: set '@mes$,"�}�e�c�c"; break;
				default: set '@mes$,"���������c�c���c�c�A���c�c�H"; break;
			}
			unittalk '@mes$;
			sc_start 485,2000,1;
			if(!sleep2(2000)) end;
			hideonnpc;
			misceffect 772;
			monster '@map$,'@x,'@y,"�]���r�K�[�h",3452,1;
			break;
		}
	}
	end;

}
1@sthb.gat,141,51,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#1	849,1,1
1@sthb.gat,140,54,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#2	849,1,1
1@sthb.gat,144,57,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#3	849,1,1
1@sthb.gat,141,65,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#4	849,1,1
1@sthb.gat,146,69,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#5	849,1,1
1@sthb.gat,140,71,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#6	849,1,1
1@sthb.gat,142,77,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#7	849,1,1
1@sthb.gat,140,81,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#8	849,1,1
1@sthb.gat,146,83,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#9	849,1,1
1@sthb.gat,186,85,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#10	849,1,1
1@sthb.gat,185,81,0	duplicate(�|�ꂽ���m#0)	�|�ꂽ���m#11	849,1,1

1@sthd.gat,94,119,0		script	#pantheon_damage1	139,5,5,{
	end;
OnTouch:
	misceffect 1,"";
	misceffect 69,"";
	misceffect 414,"";
	percentheal -30,0;
	sit;
	end;
OnAttack:
	misceffect 773;
	initnpctimer;
	end;
OnTimer4000:
	misceffect 666;
	hideoffnpc;
	end;
OnTimer5000:
	stopnpctimer;
	hideonnpc;
	end;
}
1@sthd.gat,96,109,0		duplicate(#pantheon_damage1)	#pantheon_damage2	139,5,5
1@sthd.gat,104,110,0	duplicate(#pantheon_damage1)	#pantheon_damage3	139,5,5
1@sthd.gat,110,110,0	duplicate(#pantheon_damage1)	#pantheon_damage4	139,5,5
1@sthd.gat,113,117,0	duplicate(#pantheon_damage1)	#pantheon_damage5	139,5,5
1@sthd.gat,112,103,0	duplicate(#pantheon_damage1)	#pantheon_damage6	139,5,5
1@sthd.gat,104,103,0	duplicate(#pantheon_damage1)	#pantheon_damage7	139,5,5
1@sthd.gat,97,103,0		duplicate(#pantheon_damage1)	#pantheon_damage8	139,5,5
1@sthd.gat,92,97,0		duplicate(#pantheon_damage1)	#pantheon_damage9	139,5,5
1@sthd.gat,99,95,0		duplicate(#pantheon_damage1)	#pantheon_damage10	139,5,5
1@sthd.gat,108,95,0		duplicate(#pantheon_damage1)	#pantheon_damage11	139,5,5
1@sthd.gat,116,95,0		duplicate(#pantheon_damage1)	#pantheon_damage12	139,5,5
1@sthd.gat,112,87,0		duplicate(#pantheon_damage1)	#pantheon_damage13	139,5,5
1@sthd.gat,104,88,0		duplicate(#pantheon_damage1)	#pantheon_damage14	139,5,5
1@sthd.gat,95,87,0		duplicate(#pantheon_damage1)	#pantheon_damage15	139,5,5
1@sthd.gat,96,78,0		duplicate(#pantheon_damage1)	#pantheon_damage16	139,5,5
1@sthd.gat,94,72,0		duplicate(#pantheon_damage1)	#pantheon_damage17	139,5,5
1@sthd.gat,104,81,0		duplicate(#pantheon_damage1)	#pantheon_damage18	139,5,5
1@sthd.gat,111,81,0		duplicate(#pantheon_damage1)	#pantheon_damage19	139,5,5
1@sthd.gat,114,72,0		duplicate(#pantheon_damage1)	#pantheon_damage20	139,5,5
1@sthd.gat,126,96,0		duplicate(#pantheon_damage1)	#pantheon_damage21	139,5,5
1@sthd.gat,81,96,0		duplicate(#pantheon_damage1)	#pantheon_damage22	139,5,5
1@sthd.gat,100,71,0		duplicate(#pantheon_damage1)	#pantheon_damage23	139,5,5
1@sthd.gat,91,101,0		duplicate(#pantheon_damage1)	#pantheon_damage24	139,5,5
1@sthd.gat,117,101,0	duplicate(#pantheon_damage1)	#pantheon_damage25	139,5,5
1@sthd.gat,117,90,0		duplicate(#pantheon_damage1)	#pantheon_damage26	139,5,5
1@sthd.gat,90,90,0		duplicate(#pantheon_damage1)	#pantheon_damage27	139,5,5

1@sthd.gat,97,127,0	script	#pantheon2	139,{/* 74359 (hide)*/}

1@sthd.gat,103,96,0	script	#�X�e�t�@�����o3	139,15,15,{
	end;
OnTouch:
	if(getpartyleader(getcharid(1)) != strcharinfo(0) || 'flag > 0)
		end;
	mes "�]�d�ꂵ���C�z������B";
	mes "�@���̐�ɋ󒆗v�ǂ�";
	mes "�@�w����������̂��낤�]";
	next;
	mes "^ff0000�]���Ӂ]";
	mes "�@^ff0000���̐�ɐi�ނƂ��̃}�b�v�Ɍq����";
	mes "�@^ff0000���[�v�����N�͏����Ă��܂��A";
	mes "�@^ff0000�O�̃}�b�v�ɂ���L�����N�^�[��";
	mes "�@^ff0000�i�s�s�\�ɂȂ�܂��B^000000";
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
	set getvariableofnpc('leader$,getmdnpcname("#Last_Boss_Con")), strcharinfo(0);
	donpcevent getmdnpcname("#�X�e�t�@�����o3")+ "::OnStart";
	close;
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc;
	hideonnpc getmdnpcname("#sthd_move_02_02");
	announce "???? : �N���ҁc�c�����Ȑl�ԁc�c", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	announce "???? : ���c�c�v�ǎ��B�r�W���E�l�̗v�ǁc�c�r�W���E�l�̖��߁c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	announce "???? : �������P�������c�c�����Ă�������o���Ȃ��c�c�B�s���̗́A�v���m��c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	announce "???? : �c�c�N���ҁA�����􂭁c�c�݂�ȁA�E���c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	sleep 3000;
	areamonster getmdmapname("1@sthd.gat"),84,76,124,116,"�s���̃]���r",3776,10,getmdnpcname("#Last_Boss_Con") + "::OnMobDead";
	sleep 1000;
	hideoffnpc getmdnpcname("#Last_Boss");
	donpcevent getmdnpcname("#Last_Boss")+ "::OnStart";
	end;
}
1@sthd.gat,0,0,0	script	#Last_Boss_Con	-1,{
OnStart:
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,0,'leader$);
	if('@map$ != getmdmapname("1@sthd.gat")) {
		set '@x,103;
		set '@y,115;
	}
	set 'mob_id,callmonster(getmdmapname("1@sthd.gat"),'@x,'@y,"S�EJ�E�A�[�l�X�g�E���t",3473,getmdnpcname("#Last_Boss_Con")+"::OnBossDead");
	mobuseskill 'mob_id,7,1,0,0,0,-1,0;
	unittalk 'mob_id,"S�EJ�E�A�[�l�X�g�E���t : �O�H�H�H�H�H�H�H�H�I";
	initnpctimer;
	end;
OnTimer1000:
	if('mob_id) {
		set 'hp,getmobhp('mob_id);
		if('hp < 26000000 && 'Last_Boss_Monster == 0) {
			donpcevent getmdnpcname("#Last_Boss_Monster")+ "::OnStart";
			set 'Last_Boss_Monster,1;
		}
	}
	end;
OnTimer2000:
	if('mob_id) {
		set 'hp,getmobhp('mob_id);
		if('hp < 24000000 && 'Last_Boss_Monster2 == 0) {
			donpcevent getmdnpcname("#Last_Boss_Monster2")+ "::OnStart";
			set 'Last_Boss_Monster2,1;
		}
	}
	end;
OnTimer3000:
	if('mob_id) {
		set 'hp,getmobhp('mob_id);
		if('hp < 12000000) {
			if('pant_flag == 0) {
				announce "S�EJ�E�A�[�l�X�g�E���t : �c�c�l�ԁc�c�݂�ȁc�c�j�󂷂�c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
				set 'pant_flag,1;
			}
			set '@bomb[0],rand(1,7);
			set '@bomb[1],rand(1,7);
			set '@bomb[2],rand(1,8);
			set '@bomb[3],rand(1,7);
			set '@bomb[4],rand(1,8);
			set '@bomb[5],rand(1,7);
			if ('@bomb[0] == 1) {
				set '@pant[0],1;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,21;
				else if ('@bomb[3] == 3) setarray '@pant[1],10,24;
				else if ('@bomb[3] == 4) setarray '@pant[1],11;
				else if ('@bomb[3] == 5) setarray '@pant[1],12;
				else if ('@bomb[3] == 6) setarray '@pant[1],13;
				else if ('@bomb[3] == 7) setarray '@pant[1],14,27;
			}
			else if ('@bomb[0] == 2) {
				set '@pant[0],2;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,1;
				else if ('@bomb[3] == 3) setarray '@pant[1],10,21;
				else if ('@bomb[3] == 4) setarray '@pant[1],11,24;
				else if ('@bomb[3] == 5) setarray '@pant[1],12,27;
				else if ('@bomb[3] == 6) setarray '@pant[1],13;
				else if ('@bomb[3] == 7) setarray '@pant[1],14;
			}
			else if ('@bomb[0] == 3) {
				set '@pant[0],3;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,24;
				else if ('@bomb[3] == 3) setarray '@pant[1],10,1;
				else if ('@bomb[3] == 4) setarray '@pant[1],11,21;
				else if ('@bomb[3] == 5) setarray '@pant[1],12,27;
				else if ('@bomb[3] == 6) setarray '@pant[1],13;
				else if ('@bomb[3] == 7) setarray '@pant[1],14;
			}
			else if ('@bomb[0] == 4) {
				set '@pant[0],4;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,24;
				else if ('@bomb[3] == 3) setarray '@pant[1],10;
				else if ('@bomb[3] == 4) setarray '@pant[1],11,1;
				else if ('@bomb[3] == 5) setarray '@pant[1],12,21;
				else if ('@bomb[3] == 6) setarray '@pant[1],13,27;
				else if ('@bomb[3] == 7) setarray '@pant[1],14;
			}
			else if ('@bomb[0] == 5) {
				set '@pant[0],5;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,24;
				else if ('@bomb[3] == 3) setarray '@pant[1],10;
				else if ('@bomb[3] == 4) setarray '@pant[1],11,27;
				else if ('@bomb[3] == 5) setarray '@pant[1],12,1;
				else if ('@bomb[3] == 6) setarray '@pant[1],13,21;
				else if ('@bomb[3] == 7) setarray '@pant[1],14;
			}
			else if ('@bomb[0] == 6) {
				setarray '@pant[0],6,26;
				if ('@bomb[3] == 1) setarray '@pant[2],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[2],9,24;
				else if ('@bomb[3] == 3) setarray '@pant[2],10;
				else if ('@bomb[3] == 4) setarray '@pant[2],11,27;
				else if ('@bomb[3] == 5) setarray '@pant[2],12;
				else if ('@bomb[3] == 6) setarray '@pant[2],13,1;
				else if ('@bomb[3] == 7) setarray '@pant[2],14,21;
			}
			else if ('@bomb[0] == 7) {
				set '@pant[0],7;
				if ('@bomb[3] == 1) setarray '@pant[1],8,23;
				else if ('@bomb[3] == 2) setarray '@pant[1],9,21;
				else if ('@bomb[3] == 3) setarray '@pant[1],10,24;
				else if ('@bomb[3] == 4) setarray '@pant[1],11;
				else if ('@bomb[3] == 5) setarray '@pant[1],12,27;
				else if ('@bomb[3] == 6) setarray '@pant[1],13;
				else if ('@bomb[3] == 7) setarray '@pant[1],14,1;
			}
			set '@s,getarraysize('@pant);

			if ('@bomb[1] == 1) {
				setarray '@pant['@s],8,23;
				set '@s,'@s+2;
				if ('@bomb[4] == 1) setarray '@pant['@s],15,5;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16,25;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 2) {
				setarray '@pant['@s],9,24;
				set '@s,'@s+2;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16,5;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17,25;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 3) {
				set '@pant['@s],10;
				set '@s,'@s+1;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17,5;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18,25;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 4) {
				set '@pant['@s],11;
				set '@s,'@s+1;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18,5;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19,25;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 5) {
				set '@pant['@s],12;
				set '@s,'@s+1;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19,5;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20,25;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 6) {
				set '@pant['@s],13;
				set '@s,'@s+1;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20,5;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21,25;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22;
			}
			else if ('@bomb[1] == 7) {
				set '@pant['@s],14;
				set '@s,'@s+1;
				if ('@bomb[4] == 1) setarray '@pant['@s],15;
				else if ('@bomb[4] == 2) setarray '@pant['@s],16;
				else if ('@bomb[4] == 3) setarray '@pant['@s],17;
				else if ('@bomb[4] == 4) setarray '@pant['@s],18;
				else if ('@bomb[4] == 5) setarray '@pant['@s],19;
				else if ('@bomb[4] == 6) setarray '@pant['@s],20;
				else if ('@bomb[4] == 7) setarray '@pant['@s],21,5;
				else if ('@bomb[4] == 8) setarray '@pant['@s],22,25;
			}

			if ('@bomb[2] == 1) {
				set '@pant['@s],15;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1,22;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2,23;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3,26;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7;
			}
			else if ('@bomb[2] == 2) {
				set '@pant['@s],16;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2,22;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3,23;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4,26;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7;
			}
			else if ('@bomb[2] == 3) {
				setarray '@pant['@s],17,25;
				set '@s,'@s+2;
				if ('@bomb[5] == 1) setarray '@pant['@s],1;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3,22;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4,23;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5,26;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7;
			}
			else if ('@bomb[2] == 4) {
				set '@pant['@s],18;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4,22;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5,23;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6,26;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7;
			}
			else if ('@bomb[2] == 5) {
				setarray '@pant['@s],19,27;
				set '@s,'@s+2;
				if ('@bomb[5] == 1) setarray '@pant['@s],1;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5,22;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6,23;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7,26;
			}
			else if ('@bomb[2] == 6) {
				set '@pant['@s],20;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1,26;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6,22;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7,23;
			}
			else if ('@bomb[2] == 7) {
				set '@pant['@s],21;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1,23;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3,26;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7,22;
			}
			else if ('@bomb[2] == 8) {
				set '@pant['@s],22;
				set '@s,'@s+1;
				if ('@bomb[5] == 1) setarray '@pant['@s],1;
				else if ('@bomb[5] == 2) setarray '@pant['@s],2,23;
				else if ('@bomb[5] == 3) setarray '@pant['@s],3,26;
				else if ('@bomb[5] == 4) setarray '@pant['@s],4;
				else if ('@bomb[5] == 5) setarray '@pant['@s],5;
				else if ('@bomb[5] == 6) setarray '@pant['@s],6;
				else if ('@bomb[5] == 7) setarray '@pant['@s],7;
			}
			set '@s,getarraysize('@pant);
			for (set '@i,0; '@i < '@s; set '@i,'@i+1 )
				donpcevent getmdnpcname("#pantheon_damage" + '@pant['@i]) + "::OnAttack";
		}
		set '@r,rand(1,30);
		if('@r == 1)
			unittalk 'mob_id,"�E���t : ������ȁc�c�c�B";
		else if('@r < 11)
			unittalk 'mob_id,"�X�e�t�@�� : �O�D�D�c�c�c�B";
		else if('@r == 20)
			unittalk 'mob_id,"�W���b�N : ���c�c�v�ǁc�c�_���ȗv�ǁc�c�r�W���E�l�c�c���c�c�B";
		else if('@r == 30)
			unittalk 'mob_id,"�A�[�l�X�g : ���邳���c�c�l�ԁc�c�c�����B�����c�c�c�B";
	}
	end;
OnTimer9000:
	initnpctimer;
	end;
OnBossDead:
	stopnpctimer;
	stopnpctimer getmdnpcname("#Last_Boss_Monster");
	stopnpctimer getmdnpcname("#Last_Boss_Monster2");
	killmonster getmdmapname("1@sthd.gat"),getmdnpcname("#Last_Boss_Con")+"::OnMobDead";
	killmonster getmdmapname("1@sthd.gat"),getmdnpcname("#Last_Boss_Monster")+"::OnKilled";
	killmonster getmdmapname("1@sthd.gat"),getmdnpcname("#Last_Boss_Monster2")+"::OnKilled";
	announce "S�EJ�E�A�[�l�X�g�E���t : �c�c�������c�c���ǎ��ȂȂ��c�c", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	hideoffnpc getmdnpcname("�v�����e�����m#exit");
	sleep 3000;
	announce "S�EJ�E�A�[�l�X�g�E���t : ���c�c�A���Ă���B�c�c�s���̗͂Łc�c�v�ǁA���c�c", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	end;
OnMobDead:
	end;
}
1@sthd.gat,103,96,0	script	#Last_Boss	139,{
	end;
OnStart:
	hideonnpc;
	donpcevent getmdnpcname("#Last_Boss_Con")+"::OnStart";
	end;
}
1@sthd.gat,99,127,0	script	#Last_Boss_Monster	139,{
OnStart:
	initnpctimer;
	announce "S�EJ�E�A�[�l�X�g�E���t : �o�Ă����c�c�s���̌R�c�c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	end;
OnTimer1000:
OnTimer8000:
OnTimer16000:
OnTimer24000:
OnTimer32000:
	set '@map$,getmdmapname("1@sthd.gat");
	set '@label$,getmdnpcname("#Last_Boss_Monster")+"::OnKilled";
	setarray '@mob,3776,3777,3485;
	if(getmapmobs('@map$,'@label$) < 8) {
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			areamonster getmdmapname("1@sthd.gat"),84,76,124,116,"--ja--",'@mob[rand(3)],1,'@label$;
	}
	end;
OnTimer33000:
	initnpctimer;
	end;
OnKilled:
	end;
}
1@sthd.gat,98,127,0	script	#Last_Boss_Monster2	139,{
OnStart:
	initnpctimer;
	announce "S�EJ�E�A�[�l�X�g�E���t : ���邳���l�Ԃǂ��c�c�B�r������c�c�B", 0x9, 0xff0000, 0x0190, 20, 0, 0;
	end;
OnTimer1000:
OnTimer10000:
	set '@map$,getmdmapname("1@sthd.gat");
	set '@label$,getmdnpcname("#Last_Boss_Monster2")+"::OnKilled";
	setarray '@mob,3776,3777,3485;
	if(getmapmobs('@map$,'@label$) < 8) {
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			areamonster getmdmapname("1@sthd.gat"),89,81,119,111,"--ja--",'@mob[rand(3)],1,'@label$;
	}
	end;
OnTimer11000:
	initnpctimer;
	end;
OnKilled:
	end;
}

1@sthd.gat,103,96,3	script	�v�����e�����m#exit	105,{
	if('flag > 0) {
		mes "[�v�����e�����m]";
		mes "�����P�ނ��������ǂ������ł��ˁB";
		close;
	}
	mes "[�v�����e�����m]";
	mes "����ł��΂炭�����X�^�[�̐�����";
	mes "��܂�ł��傤�B";
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		close;
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#exit")),"�v�����e�����m : ����ł��΂炭�����X�^�[�̐�������܂�ł��傤�B";
	next;
	hideoffnpc getmdnpcname("S�EJ�E�A�[�l�X�g�E���t#");
	cutin "stephan_j_e_w.bmp", 2;
	mes "[S�EJ�E�A�[�l�X�g�E���t]";
	mes "�O�O�D�c�c�B";
	unittalk getnpcid(0,getmdnpcname("S�EJ�E�A�[�l�X�g�E���t#")),"S�EJ�E�A�[�l�X�g�E���t : �O�O�D�c�c�B";
	next;
	cutin "job_dancer_eir01.bmp", 255;
	mes "[�v�����e�����m]";
	mes "�����Đ����n�܂��Ă��܂��B";
	mes "�����P�ނ��������ǂ������ł��ˁB";
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#exit")),"�v�����e�����m : �����Đ����n�܂��Ă��܂��B�����P�ނ��������ǂ������ł��ˁB";
	next;
	hideoffnpc getmdnpcname("�v�����e�����m#exit02");
	set 'flag,1;
	mes "[�v�����e�����m]";
	mes "�E�o�o�H�͂�����ł��I";
	mes "���ɂ��Ă��Ă��������I";
	unittalk getnpcid(0,getmdnpcname("�v�����e�����m#exit02")),"�v�����e�����m : �E�o�o�H�͂�����ł��I�@���ɂ��Ă��Ă��������I";
	close;
}
1@sthd.gat,99,95,6	script	�v�����e�����m#exit02	105,{
	if(!(checkquest(73060) & 0x8)) {
		mes "[�v�����e�����m]";
		mes "�����͊��ӂ��܂��I";
		mes "����͌x����������";
		mes "���͎҂ɓn���悤��";
		mes "�����Ă����V�ł��B";
		mes "�󂯎���Ă��������I";
		next;
		if(!(checkquest(9427) & 0x8)) {
			setquest 9427;
			compquest 9427;
		}
		setquest 73060;
		compquest 73060;
		if(BaseLevel < 160)
			set '@bexp,10000000;
		else
			set '@bexp,30000000;
		getexp '@bexp,0,1;
		getexp '@bexp,0,1;
		getexp 0,2000000,0;
		getexp 0,2000000,0;
		getexp 0,2000000,0;
		getexp 0,2000000,0;
		getexp 0,2000000,0;
		if(BaseLevel < 160)
			set '@bexp,5000000;
		else
			set '@bexp,15000000;
		if(getvariableofnpc('flag,getmdnpcname("#roommobpop1_sub")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		if(getvariableofnpc('flag,getmdnpcname("#mobcnt2")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		if(getvariableofnpc('flag,getmdnpcname("#roommobpop3_sub")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		if(getvariableofnpc('flag,getmdnpcname("#roommobpop4_sub")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		if(getvariableofnpc('flag,getmdnpcname("#roommobpop5_sub")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		if(getvariableofnpc('flag,getmdnpcname("#roommobpop6_sub")) > 0) {
			getexp '@bexp,0,1;
			getexp 0,1000000,0;
			getexp 0,1000000,0;
		}
		getitem 6919,10;
	}
	mes "[�v�����e�����m]";
	mes "����ł͂�������E�o���܂��傤�I";
	mes "���ɂ��Ă��Ă��������I";
	next;
	if(select("�󒆗v�ǂ���E�o����","�܂��E�o���Ȃ�")==2) {
		mes "[�v�����e�����m]";
		mes "�����C�ɂȂ���̂ł�";
		mes "����̂ł����H";
		close;
	}
	mes "[�v�����e�����m]";
	mes "�������ł��I";
	close2;
	warp "prt_q.gat",249,64;
	end;
}
1@sthd.gat,108,95,3	script	S�EJ�E�A�[�l�X�g�E���t#	10140,{
	cutin "stephan_j_e_w.bmp", 2;
	mes "[S�EJ�E�A�[�l�X�g�E���t]";
	mes "�O�O�D�c�c�B";
	close2;
	cutin "job_dancer_eir01.bmp", 255;
	end;
}
