prt_lib.gat,56,61,4	script	���R�m#ep16_roomguard	751,{
	if(EP16_1QUE < 13) {
		unittalk "���R�m : �ǂ�������܂������B",1;
		end;
	}
	mes "[���R�m]";
	mes "�O�o����܂����H";
	mes "���������肷��ꏊ�ɂ́A";
	mes "�Ď��҂���������Ⴂ�܂��B";
	mes "�ړ����܂�����A";
	mes "�ނɐ��������Ă��������B";
	next;
	if(select("�O�֏o��","�O�֏o�Ȃ�")==2) {
		mes "[���R�m]";
		mes "�O�֏o����ۂ�";
		mes "���������Ă��������B";
		close;
	}
	mes "[���R�m]";
	mes "���ē��������܂��B";
	close2;
	warp "prt_pri00.gat",60,127;
	end;
}
prt_lib.gat,9,24,0	script	lib_to_prt_prison	45,1,1,{
OnTouch:
	if(EP16_1QUE < 14) {
		mes "[���R�m]";
		mes "���̐�͐N���֎~�ł��B";
		close2;
		warp "prt_lib.gat",60,61;
		end;
	}
	warp "prt_pri00.gat",60,127;
	end;
}

prt_lib.gat,91,78,2	script(CLOAKED)	�}�N�V�[�~���A��#ep16_lib01	10133,{
	if(EP16_1QUE == 9) {
		mes "[�}�N�V�[�~���A��]";
		mes "�Ȃ�Ƃ��������Ƃ��B";
		mes "���ʌp���̋V�����P�������Ƃ́I";
		close;
	}
	end;
}
prt_lib.gat,80,79,3	script(CLOAKED)	�N���l�J�[�E�n�C�l��#ep16_lib01	10119,{
	if(EP16_1QUE == 9) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�����ށc�c";
		mes "�ǂ��������̂��B";
		close2;
		cutin "ep16_kronecker_granz_heine",255;
		end;
	} else if(EP16_1QUE == 22) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�������n�͂������̂��H";
		next;
		menu "���Ă�������b��",-;
		mes "[�N���l�J�[]";
		mes "�c�c����Ȏ����������Ƃ́I";
		mes "�ߋ��Ƀv�����e����";
		mes "�傫�Ȉٕς�����������";
		mes "�L�^����Ă��邪�c�c";
		next;
		mes "[�N���l�J�[]";
		mes "�V���̕����ɂ��������~���̐S����";
		mes "12���@���L���[�ɂ����";
		mes "��������ꂽ�Ƃ������ƂȂ̂�!?";
		mes "���̂��̎��͋L�^����Ă��Ȃ��H";
		next;
		mes "[�N���l�J�[]";
		mes "�������I";
		mes "���̕�����ǂ�ł݂Ă���I";
		mes "�N���ڌ��������̂��^���Ȃ�";
		mes "����͉����邩������Ȃ��I";
		next;
		cutin "ep16_kronecker_granz_heine",255;
		mes "�]�N���l�J�[����n���ꂽ";
		mes "�@�{�̐^�����ȃy�[�W�ɐG�ꂽ�r�[�A";
		mes "�@���̃y�[�W�͌�������A";
		mes "�@�����������яオ���ďo�ė����]";
		next;
		mes "^4d4dff�]�c�c";
		mes "�@^4d4dff���@���L���[�̏P���ɂ����";
		mes "�@^4d4dff�V���̕����ɕ��󂳂�Ă���";
		mes "�@^4d4dff���~���̐S�����������]";
		next;
		mes "^4d4dff�]�����̐��������ے����镨��";
		mes "�@^4d4dff�����������Ƃɋ����������B";
		mes "�@^4d4dff�Պ����Ńe���O���[���A�̌���";
		mes "�@^4d4dff���鎖���ł��Ȃ��ƍl������";
		mes "�@^4d4dff�ڂ̑O���^���ÂɂȂ����]";
		next;
		mes "^4d4dff�]���ł͂Ȃ��A";
		mes "�@^4d4dff���̎��̑�̑��ʎ�����";
		mes "�@^4d4dff��肪�������邾�낤�]";
		next;
		mes "^4d4dff�]�������ʂ���̂�";
		mes "�@^4d4dff��n���j����^���Ȃ���΁A";
		mes "�@^4d4dff�����̍��������͍��܂łȂ�����";
		mes "�@^4d4dff�ٕς�����Ȃ��疢����";
		mes "�@^4d4dff�����鎖�ɂȂ�]";
		next;
		mes "^4d4dff�]�閧���ɑ匫�҃o�������g��";
		mes "�@^4d4dff���̏󋵂�`�����B";
		mes "�@^4d4dff�ނ͎����Ȃ牽��";
		mes "�@^4d4dff�͂ɂȂ��ƌ����A";
		mes "�@^4d4dff�V���̕����ɉ�����ݒu�����]";
		next;
		mes "^4d4dff�]�ݒu���ꂽ����͋����ق�";
		mes "�@^4d4dff�e���O���[���A�ɔ��������B";
		mes "�@^4d4dff�e���O���[���A�̏j���̐���";
		mes "�@^4d4dff�\���Ȗ��͂��������Ă��ꂽ�]";
		next;
		mes "^4d4dff�]�e���O���[���A�͖��O�ʂ�A";
		mes "�@^4d4dff�����ƕς��Ȃ���n�̏j����";
		mes "�@^4d4dff�^���鎖���o����悤�ɂȂ����]";
		next;
		mes "^4d4dff�]�S�Ă����肵���B";
		mes "�@^4d4dff���Ƃ����ꂪ�U���ł���";
		mes "�@^4d4dff���~���̐S���ɂ�����";
		mes "�@^4d4dff�������Ƃ��Ă��]";
		next;
		mes "^4d4dff�]�e���O���[���A�c�c";
		mes "�@^4d4dff�������̔����������B";
		mes "�@^4d4dff�j�����󂯂������ɂ�";
		mes "�@^4d4dff��X�v�����e��������Ă���";
		mes "�@^4d4dff���~���̐S���̌��Ђ̈ꕔ��";
		mes "�@^4d4dff�c���Ă���]";
		next;
		mes "^4d4dff�]����ŏ\�����B";
		mes "�@^4d4dff���Ⴝ���͂��ꂾ���ł�";
		mes "�@^4d4dff�\���Ȃ͂����]";
		next;
		mes "^4d4dff�]�̂Ɏ��͂��̋L�^��";
		mes "�@^4d4dff�N�����Ȃ����Ƃ�]�݁A";
		mes "�@^4d4dff�����s�\�ȏ�����t����";
		mes "�@^4d4dff���󂷂鎖�ɂ����]";
		next;
		mes "^4d4dff�]����������A�䂪����̒N����";
		mes "�@^4d4dff���̋L�^�����邱�Ƃ��������Ȃ�A";
		mes "�@^4d4dff�e���O���[���A������";
		mes "�@^4d4dff���������Ă����Ȃ����B";
		mes "�@^4d4dff�������Ɏc���ꂽ";
		mes "�@^4d4dff�Ō�̃��~���̐S���Ȃ̂�����]^000000";
		next;
		mes "�c�c";
		next;
		menu "�S���ǂ݂܂����c�c",-;
		mes "[�j������]";
		mes "���A����Ŏ��ʂ�ł����H";
		mes "���Ƃ̔閧��m���Ă��܂����̂�";
		mes "���Y����Ă��܂���ł����H";
		next;
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�c�c�ӂ�";
		mes "�N�����ɂ����̂ł���΁A";
		mes "���Y���Ă���Ă��ǂ����B";
		mes "���͂܂��ʖڂ��B";
		next;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_warp"),"�j������ : �����c�c",1;
		mes "[�i��]";
		mes "���c�c����ł͎��́H";
		cutin "ep16_kronecker_granz_heine",255;
		next;
		mes "[�N���l�J�[]";
		mes "�N�͂�������ȏ�";
		mes "��������Ȃ��Ă����B";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�N���l�J�[]";
		mes "�����ׂ����e�������ȁB";
		mes "�܂�j�󂳂ꂽ�̂�";
		mes "���̌����Ƃ���A";
		mes "^4d4dff�U���̃��~���̐S��^000000";
		mes "�������Ƃ������Ƃ��B";
		next;
		mes "[�N���l�J�[]";
		mes "�U���ł���������";
		mes "���~���̐S���̑���Ƃ���";
		mes "�N�ɂ��C�Â���邱�ƂȂ�";
		mes "���̒n�ɏj����";
		mes "�^����������Ƃ������Ƃ��ȁB";
		next;
		mes "[�N���l�J�[]";
		mes "�����������";
		mes "�e���O���[���A�̕����B";
		mes "����̓��~���̐S���̈ꕔ�̌��Ђ�";
		mes "�׍H�������̂Ȃ̂�����c�c�B";
		mes "����ɂȂ���̂ȂǍ��邩�ǂ����B";
		next;
		mes "[�N���l�J�[]";
		mes "�V���o���c�o���h�̊�Ƃ�";
		mes "�������Ȃ���΂Ȃ�Ȃ��̂��c�c";
		mes "����A�҂Ă�c�c�B";
		next;
		menu "���͂ǂ�����΁H",-;
		mes "[�N���l�J�[]";
		mes "�����A����͐\����Ȃ��B";
		mes "�N�𗧂������܂�";
		mes "�l���ɒ^���Ă��܂����B";
		mes "����J�������B";
		next;
		mes "[�N���l�J�[]";
		mes "������ЂƂ��肢������B";
		mes "���ꂩ����j�������Ƌ���";
		mes "���̏ꏊ�ɍs���Ă݂Ă���Ȃ����H";
		next;
		mes "[�N���l�J�[]";
		mes "��c�̏�Ő����ɋc�_���ׂ����Ƃ����A";
		mes "�����炭�����ɑ傫�ȓ�����";
		mes "�ł��Ȃ����낤�Ǝv���Ă���B";
		next;
		mes "[�N���l�J�[]";
		mes "�����ōĂщߋ��̋V���̊Ԃɍs���A";
		mes "���~���̐S������邩�A";
		mes "�\�Ȃ�΂�����֎����ė��Ă���B";
		mes "�ߋ���ς��邱�ƂȂ�";
		mes "�ł��Ȃ���������Ȃ����A";
		mes "����ł����������邩������Ȃ��B";
		next;
		mes "[�N���l�J�[]";
		mes "���ł����Ƃ̋L���̊Ԃɓ����悤";
		mes "���͂�����Ŏ���Ă����B";
		mes "�t���[�h���q�ɏڂ����b��";
		mes "���Ă�������A���ꂩ��";
		mes "���ׂ����Ƃ͔ނ��畷���Ă���B";
		next;
		mes "[�N���l�J�[]";
		mes "�Ȃ�Ƃ���Ȃ��b�����A";
		mes "�������ɂ͌N�������Ȃ��B";
		mes "����ł͂�낵�����ށB";
		delquest 7703;
		setquest 7704;
		set EP16_1QUE,23;
		next;
		cutin "ep16_kronecker_granz_heine",255;
		mes "^4d4dff�]�t���[�h���q�E�V���g���c";
		mes "�@^4d4dff�E�n�C�l����ʂ���";
		mes "�@^4d4dff�ߋ��̋V���̕����Ɗ֘A����";
		mes "�@^4d4dff�������A���_���W������";
		mes "�@^4d4dff���ꂷ�邱�Ƃ��ł���悤��";
		mes "�@^4d4dff�Ȃ�܂����]^000000";
		close;
	} else if(EP16_1QUE == 23) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "����ł͓����̊ԁA";
		mes "����̌��Ɋւ��Ă�";
		mes "�N�ƃj�������Ɉ�C����B";
		next;
		mes "[�N���l�J�[]";
		mes "�����̐������������������Ȃ̂��B";
		mes "�ɔ�ɐ��s���Ă���B";
		close2;
		cutin "ep16_kronecker_granz_heine",255;
		end;
	}
	end;
}

prt_lib.gat,81,79,5	script(CLOAKED)	�N���l�J�[�E�n�C�l��#ep16_lib02	10119,{}

prt_lib.gat,88,80,0	script	#ep16_lib_evt01	139,12,12,{
OnTouch:
	if(EP16_1QUE == 9) {
		cloakoffnpc "�C�A���E�o���^�[#ep16_lib01";
		cloakoffnpc "�����B�G���E�E�B�O�i�[#ep16_lib01";
		cloakoffnpc "�}�N�V�[�~���A��#ep16_lib01";
		cloakoffnpc "�N���l�J�[�E�n�C�l��#ep16_lib01";
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_lib01";
		mes "[�C�A��]";
		mes "���҂����Ă��܂����B";
		mes "���Ȃ��ɂ��������������Ƃ�";
		mes "����܂��B";
		close;
	}
	end;
}
prt_lib.gat,83,80,5	script(CLOAKED)	�j�[�q���E�n�C�l��#ep16_lib01	10114,{
	if(EP16_1QUE == 9) {
		cutin "ep16_nihi_miseria_heine01",0;
		mes "�]�j�[�q��������]";
		close2;
		cutin "ep16_nihi_miseria_heine01",255;
		end;
	}
	end;
}
prt_lib.gat,94,82,3	script(CLOAKED)	�����ړ��@#ep16_lib	10007,{
	if(EP16_1QUE > 17) {
		mes "[�j������]";
		mes "���ꂶ�ይ���I��";
		mes "�����̋��ԂɌq���Ă݂܂��B";
		mes "�����Ȃ����Ԃ��Ƃ��Ă�";
		mes "�T��͋T��B ";
		next;
		mes "[�j������]";
		mes "�����ƁA�݂��ɑ傫�Ȏ�����";
		mes "�N�����Ǝv���鎞�_��";
		mes "�q����͂��ł���B";
		mes "�����o���܂������H";
		next;
		if(select("�����ł���","����������Ə�������")==2) {
			mes "[�j������]";
			mes "���q�������܂��ˁc�c�B";
			close;
		}
		mes "[�j������]";
		mes "����ł́A�ǂ������I";
		close2;
		warp "prt_lib_q.gat",89,43;
		end;
	}
	end;
}
prt_lib.gat,85,82,5	script(CLOAKED)	�C�A���E�o���^�[#ep16_lib01	55,{
	if(EP16_1QUE == 9) {
		mes "[�C�A��]";
		mes "�����������Ȃ���";
		mes "�҂��Ă������R�A";
		mes "���łɂ��킩��ł��傤���B";
		next;
		mes "[�C�A��]";
		mes "���Ȃ���";
		mes "^4d4dff�V���ɂ���";
		mes "^4d4dff�N���ɘb�������Ƃ�����܂����H^000000";
		next;
		mes "[�C�A��]";
		mes "���̉��Ƃ̋L���̊Ԃ�";
		mes "�j���̋V�����A";
		mes "�ꕔ�̊֌W�҈ȊO��";
		mes "�m�肦�Ȃ��ꏊ�Ȃ̂ł��c�c�B";
		next;
		menu "����́c�c",-;
		mes "[�}�N�V�[�~���A��]";
		mes "����ȕ��ɉ�肭�ǂ�";
		mes "��������`���܂����B";
		mes "�P�������ɘb���Ă��������B";
		next;
		menu "�����^���Ă����ł����H",-;
		mes "[�C�A��]";
		mes "����A�����Ă��������킯�ł́c�c";
		next;
		mes "[�C�A��]";
		mes "��������̋V����m���Ă���";
		mes "�B��́A�O���̐l�Ԃł��邽��";
		mes "�`���ɂ̂��Ƃ��Ăł��ˁc�c";
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_lib01"),"�j�[�q�� : �c�c",1;
		next;
		cutin "ep16_nihi_miseria_heine01",0;
		mes "[�j�[�q��]";
		mes "���҂����������B";
		mes "�ނł͂���܂���B";
		mes "�ނ͉��Ƃ̋L���̊Ԃ̑��݁A";
		mes "�ꏊ�������m��Ȃ������̂ł��B";
		next;
		mes "[�j�[�q��]";
		mes "�������́A���̕���";
		mes "���ʌp���҂����܂�����";
		mes "�V�����Q�ς��Ă����";
		mes "�b�����������̂͂��B";
		next;
		mes "[�j�[�q��]";
		mes "���ꂪ�ǂ��łǂ������";
		mes "�s����̂��ɂ��ẮA";
		mes "�`���җl�͒��O�܂�";
		mes "�m�炳��Ă����Ȃ������B";
		next;
		mes "[�j�[�q��]";
		mes "�\�z�O�̎��Ԃ�";
		mes "�K�v�ȏ�Ɍx������̂��킩��܂���";
		mes "���̍߂̂Ȃ����̕���";
		mes "�^���悤�Ȏ��͂��Ȃ��ŉ������B";
		next;
		unittalk getnpcid(0,"�N���l�J�[�E�n�C�l��#ep16_lib01"),"�N���l�J�[ : �ق��c�c�B",1;
		mes "[�j�[�q��]";
		mes "�����āA����́c�c";
		next;
		cloakonnpc "�N���l�J�[�E�n�C�l��#ep16_lib01";
		cloakoffnpc "�N���l�J�[�E�n�C�l��#ep16_lib02";
		mes "[�N���l�J�[]";
		mes "��ς�!!";
		mes "�N�������̕�����";
		mes "�������Ƃ��邩�H";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�����B�G��]";
		mes "�ǂ����܂����H";
		mes "��������܂������H";
		mes "���͏d�v�Șb���c�c";
		cutin "ep16_kronecker_granz_heine",255;
		next;
		mes "[�N���l�J�[]";
		mes "����قǏd�v�Ȏ��͂Ȃ��I";
		mes "^4d4dff�e���O���[���A^000000���D��ꂽ�B";
		mes "�������͂����ꗈ�関����";
		mes "�����Ȃ���΂Ȃ�Ȃ��B";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�N���l�J�[]";
		mes "������^4d4dff�e���O���[���A^000000�͏������c�c�B";
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : �e���O���[���A���H",1;
		unittalk getnpcid(0,"�����B�G���E�E�B�O�i�[#ep16_lib01"),"�����B�G�� : �������H�@����͂��������c�c�I",1;
		unittalk getnpcid(0,"�}�N�V�[�~���A��#ep16_lib01"),"�}�N�V�[�~���A�� : !!",1;
		next;
		mes "[�N���l�J�[]";
		mes "�������c�c�B";
		mes "��قǃs�[�^�[��������Ă��鎞�ɂ�";
		mes "�����ĂȂ��Ȃ��Ă����B";
		mes "�����炭�������N�����A";
		mes "�����炪�������Ă��錄��";
		mes "��炪�����������̂��낤�B";
		next;
		mes "[�N���l�J�[]";
		mes "�����āc�c";
		mes "���͂����b���Ă����B";
		mes "^4d4dff���~���̐S���͋U��^000000���ƁB";
		next;
		mes "[�j�[�q��]";
		mes "���b���ɐ\���󂲂����܂���B";
		mes "�񍐂��������Ƃ�����܂��B";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		mes "[�N���l�J�[]";
		mes "�Ȃ񂾁I";
		mes "���͗��č���ł����";
		mes "���Ă킩�邾�낤�I";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�j�[�q��]";
		mes "�d�v�Ȏ��ł��̂Łc�c�B";
		mes "���̈�A�̎����̌����ɂ���";
		mes "���������悤�Ǝv���܂��B";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		mes "[�C�A��]";
		mes "�����̌����H";
		mes "����́c�c�@����R�炵���҂�";
		mes "���q�͒m���Ă���Ƃ����Ӗ��ł����H";
		cutin "ep16_nihi_miseria_heine01",255;
		next;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_lib01"),"�j�[�q�� : �c�c",1;
		cutin "ep16_nihi_miseria_heine01",0;
		mes "[�j�[�q��]";
		mes "�V���Ɋւ��鎖��";
		mes "�O���ɘR�炵���ҁc�c�B";
		mes "����́c�c";
		if(!sleep2(1000)) end;
		mes "���Ȃ�ʎ��ł��B";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : ��!?",1;
		unittalk getnpcid(0,"�����B�G���E�E�B�O�i�[#ep16_lib01"),"�����B�G�� : !!",1;
		unittalk getnpcid(0,"�}�N�V�[�~���A��#ep16_lib01"),"�}�N�V�[�~���A�� : �ӂ��c�c",1;
		mes "�c�c�ł��̂�";
		next;
		mes "[�j�[�q��]";
		mes "�߂�₤�̂Ȃ玄�ɁB";
		next;
		mes "[�N���l�J�[]";
		mes "�ǂ����������j�[�q���I";
		mes "���O���ǂ����āI";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�j�[�q��]";
		mes "�����炭�A���̂͂��ł��B";
		mes "�N�O�Ƃ����ӎ��̒��A";
		mes "�V���ɂ��ĒN����";
		mes "�b���Ă��܂����L��������܂��B";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		menu "(�܂����A���̎��́c�c�H)",-;
		cutin "ep16_nihi_miseria_heine01",255;
		mes "�]���Ȃ��́A�j������";
		mes "�@�j�[�q�������]��";
		mes "�@�����Ԃ��ꂽ�Ƃ��̂��Ƃ�";
		mes "�@�v���o�����]";
		next;
		cutin "ep16_nihi_miseria_heine01",0;
		mes "[�j�[�q��]";
		mes "���̐ӔC�ł��B";
		mes "�ʖڂ���܂���B";
		next;
		mes "[�C�A��]";
		mes "����Ȏ����c�c";
		mes "�n�C�l���̑���q���c�c�B";
		mes "�������o���^�[�Ƃ�";
		mes "����̉��ʌp����₩���";
		mes "�O����Ă��邪�A";
		mes "����̎��͌����Ė����ł��܂���I";
		cutin "ep16_nihi_miseria_heine01",255;
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ȃ�Ă��Ƃ��c�c";
		mes "�����l���Ă���Ȏ��������̂��H";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ӗ����킩��Ȃ����B";
		mes "���ʗ~�����Ɏז��ȃs�[�^�[��";
		mes "�E�����Ƃ����̂��H";
		next;
		mes "[�j�[�q��]";
		mes "�c�c�����ł͂���܂���B";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		mes "[�N���l�J�[]";
		mes "�ٖ�������Ό����Ă݂Ȃ����B";
		mes "����ł��O���g���Ȃ��l�ԂƂ������Ƃ�";
		mes "�ς��킯�ł͂Ȃ����ȁB";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�j�[�q��]";
		mes "�ٖ��͂���܂���B";
		mes "�����c�c";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		mes "[�j�[�q��]";
		mes "�������[���~�b�h�K�b�c������";
		mes "�����Ƃł���n�C�l���Ƃ̎҂ł��B";
		mes "����Ȏ������闝�R������܂���B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���[�ށA�j�[�q���B";
		mes "�����ς�킩��Ȃ����B";
		mes "���ނ�����������Ă���B";
		cutin "ep16_nihi_miseria_heine01",255;
		next;
		mes "[�j�[�q��]";
		mes "�c�c�B";
		cutin "ep16_nihi_miseria_heine01",0;
		next;
		menu "�Ԃɓ���",-;
		mes "[�C�A��]";
		mes "�Ȃ񂾂ˁH";
		mes "�����m���Ă��鎖������̂��ˁH";
		mes "��قǂ͗]�v�ȋ^����";
		mes "�����Ă��܂��Đ\����Ȃ������B";
		mes "��������������������Ȃ�";
		mes "�b���Ă݂Ȃ����B";
		cutin "ep16_nihi_miseria_heine01",255;
		next;
		menu "�j����ł̂��Ƃ�b��",-;
		mes "[�����B�G��]";
		mes "�c�c����Ȏ����H";
		mes "�����������������߂Ă������]�A";
		mes "����Ɍ��q���܂�œD�������悤�Ɂc�c";
		next;
		mes "[�����B�G��]";
		mes "����ł͌��q�͉��҂���";
		mes "���p���ꂽ�Ɓc�c�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ȃ�قǁc�c";
		mes "�������A�����������ɁA";
		mes "���Ղɂ��̘b���L�ۂ݂ɂ��邱�Ƃ�";
		mes "�o���܂���B";
		mes "�������̂��Ƃ��ؖ�������̂�";
		mes "����܂����H";
		next;
		menu "^4d4dff�l���E�X�Ƃ̂���l^000000�Ȃ�c�c",-;
		mes "[�C�A��]";
		mes "�ӂށc�c";
		mes "�l���E�X�Ƃ̂���l��";
		mes "�ꏏ�ɖڌ������̂��c�c�B";
		next;
		mes "[�C�A��]";
		mes "�O�����c�B";
		mes "���ꂩ��ǂ��������Ȃ񂾁H";
		next;
		mes "[�N���l�J�[]";
		mes "���ɕs�R�͂������Ƃ��Ă��A";
		mes "�j�[�q�����V���̂��Ƃ�";
		mes "���O���Ă��܂����̂�";
		mes "�ԈႢ�Ȃ������B";
		mes "�Ȃ��������ɂ͂ł��Ȃ��B";
		cutin "ep16_kronecker_granz_heine",2;
		next;
		mes "[�N���l�J�[]";
		mes "�����A�l�I�������q�ׂ�̂�";
		mes "�������͂��邪�c�c";
		mes "����ԈႦ��Ή��Ƃɑ΂���";
		mes "���t�s�ׂ��B";
		mes "����͌�������͂ł��Ȃ��B";
		next;
		mes "[�N���l�J�[]";
		mes "�c�c�j�[�q���ɂ͓����̊ԁA";
		mes "���l����Ӗ��Ƃ��ċސT�𖽂���B";
		mes "�K�v�Ȏ҂����ȊO�A";
		mes "���̎҂Ƃ̐ڐG���֎~���B";
		next;
		mes "[�N���l�J�[]";
		mes "�����āA������^4d4dff�e���O���[���A^000000��";
		mes "�j�󂳂ꂽ���~���̐S���ɑ΂��Ă�";
		mes "�΍���u���Ȃ���΂Ȃ�ʁB";
		next;
		mes "[�C�A��]";
		mes "������c���K�v�ɂȂ肻�����B";
		mes "���������ɉ�c�����W���悤�B";
		cutin "ep16_kronecker_granz_heine",255;
		next;
		mes "[�C�A��]";
		mes "����ł͌�ł�����܂��傤�B";
		delquest 7693;
		setquest 73057;
		set EP16_1QUE,10;
		close2;
		pcblockmove 1;
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : �}�W�V�����I�@�Q�[�g���J���Ă���B",1;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_warp"),"�j������ : �����A�͂��B�Q�[�g�͊��ɊJ���Ă����Ԃł��I",1;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : �����Ȃ̂��B����ł͎��炷��B",1;
		if(!sleep2(3000)) end;
		cloakonnpc "�C�A���E�o���^�[#ep16_lib01";
		if(!sleep2(500)) end;
		cloakonnpc "�����B�G���E�E�B�O�i�[#ep16_lib01";
		cloakonnpc "�}�N�V�[�~���A��#ep16_lib01";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�N���l�J�[�E�n�C�l��#ep16_lib02"),"�N���l�J�[ : �j�[�q�����ꏏ�ɗ��Ȃ����B",1;
		if(!sleep2(3000)) end;
		cloakonnpc "�N���l�J�[�E�n�C�l��#ep16_lib02";
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_lib01";
		pcblockmove 0;
		end;
	}
	if(EP16_1QUE > 9) {
		mes "[�C�A��]";
		mes "������c���K�v�ɂȂ肻�����B";
		mes "���������ɉ�c�����W���悤�B";
		close2;
		pcblockmove 1;
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : �}�W�V�����I�@�Q�[�g���J���Ă���B",1;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_warp"),"�j������ : �����A�͂��B�Q�[�g�͊��ɊJ���Ă����Ԃł��I",1;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"�C�A���E�o���^�[#ep16_lib01"),"�C�A�� : �����Ȃ̂��B����ł͎��炷��B",1;
		if(!sleep2(3000)) end;
		cloakonnpc "�C�A���E�o���^�[#ep16_lib01";
		if(!sleep2(500)) end;
		cloakonnpc "�����B�G���E�E�B�O�i�[#ep16_lib01";
		cloakonnpc "�}�N�V�[�~���A��#ep16_lib01";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�N���l�J�[�E�n�C�l��#ep16_lib02"),"�N���l�J�[ : �j�[�q�����ꏏ�ɗ��Ȃ����B",1;
		if(!sleep2(3000)) end;
		cloakonnpc "�N���l�J�[�E�n�C�l��#ep16_lib02";
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_lib01";
		pcblockmove 0;
		end;
	}
	end;
}
prt_lib.gat,88,83,4	script(CLOAKED)	�����B�G���E�E�B�O�i�[#ep16_lib01	10132,{
	if(EP16_1QUE == 9) {
		mes "[�����B�G��]";
		mes "���낵�����ԂɂȂ����c�c�B";
		close;
	}
	end;
}

prt_lib.gat,76,80,3	script	�i�������g#ep16_lindt	47,{
	if(EP16_1QUE == 11) {
		mes "[�i��]";
		mes "��قǌ��Ă������̂�";
		mes "������x�������̂ł��ˁH";
		mes "�܂���������O�������̂�";
		mes "�����ɂ���܂��B";
		mes "^4d4dff���Ƃ̋L�^^000000�Ƃ������j���ł��B";
		next;
		mes "�]�i������󂯎����������";
		mes "�@�V���̕����Ɗ֘A���Ă���";
		mes "�@�����̋L�^�������]";
		unittalk getnpcid(0,"�i�������g#ep16_lindt"),"�i�� : ���Ă����ʂ��Ǝv���܂����c�c",1;
		next;
		mes "�]�����̒���";
		mes "�@����������Ă��Ȃ�";
		mes "�@����������������]";
		next;
		menu "�����͂ǂ����Ĕ����ɁH",-;
		mes "[�i��]";
		mes "��ɏ����Ă��镶�������ĉ������B";
		mes "�����ł��B";
		next;
		mes "[�i��]";
		mes "^4d4dff�^����m��҂������m�鎖���ł���B^000000";
		mes "�����ɏ����Ă���܂���ˁH";
		mes "�����炭�c�c";
		next;
		mes "[�i��]";
		mes "�^����m���Ă���҂Ƃ����̂́A";
		mes "���̐��Ɏc���Ă��Ȃ��ł��傤�B";
		mes "�ł��̂ł��̕����͉i����";
		mes "�m�鎖�̏o���Ȃ����e�A";
		mes "�Ƃ������ɂȂ�܂��B";
		next;
		mes "[�i��]";
		mes "����ŃO�����c����l��";
		mes "���߂Ă��̂܂ܖ߂����̂ł��B";
		mes "�m�F�͂�����낵���ł����H";
		mes "����͂܂��������Ă����܂��B";
		set EP16_1QUE,12;
		close;
	}
	if(EP16_1QUE == 22) {
		mes "[�i��]";
		mes "���A���܂����ˁB";
		mes "�O�����c�������قǂ���";
		mes "���҂����Ă���܂��B";
		close;
	}
	mes "[�i��]";
	mes "���̉Ɩ�͑�X������";
	mes "���Ƃ̋L���̊Ԃ��Ǘ����Ă��܂��B";
	mes "������p�L�^���Ȃ̂�";
	mes "������O�ł����B";
	next;
	mes "[�i��]";
	mes "���́A��ォ��󂯂����΂����";
	mes "�m��Ȃ�����������Ԃł��c�c";
	mes "����Ȃɂ������̌��݊t����";
	mes "�K�˂ė���Ƃ͎v���Ă�";
	mes "���܂���ł�������c�c";
	close;
}

prt_lib.gat,91,85,3	script	�}�W�V�����E�j������#ep16_warp	735,{
	switch(EP16_1QUE) {
	case 8:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�]^4d4dff���̃C�x���g��";
			mes "�@^4d4dff�������A���_���W�����Ői�s���܂��B";
			mes "�@^4d4dff�p�[�e�B�[������������A";
			mes "�@^4d4dff������x�����ĉ�����^000000�]";
			close;
		}
		if(getonlinepartymember() != 1) {
			mes "�]^4d4dff���̃C�x���g��";
			mes "�@^4d4dff1�l��p�̃������A���_���W������";
			mes "�@^4d4dff�i�s���܂��B";
			mes "�@^4d4dff�p�[�e�B�[�����o�[��1�l�̏�Ԃ�";
			mes "�@^4d4dff������x�����ĉ�����^000000�]";
			close;
		}
		mes "[�j������]";
		mes "����������ԍŌ�ł���B";
		mes "���̕������͂��ł�";
		mes "���ꂵ���݂����ł��B";
		mes "���ʌp���̋V���ɎQ�����܂����H";
		next;
		mes "�]^4d4dff���ʌp���̋V���̒��ӎ���^000000�]";
		mes "�@�ȉ��̃N�G�X�g��";
		mes "�@���ʌp���̋V�����J�n����O��";
		mes "�@�ݒ�ŃX�g�[���[���i�s���܂��B";
		mes "�@";
		mes "�@�E�E�B�O�i�[�Ƃ̐S�̔��N�G�X�g";
		mes "�@�E�E�B�O�i�[�Ƃ̐S�̔�(���܂�)�N�G�X�g";
		mes "�@�E���x���u���O�Ƃ��J�N�G�X�g";
		mes "�@�E�G�����X�g���q�ƃQ�I���O�ƃN�G�X�g";
		mes "�@�E�o���^�[�Ƃ̒����N�G�X�g";
		mes "�@";
		mes "�@�����X�g�[���[�̓��e��";
		mes "�@���y���݂����ꍇ��";
		mes "�@��L�̃N�G�X�g���ɐi�s���邱�Ƃ�";
		mes "�@�����߂������܂��B";
		next;
		switch(select("�����ɓ��ꂷ��","���ꂵ�Ȃ�","�������Ăق���","�����ɖ߂肽��")) {
		case 1:
			mes "[�j������]";
			mes "�V���̊Ԃւ̃Q�[�g��";
			mes "�J���܂����I";
			mes "�����A�s���܂��傤�I";
			cloakoffnpc "�V���̊Ԃւ̓���#evt_gate01";
			mdcreate "blessing_rituals";
			close;
		case 2:
			mes "[�j������]";
			mes "�����ł����c�c";
			mes "���܂�x���Ȃ�̂�";
			mes "�悭�Ȃ��̂Ɂc�c�B";
			close;
		case 3:
			mes "[�j������]";
			mes "����`�A�����ĂȂ���ł����`�H";
			mes "���ʌp���̋V�����n�܂��ł��I";
			mes "���̕������͂��ł�";
			mes "���ꂵ���݂����ł���`�B";
			close;
		case 4:
			mes "[�j������]";
			mes "�Y����̂ł����`�H";
			mes "�V�����n�܂����Ⴂ�܂���I";
			mes "�}���ł��������ˁI";
			close2;
			warp "prt_cas_q.gat",30,28;
			end;
		}
	case 9:
		mes "[�j������]";
		mes "���ŉ����N�����̂ł����H";
		mes "����͈�́c�c�B";
		next;
		mes "[�j������]";
		mes "�����m��ׂ����ł͂Ȃ��A";
		mes "�����o����΂��ʂł�����܂���";
		mes "�C�ɂȂ�܂��ˁB";
		next;
		mes "[�j������]";
		mes "���͂̓������������ł��ˁB";
		mes "�c�c�Q�[�g���s����Ɍ�����̂�";
		mes "�C�̂����ł��傤���H";
		close;
	case 10:
		mes "[�j������]";
		mes "����͍���܂����ˁB";
		mes "���A�ړ����������Ō��";
		mes "�Q�[�g�ɖ�肪�������܂����c�c�B";
		next;
		mes "[�j������]";
		mes "�����͖��@�̐���";
		mes "���ɑ傫���ꏊ�ł��̂ŁA";
		mes "�����Q�[�g���J�����x����";
		mes "�o���Ȃ��āc�c�B";
		next;
		menu "�܂�ǂ��������H",-;
		mes "[�j������]";
		mes "�܂�ł��ˁc�c�B";
		mes "�����čs���Ȃ���΂Ȃ�Ȃ��Ȃ����B";
		mes "�Ƃ܂��A����Șb�ł��B";
		mes "�c�c�������I";
		next;
		mes "[�j������]";
		mes "^4d4dff��قǑ���t����";
		mes "^4d4dff�����ɂȂ��Ă�������^000000�A";
		mes ""+strcharinfo(0)+"�l��";
		mes "��x�����ɂȂ�܂����H";
		next;
		mes "[�j������]";
		mes "�ׁA�ʂɋC�ɂȂ�킯�ł�";
		mes "����܂����H";
		next;
		mes "[�j������]";
		mes "������Ƃ����D��S�c�c";
		mes "�����A���ł��Ȃ��ł��B";
		mes "�ǂ��ł��H�@���Ă݂܂��񂩁I";
		mes "�����Ď��ɂ����̓��e�����ЁI";
		setquest 7694;	// state=1
		delquest 73057;
		set EP16_1QUE,11;
		close;
	case 11:
		mes "[�j������]";
		mes "�C�ɂȂ�Ȃ���ł���!?";
		mes "����t��������";
		mes "�ꏏ�ɏo�Ă��܂�������A";
		mes "�i���ɂ������܂�Ȃ���";
		mes "�����Ă����͂��Ȃ̂ɁH";
		next;
		mes "[�j������]";
		mes "���̊ԁA�ǂ�����΃Q�[�g��";
		mes "�J�������ł��邩���ׂĂ݂܂��B";
		close;
	case 12:
		mes "[�j������]";
		mes "�c�c";
		mes "^4d4dff�^����m��҂������m�鎖���ł���A^000000";
		mes "�Ƃ́c�c�B";
		mes "�����A�Ӗ����Ȃ���B";
		next;
		mes "[�j������]";
		mes "�������A";
		mes "����ȏケ���ɂ��Ă�";
		mes "���̈Ӗ�������܂����B";
		mes "���܂�ǂ���C�ł��Ȃ��ł����A";
		mes "������������o�܂��傤�B";
		next;
		mes "[�j������]";
		mes "�Q�[�g�𒲂ׂĂ݂܂������A";
		mes "�����ő傫�Ȗ��͂�";
		mes "�����̂悤�Ȃ��̂�";
		mes "�N����܂���ł������H";
		next;
		mes "[�j������]";
		mes "���̖��͘c�Ȃ��������܂��B";
		mes "�����ł��ˁc�c";
		mes "^4d4dff�����̋���^000000�Ǝ���������";
		mes "���̘͂c�݂ł��ˁB";
		next;
		mes "[�j������]";
		mes "�����Ɏ����Q�[�g������̂��ȁc�c";
		mes "����͂���Ŗʔ������ł����ǂˁB";
		next;
		mes "[�j������]";
		mes "���낢�날���č��̓Q�[�g��";
		mes "�g�����ɂȂ�Ȃ��̂�";
		mes "�����ďo�܂��傤�B";
		next;
		mes "[�j������]";
		mes "������ɃN���Z�C�_�[�̕���";
		mes "���܂���ˁH";
		mes "�o���肷��ʘH���Ǘ����Ă��܂��̂ŁA";
		mes "���̕����ē����Ă���܂���B";
		delquest 7694;
		setquest 7695;
		set EP16_1QUE,13;
		close;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "[�j������]";
		mes "���낢�날���č��̓Q�[�g��";
		mes "�g�����ɂȂ�Ȃ��̂�";
		mes "�����ďo�܂��傤�B";
		next;
		mes "[�j������]";
		mes "������ɃN���Z�C�_�[�̕���";
		mes "���܂���ˁH";
		mes "�o���肷��ʘH���Ǘ����Ă��܂��̂ŁA";
		mes "���̕����ē����Ă���܂���B";
		close;
	case 18:
		mes "[�j������]";
		mes "�ӂӂӁc�c";
		mes "����ł͍s���܂���B";
		mes "�o�ł�I";
		mes "^4d4dff�ǂ��ł������ړ��@�`�`^000000!!";
		next;
		cloakoffnpc "�����ړ��@#ep16_lib";
		mes "[�j������]";
		mes "�����A�s���܂��傤���B";
		mes "����͉������邱�Ƃ�";
		mes "�ł���̂��y���݂ł��B";
		setquest 7700;
		delquest 7699;
		set EP16_1QUE,19;
		close;
	case 19:
	case 20:
	case 21:
		mes "[�j������]";
		mes "�ӂӂӁc�c";
		mes "����ł͍s���܂���B";
		mes "�o�ł�I";
		mes "^4d4dff�ǂ��ł������ړ��@�`�`^000000!!";
		next;
		cloakoffnpc "�����ړ��@#ep16_lib";
		mes "[�j������]";
		mes "�����A�s���܂��傤���B";
		mes "����͉������邱�Ƃ�";
		mes "�ł���̂��y���݂ł��B";
		close;
	case 22:
		mes "[�j������]";
		mes "�������Ă����ł����H";
		mes "�����i���Ɍ�����";
		mes "�����̋L�^��ǂ܂��Ă����Ȃ��ƁI";
		mes "�^����m�������Ȃ�";
		mes "�����킩�邩������܂���I";
		next;
		cloakoffnpc "�N���l�J�[�E�n�C�l��#ep16_lib01";
		mes "[�j������]";
		mes "���ׂ̈Ɏ�������";
		mes "����ȋ�J�����Ă�����ł����H";
		mes "���A���Ă��������B";
		mes "�O�����c�����";
		mes "��������Ⴂ�܂�����B";
		close;
	case 23:
		mes "[�j������]";
		mes "^4d4dff�n�C�l���Ƃ��u���Ƃ̋L���̊ԁv��";
		mes "���R�ɏo����o����悤��";
		mes "����^000000������Ă����炵���ł��ˁB";
		mes "�������A���ꂩ�猙�Ƃ����ق�";
		mes "����ƂɂȂ�܂��ˁB";
		mes "�ӂӁA���ꂪ�^���Ƃ������̂ł��B";
		next;
		mes "[�j������]";
		mes "�������Ă����ł����H";
		mes "^4d4dff�t���[�h���q���݊t���ɉ����";
		mes "�������肽���m�F^000000���Ȃ��ƁI";
		close;
	case 24:
		mes "[�j������]";
		mes "�����������������̉B�����s��";
		mes "�o�������ł��ˁI";
		mes "�n�b�n�b�n�A���҂��Ăĉ������I";
		mes "���������ʑҋ��ł�����I";
		next;
		cloakoffnpc "�����ړ��@#ep16_lib";
		mes "[�j������]";
		mes "���A�o�����܂���B";
		mes "�����͉������ʂ��o�܂����ˁH";
		mes "�����A���s���Ƃ͎v���܂����ǁB";
		mes "���͂͂͂͂́B";
		close;
	}
	end;
}
prt_lib.gat,88,90,1	script(CLOAKED)	�V���̊Ԃւ̓���#evt_gate01	10007,{
	if(EP16_1QUE == 8) {
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�]^4d4dff���̃C�x���g��";
			mes "�@^4d4dff�������A���_���W�����Ői�s���܂��B";
			mes "�@^4d4dff�p�[�e�B�[������������A";
			mes "�@^4d4dff������x�����ĉ�����^000000�]";
			close;
		}
		if(getonlinepartymember() != 1) {
			mes "�]^4d4dff���̃C�x���g��";
			mes "�@^4d4dff1�l��p�̃������A���_���W������";
			mes "�@^4d4dff�i�s���܂��B";
			mes "�@^4d4dff�p�[�e�B�[�����o�[��1�l�̏�Ԃ�";
			mes "�@^4d4dff������x�����ĉ�����^000000�]";
			close;
		}
		mes "�]�j���̋V�����s����ꏊ��";
		mes "�@�ړ����\�ł��]";
		next;
		if(select("����","����Ȃ�") == 2) {
			mes "[�j������]";
			mes "���̃Q�[�g�͈ꎞ�I��";
			mes "�J�������̂Ȃ̂�";
			mes "�����͎����܂����c�c";
			close;
		}
		switch(mdenter("blessing_rituals")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[blessing_rituals] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			donpcevent getmdnpcname("#royal_Control1")+ "::OnStart";
			close;
		case 1:	// �p�[�e�B�[������
			mes "�]�������A���_���W������";
			mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
			mes "�@�������A���_���W�����ɓ���܂��]";
			close;
		case 2:	// �_���W�������쐬
			mes "[�j������]";
			mes "�V���̊ԂɌ������Q�[�g��";
			mes "�����ƊJ���Ă��܂���B";
			mes "������Ƒ҂��ĉ������B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
}

2@mir.gat,0,0,0		script	#royal_Control1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#02");
	hideonnpc getmdnpcname("�w�����g�E���x���u���O#02");
	hideonnpc getmdnpcname("�����B�G���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�����Q���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�}�N�V�[�~���A��#02");
	hideonnpc getmdnpcname("���H���t�E���x���u���O#02");
	hideonnpc getmdnpcname("�A�O�l�X�E���x���u���O#02");
	hideonnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�J�g�����E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�L���T�����E�Q�I���O#02");
	hideonnpc getmdnpcname("�X�s�[�J�E�l���E�X#02");
	hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#03");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#03");
	hideonnpc getmdnpcname("�|�[�E���n���g#02");
	hideonnpc getmdnpcname("�C�A���E�o���^�[#02");
	hideonnpc getmdnpcname("�A�C�[���E�A�m#02");
	hideonnpc getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	hideonnpc getmdnpcname("�N���l�J�[�E�n�C�l��#02");
	hideonnpc getmdnpcname("�|�ꂽ�s�[�^�[#02");
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#03");
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#02");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#02");
	hideonnpc getmdnpcname("�N����#hunter01");
	hideonnpc getmdnpcname("�N����#hunter02");
	hideonnpc getmdnpcname("�N����#hunter03");
	hideonnpc getmdnpcname("�N����#hunter04");
	hideonnpc getmdnpcname("�N����#hunter05");
	hideonnpc getmdnpcname("�N����#hunter06");
	end;
}

2@mir.gat,101,12,0	script	royal_evt01		139,1,1,{
OnTouch:
	disablenpc;
	hideonnpc getmdnpcname("to_prt_lib");
	initnpctimer getmdnpcname("#royal_evt02");
	mes "["+strcharinfo(0)+"]";
	mes "�i�܂��Ȃ��V�����͂��܂�悤���j";
	mes "�@";
	mes "�]�j���̋V���ɎQ�񂵂悤�]";
	close;
}

2@mir.gat,101,10,0	script	to_prt_lib					45,1,1,{
	end;
OnTouch:
	mes "�i�������猳�����ꏊ��";
	mes "�߂ꂻ�����c�c�j";
	mes "�@";
	mes "�]�߂�܂����H�]";
	next;
	if(select("�߂�Ȃ�","�߂�")==1) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	close2;
	warp "prt_lib.gat",88,80;
	end;
}

2@mir.gat,103,17,3	script	�j�[�q���E�n�C�l��#01		10114,{
	mes "[�X�L�A]";
	mes "��������Ⴂ�܂����ˁI";
	mes "���҂����Ă���܂����B";
	cutin "ep16_skia_nerius01",0;
	next;
	mes "[�j�[�q��]";
	mes "�҂��Ă��܂����B";
	mes "���̉Ɩ�̕�������";
	mes "�S�������Ă��܂��B";
	cutin "ep16_nihi_miseria_heine01",2;
	next;
	mes "[�j�[�q��]";
	mes "�c�c";
	mes "������a��������܂��B";
	mes "��قǒN�������������悤��";
	mes "�������̂ł����c�c";
	mes "�C�̂����ł��傤���H";
	next;
	mes "[�X�L�A]";
	mes "�}���܂��傤�B";
	mes "����ȏ�A�F��҂������ɂ�";
	mes "�����܂���B";
	cutin "ep16_skia_nerius01.bmp",0;
	next;
	mes "[�X�L�A]";
	mes "^4d4dff���n���g����q�l�ׂ̗̐Ȃ�";
	mes "^4d4dff���i�݂��������B^000000";
	mes "�������Q�ψ��Ƃ��ďo�Ȃ����";
	mes "���Ȃ��ɗp�ӂ��ꂽ�Ȃł��B";
	next;
	mes "[�X�L�A]";
	mes "�����A�s���܂��傤�B";
	cutin "ep16_skia_nerius01.bmp",0;
	close2;
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#01");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#01");
	hideoffnpc getmdnpcname("�j�[�q���E�n�C�l��#02");
	hideoffnpc getmdnpcname("�X�L�A�E�l���E�X#02");
	cutin "ep16_skia_nerius01",255;
	end;
}
2@mir.gat,100,17,5	script	�X�L�A�E�l���E�X#01			10116,{
	mes "[�X�L�A]";
	mes "��������Ⴂ�܂����ˁI";
	mes "���҂����Ă���܂����B";
	cutin "ep16_skia_nerius01",0;
	next;
	mes "[�j�[�q��]";
	mes "�҂��Ă��܂����B";
	mes "���̉Ɩ�̕�������";
	mes "�S�������Ă��܂��B";
	cutin "ep16_nihi_miseria_heine01",2;
	next;
	mes "[�j�[�q��]";
	mes "�c�c";
	mes "������a��������܂��B";
	mes "��قǒN�������������悤��";
	mes "�������̂ł����c�c";
	mes "�C�̂����ł��傤���H";
	next;
	mes "[�X�L�A]";
	mes "�}���܂��傤�B";
	mes "����ȏ�A�F��҂������ɂ�";
	mes "�����܂���B";
	cutin "ep16_skia_nerius01.bmp",0;
	next;
	mes "[�X�L�A]";
	mes "^4d4dff���n���g����q�l�ׂ̗̐Ȃ�";
	mes "^4d4dff���i�݂��������B^000000";
	mes "�������Q�ψ��Ƃ��ďo�Ȃ����";
	mes "���Ȃ��ɗp�ӂ��ꂽ�Ȃł��B";
	next;
	mes "[�X�L�A]";
	mes "�����A�s���܂��傤�B";
	cutin "ep16_skia_nerius01.bmp",0;
	close2;
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#01");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#01");
	hideoffnpc getmdnpcname("�j�[�q���E�n�C�l��#02");
	hideoffnpc getmdnpcname("�X�L�A�E�l���E�X#02");
	cutin "ep16_skia_nerius01",255;
	end;
}

2@mir.gat,101,88,4	script	�N���l�J�[�E�n�C�l��#01		10119,{
	end;
OnStart:
	set .phase,1;
	initnpctimer;
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#01");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#01");
	hideoffnpc getmdnpcname("�j�[�q���E�n�C�l��#02");
	hideoffnpc getmdnpcname("�X�L�A�E�l���E�X#02");
	announce "�N���l�J�[ : �x���Ȃ������V����i�߂悤�B", 0x9, 0x00ff99;
	end;
OnTimer3000:
	announce "�N���l�J�[ : �����̓`���ɑ���A�����Ƃ̈ӎv�Ɨ����������m�F�������B", 0x9, 0x00ff99;
	end;
OnTimer6000:
	unittalk getnpcid(0,getmdnpcname("�t���[�h���q�E�n�C�l��#01")),"�t���[�h���q : �n�C�l��";
	unittalk getnpcid(0,getmdnpcname("�j�[�q���E�n�C�l��#02")),"�j�[�q�� : �n�C�l��";
	end;
OnTimer9000:
	unittalk getnpcid(0,getmdnpcname("�X�L�A�E�l���E�X#02")),"�X�L�A : �l���E�X";
	unittalk getnpcid(0,getmdnpcname("�X�s�[�J�E�l���E�X#01")),"�X�s�[�J : �l���E�X";
	end;
OnTimer12000:
	unittalk getnpcid(0,getmdnpcname("�A�C�[���E�A�m#01")),"�A�C�[���E�A�m : �o���^�[";
	unittalk getnpcid(0,getmdnpcname("�C�A���E�o���^�[#01")),"�C�A�� : �o���^�[";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�����B�G���E�E�B�O�i�[#01")),"�����B�G�� : �E�B�O�i�[";
	unittalk getnpcid(0,getmdnpcname("�����Q���E�E�B�O�i�[#01")),"�����Q�� : �E�B�O�i�[";
	unittalk getnpcid(0,getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#01")),"�A�C�U�b�N : �E�B�O�i�[";
	unittalk getnpcid(0,getmdnpcname("�J�g�����E�E�B�O�i�[#01")),"�J�g���� : �E�B�O�i�[";
	end;
OnTimer18000:
	unittalk getnpcid(0,getmdnpcname("�L���T�����E�Q�I���O#01")),"�L���T���� : �Q�I���O";
	unittalk getnpcid(0,getmdnpcname("�G�����X�g�E�Q�I���O#01")),"�G�����X�g : �Q�I���O";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�|�[�E���n���g#01")),"�|�[ : ���n���g";
	end;
OnTimer24000:
	unittalk getnpcid(0,getmdnpcname("�}�N�V�[�~���A��#01")),"�}�N�V�[�~���A�� : ���x���u���O";
	unittalk getnpcid(0,getmdnpcname("���H���t�E���x���u���O#01")),"���H���t : ���x���u���O";
	unittalk getnpcid(0,getmdnpcname("�w�����g�E���x���u���O#01")),"�w�����g : ���x���u���O";
	unittalk getnpcid(0,getmdnpcname("�A�O�l�X�E���x���u���O#01")),"�A�O�l�X : ���x���u���O";
	end;
OnTimer27000:
	announce "�N���l�J�[ : ���[���~�b�h�K�b�c���x���鎵���Ƃ̈ӂ��󂯌p����", 0x9, 0x00ff99;
	end;
OnTimer30000:
	announce "�N���l�J�[ : �����ɐV�����㗝�҂��I�肳�ꂽ�B", 0x9, 0x00ff99;
	end;
OnTimer33000:
	announce "�N���l�J�[ : ��n�̉h���Əj�������Ȃ��Ƌ��ɂ��邱�Ƃ��F��B", 0x9, 0x00ff99;
	end;
OnTimer36000:
	unittalk getnpcid(0,getmdnpcname("�t���[�h���q�E�n�C�l��#01")),"�t���[�h���q : ���݂��邷�ׂĂ̂��̂ɋ����ꂽ�����̗͂�";
	unittalk getnpcid(0,getmdnpcname("�j�[�q���E�n�C�l��#02")),"�j�[�q�� : ���݂��邷�ׂĂ̂��̂ɋ����ꂽ�����̗͂�";
	end;
OnTimer39000:
	unittalk getnpcid(0,getmdnpcname("�L���T�����E�Q�I���O#01")),"�L���T���� : �����Ȃ鎞���ނ����A�X�Ȃ������ݏo���A�G�𐧈�����E�C��";
	unittalk getnpcid(0,getmdnpcname("�G�����X�g�E�Q�I���O#01")),"�G�����X�g : �����Ȃ鎞���ނ����A�X�Ȃ������ݏo���A�G�𐧈�����E�C��";
	end;
OnTimer42000:
	unittalk getnpcid(0,getmdnpcname("�X�L�A�E�l���E�X#02")),"�X�L�A : ���̒��ɂ��邷�ׂĂ��ݍ��ނ��Ƃ��ł��銰��ȐS��";
	unittalk getnpcid(0,getmdnpcname("�X�s�[�J�E�l���E�X#01")),"�X�s�[�J : ���̒��ɂ��邷�ׂĂ��ݍ��ނ��Ƃ��ł��銰��ȐS��";
	end;
OnTimer45000:
	unittalk getnpcid(0,getmdnpcname("�|�[�E���n���g#01")),"�|�[ : ���ɕ������S�Ă����鋭�x�Ȋo���";
	end;
OnTimer48000:
	unittalk getnpcid(0,getmdnpcname("�A�C�[���E�A�m#01")),"�A�C�[���E�A�m : �����N�����Ă����`�ƐM�O���Ȃ��Ȃ��ւ��";
	unittalk getnpcid(0,getmdnpcname("�C�A���E�o���^�[#01")),"�C�A�� : �����N�����Ă����`�ƐM�O���Ȃ��Ȃ��ւ��";
	end;
OnTimer51000:
	unittalk getnpcid(0,getmdnpcname("�}�N�V�[�~���A��#01")),"�}�N�V�[�~���A�� : ���g��葼�҂����A�����ޔ�����";
	unittalk getnpcid(0,getmdnpcname("���H���t�E���x���u���O#01")),"���H���t : ���g��葼�҂����A�����ޔ�����";
	unittalk getnpcid(0,getmdnpcname("�w�����g�E���x���u���O#01")),"�w�����g : ���g��葼�҂����A�����ޔ�����";
	unittalk getnpcid(0,getmdnpcname("�A�O�l�X�E���x���u���O#01")),"�A�O�l�X : ���g��葼�҂����A�����ޔ�����";
	end;
OnTimer54000:
	unittalk getnpcid(0,getmdnpcname("�����B�G���E�E�B�O�i�[#01")),"�����B�G�� : �^�������ʂ������ł���m�b�Ɠ܂�Ȃ�����";
	unittalk getnpcid(0,getmdnpcname("�����Q���E�E�B�O�i�[#01")),"�����Q�� : �^�������ʂ������ł���m�b�Ɠ܂�Ȃ�����";
	unittalk getnpcid(0,getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#01")),"�A�C�U�b�N : �^�������ʂ������ł���m�b�Ɠ܂�Ȃ�����";
	unittalk getnpcid(0,getmdnpcname("�J�g�����E�E�B�O�i�[#01")),"�J�g���� : �^�������ʂ������ł���m�b�Ɠ܂�Ȃ�����";
	end;
OnTimer57000:
	announce "�N���l�J�[ : �����Ƃ̖��̌��ɁA�V�������������Ɂc�c", 0x9, 0x00ff99;
	end;
OnTimer60000:
	announce "�s�[�^�[ : ��������!!�@���A���܂��́c���!?", 0x9, 0x00ff99, 0x0190, 24, 0, 0;
	end;
OnTimer63000:
	announce "�H�H�H : �M���n�n�b�b!!�@�s�[�^�[���𓢂��������`�`!!", 0x9, 0x00ff99, 0x0190, 24, 0, 0;
	end;
OnTimer63500:
	misceffect 563,"�s�[�^�[�E�n�C�l��#01";
	hideonnpc getmdnpcname("�s�[�^�[�E�n�C�l��#01");
	hideoffnpc getmdnpcname("�|�ꂽ�s�[�^�[#02");
	end;
OnTimer65000:
	announce "�N���l�J�[ : �s�[�^�[!?", 0x9, 0x00ff99;
	end;
OnTimer65500:
	hideonnpc getmdnpcname("�N���l�J�[�E�n�C�l��#01");
	hideoffnpc getmdnpcname("�N���l�J�[�E�n�C�l��#02");
	end;
OnTimer66000:
	hideoffnpc getmdnpcname("�N����#hunter01");
	announce "�H�H�H : �����Ƃ̊F�l�����낢�ŁI�@�M�����\�̑匫�҃O�����c����ł��ˁI", 0x9, 0x00ff99;
	end;
OnTimer69000:
	announce "�N���l�J�[ : �M�l�A���҂��b�I�@���̖ړI�ŁA�ǂ�����Ă����ɓ����Ă���!?", 0x9, 0x00ff99;
	end;
OnTimer73000:
	announce "�H�H�H : ���₟�c�c�Ђǂ�����Ȃ��ł����`�I��X���x���Ȃ�ā`�`!!", 0x9, 0x00ff99;
	end;
OnTimer76000:
	announce "�H�H�H : ������ɂƂĂ��M�d�ȕ����B���Ă���ƕ������Ă�����������Ă����̂Ɂc�c!", 0x9, 0x00ff99;
	end;
OnTimer79000:
	announce "�H�H�H : �c�c����A�U������Ȃ��ł���!!", 0x9, 0x00ff99;
	misceffect 12,getmdnpcname("�N���l�J�[�E�n�C�l��#02");
	end;
OnTimer79500:
	misceffect 58,getmdnpcname("�N����#hunter01");
	misceffect 200,getmdnpcname("�N����#hunter01");
	end;
OnTimer81500:
	announce "�H�H�H : ���̃��~���̐S���͋U��!!�@�Ђǂ��Ђǂ�!!�@�����Ƃ͉R�����Ă����񂾂���!!", 0x9, 0x00ff99;
	end;
OnTimer84500:
	announce "�H�H�H : ���O�炪�������~���̐S���I�@���ʌp���̋V���ŁA���̏ꏊ�̕��󂪉���������ĕ��������痈���̂ɁB", 0x9, 0x00ff99;
	end;
OnTimer87500:
	announce "�H�H�H : �U���U���U���U���U��!!���~���̐S�����U���ł����[�[!!", 0x9, 0x00ff99;
	end;
OnTimer91000:
	announce "�N���l�J�[ : �c�c�Ȃ�̂��Ƃ��I", 0x9, 0x00ff99;
	end;
OnTimer93500:
	announce "�H�H�H : ����H�@�m��Ȃ��Ƃ������Ⴂ�܂����H�@���k���B", 0x9, 0x00ff99;
	end;
OnTimer96500:
	announce "�H�H�H : ���ꂪ������m���Ă邩�炱���A����Ȓn���̉B�ꂽ�ꏊ�ŋV�������Ă���̂ł��傤�H", 0x9, 0x00ff99;
	end;
OnTimer99500:
	announce "�N���l�J�[ : �c�c�I", 0x9, 0x00ff99;
	end;
OnTimer101500:
	announce "�H�H�H : ����Ȃ��ɂ܂Ȃ��ł���������`�B�������ʑ��������ƃK�b�N���A���𗎂Ƃ��Ă��鏊�ł��B", 0x9, 0x00ff99;
	end;
OnTimer104500:
	announce "�H�H�H : ������`�`�A����Ɂ`�A�s�[�^�[���̐S���������Ă������Ƃɂ��܂���!!", 0x9, 0x00ff99;
	end;
OnTimer107500:
	announce "�H�H�H : �ʂɂ����ł���`�H�@�ꂳ�񂽂����k�����ď���Ɍ��߂����l�Ȃ񂾂���I", 0x9, 0x00ff99;
	end;
OnTimer110500:
	announce "�H�H�H : �����Ƃ̗��v�̂��߂Ɂ`�A���߂�ꂽ�U�҂̉��l�`�I", 0x9, 0x00ff99;
	end;
OnTimer113500:
	announce "�H�H�H : ���[���~�b�h�K�b�c�����͋U�����炯�`�`��!!", 0x9, 0x00ff99;
	end;
OnTimer116500:
	announce "�H�H�H : �U�����������̍��̐^���I�@�}�������炨�O��͉������_�ł��Ȃ��`�`!!�@", 0x9, 0x00ff99;
	end;
OnTimer119500:
	announce "�N���l�J�[ : �����I�@���̂�`�`!!", 0x9, 0x00ff99;
	end;
OnTimer122500:
	announce "�H�H�H : �����`�b!!�@�������O�I�@��l�Ńm�R�m�R��!!", 0x9, 0x00ff99;
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#02");
	hideoffnpc getmdnpcname("�j�[�q���E�n�C�l��#03");
	end;
OnTimer125500:
	announce "�j�[�q�� : �ق�!!!", 0x9, 0x00ff99, 0x0190, 24, 0, 0;
	misceffect 1,getmdnpcname("�N����#hunter01");
	end;
OnTimer128500:
	announce "�N���l�J�[ : �j�[�q��!!", 0x9, 0x00ff99;
	end;
OnTimer131500:
	announce "�j�[�q�� : �c�����A�n�C�l���Ƃ��c�c", 0x9, 0x00ff99, 0x0190, 24, 0, 0;
	end;
OnTimer134500:
	announce "�j�[�q�� : ���[���~�b�h�K�b�c��������M����̂́A���������Ȃ��I", 0x9, 0x00ff99, 0x0190, 24, 0, 0;
	end;
OnTimer137500:
	announce "�H�H�H : �Ă߂��c�c�����Ԃ��₪�����ȁ`�`�`�b!!�@���������˂�!!�@�S���̐S����؂蔲���Ă��!!", 0x9, 0x00ff99;
	misceffect 220,getmdnpcname("�N����#hunter01");
	misceffect 55,getmdnpcname("�N����#hunter01");
	misceffect 563,getmdnpcname("�s�[�^�[�E�n�C�l��#01");
	misceffect 90,getmdnpcname("�N���l�J�[�E�n�C�l��#02");
	misceffect 90,getmdnpcname("�����B�G���E�E�B�O�i�[#01");
	misceffect 90,getmdnpcname("�L���T�����E�Q�I���O#01");
	hideonnpc getmdnpcname("�C�A���E�o���^�[#01");
	hideonnpc getmdnpcname("�����B�G���E�E�B�O�i�[#01");
	hideonnpc getmdnpcname("�����Q���E�E�B�O�i�[#01");
	hideonnpc getmdnpcname("�L���T�����E�Q�I���O#01");
	hideoffnpc getmdnpcname("�C�A���E�o���^�[#02");
	hideoffnpc getmdnpcname("�����B�G���E�E�B�O�i�[#02");
	hideoffnpc getmdnpcname("�����Q���E�E�B�O�i�[#02");
	hideoffnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#02");
	hideoffnpc getmdnpcname("�J�g�����E�E�B�O�i�[#02");
	hideoffnpc getmdnpcname("�L���T�����E�Q�I���O#02");
	misceffect 90,getmdnpcname("�}�N�V�[�~���A��#01");
	hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#01");
	hideonnpc getmdnpcname("�}�N�V�[�~���A��#01");
	hideonnpc getmdnpcname("���H���t�E���x���u���O#01");
	hideonnpc getmdnpcname("�A�O�l�X�E���x���u���O#01");
	hideoffnpc getmdnpcname("�G�����X�g�E�Q�I���O#02");
	hideoffnpc getmdnpcname("�}�N�V�[�~���A��#02");
	hideoffnpc getmdnpcname("���H���t�E���x���u���O#02");
	hideoffnpc getmdnpcname("�A�O�l�X�E���x���u���O#02");
	misceffect 90,getmdnpcname("�A�O�l�X�E���x���u���O#02");
	end;
OnTimer138000:
	announce "�H�H�H : �M���n�n�n�n�b�b!!�@���̕����ǂ��ƍŌ�Ɋy�������Ԃ����߂������������ˁ`!!", 0x9, 0x00ff99;
	hideonnpc getmdnpcname("�N����#hunter01");
	hideoffnpc getmdnpcname("�N����#hunter02");
	hideoffnpc getmdnpcname("�N����#hunter03");
	hideoffnpc getmdnpcname("�N����#hunter04");
	hideoffnpc getmdnpcname("�N����#hunter05");
	hideoffnpc getmdnpcname("�N����#hunter06");
	end;
OnTimer138500:
	set .phase,2;
	hideonnpc getmdnpcname("�A�C�[���E�A�m#01");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#02");
	hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#01");
	hideonnpc getmdnpcname("�t���[�h���q�E�n�C�l��#01");
	hideonnpc getmdnpcname("�X�s�[�J�E�l���E�X#01");
	hideonnpc getmdnpcname("�w�����g�E���x���u���O#01");
	hideonnpc getmdnpcname("�|�[�E���n���g#01");
	hideonnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#01");
	hideonnpc getmdnpcname("�J�g�����E�E�B�O�i�[#01");
	hideoffnpc getmdnpcname("�A�C�[���E�A�m#02");
	hideoffnpc getmdnpcname("�X�L�A�E�l���E�X#03");
	hideoffnpc getmdnpcname("�j�[�q���E�n�C�l��#03");
	hideoffnpc getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	hideoffnpc getmdnpcname("�X�s�[�J�E�l���E�X#02");
	hideoffnpc getmdnpcname("�|�[�E���n���g#02");
	hideoffnpc getmdnpcname("�w�����g�E���x���u���O#02");
	donpcevent getmdnpcname("callmon#royal")+ "::OnSummon";
	initnpctimer getmdnpcname("�N����#hunter02");
	initnpctimer getmdnpcname("�N����#hunter03");
	initnpctimer getmdnpcname("�N����#hunter04");
	initnpctimer getmdnpcname("�N����#hunter05");
	initnpctimer getmdnpcname("�N����#hunter06");
	stopnpctimer;
	end;
}

2@mir.gat,1,0,0		script	callmon#royal	-1,{
	end;
OnSummon:
	set 'count,3;
	monster getmdmapname("2@mir.gat"),98,73,"�������N����#1",3454,1,getmdnpcname("callmon#royal")+"::OnKilled1";
	monster getmdmapname("2@mir.gat"),107,73,"�������N����#2",3454,1,getmdnpcname("callmon#royal")+"::OnKilled2";
	monster getmdmapname("2@mir.gat"),101,83,"�������N����#3",3454,1,getmdnpcname("callmon#royal")+"::OnKilled3";
	end;
OnKilled1:
	misceffect 276,getmdnpcname("�N����#hunter04");
	hideonnpc getmdnpcname("�N����#hunter04");
	stopnpctimer getmdnpcname("�N����#hunter04");
	set 'count,'count-1;
	if('count > 0)
		end;
	callsub L_Clear;
	end;
OnKilled2:
	misceffect 276,getmdnpcname("�N����#hunter03");
	hideonnpc getmdnpcname("�N����#hunter03");
	stopnpctimer getmdnpcname("�N����#hunter03");
	set 'count,'count-1;
	if('count > 0)
		end;
	callsub L_Clear;
	end;
OnKilled3:
	misceffect 276,getmdnpcname("�N����#hunter02");
	hideonnpc getmdnpcname("�N����#hunter02");
	stopnpctimer getmdnpcname("�N����#hunter02");
	set 'count,'count-1;
	if('count > 0)
		end;
	callsub L_Clear;
	end;
L_Clear:
	set 'flag,1;
	set .phase,3;
	stopnpctimer getmdnpcname("�N����#hunter02");
	stopnpctimer getmdnpcname("�N����#hunter03");
	stopnpctimer getmdnpcname("�N����#hunter04");
	stopnpctimer getmdnpcname("�N����#hunter05");
	stopnpctimer getmdnpcname("�N����#hunter06");
	announce "�H�H�H : ���ǁA�P�����邼!!", 0x9, 0xdddddd;
	misceffect 276,getmdnpcname("�N����#hunter02");
	hideonnpc getmdnpcname("�N����#hunter02");
	misceffect 276,getmdnpcname("�N����#hunter03");
	hideonnpc getmdnpcname("�N����#hunter03");
	misceffect 276,getmdnpcname("�N����#hunter04");
	hideonnpc getmdnpcname("�N����#hunter04");
	misceffect 276,getmdnpcname("�N����#hunter05");
	hideonnpc getmdnpcname("�N����#hunter05");
	misceffect 276,getmdnpcname("�N����#hunter06");
	hideonnpc getmdnpcname("�N����#hunter06");
	return;
}

2@mir.gat,102,97,3	script	�N����#hunter01				3454,{}

2@mir.gat,110,82,3	script	�N����#hunter02				3454,{
	end;
OnTimer1000:
	misceffect 81;
	end;
OnTimer2000:
	misceffect 153,getmdnpcname("�A�C�[���E�A�m#02");
	end;
OnTimer4000:
	misceffect 245;
	end;
OnTimer5000:
	unittalk "�H�H�H : �����邩�I";
	misceffect 266,getmdnpcname("�A�C�[���E�A�m#02");
	end;
OnTimer7000:
	misceffect 246;
	end;
OnTimer8000:
	misceffect 273,getmdnpcname("�A�C�[���E�A�m#02");
	end;
OnTimer10000:
	misceffect 81;
	end;
OnTimer11000:
	misceffect 266,getmdnpcname("�A�C�[���E�A�m#02");
	unittalk getnpcid(0,getmdnpcname("�A�C�[���E�A�m#02")),"�A�C�[���E�A�m : �N�b�c�c�I";
	initnpctimer;
	end;

}
2@mir.gat,111,78,3	script	�N����#hunter03				3454,{
	end;
OnTimer1000:
	misceffect 182;
	end;
OnTimer2000:
	misceffect 266,getmdnpcname("�X�L�A�E�l���E�X#03");
	end;
OnTimer4000:
	misceffect 4;
	end;
OnTimer5000:
	misceffect 5,getmdnpcname("�X�L�A�E�l���E�X#03");
	end;
OnTimer7000:
	misceffect 1;
	end;
OnTimer8000:
	unittalk "�H�H�H : �����邩�I";
	misceffect 0,getmdnpcname("�X�L�A�E�l���E�X#03");
	end;
OnTimer10500:
	misceffect 245;
	end;
OnTimer11500:
	misceffect 0,getmdnpcname("�X�L�A�E�l���E�X#03");
	initnpctimer;
	end;
}
2@mir.gat,96,83,5	script	�N����#hunter04				3454,{
	end;
OnTimer1000:
	misceffect 182;
	end;
OnTimer2000:
	misceffect 266,getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	end;
OnTimer3500:
	misceffect 4;
	end;
OnTimer4500:
	misceffect 5,getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	unittalk "�H�H�H : �ӂ�!!";
	end;
OnTimer7000:
	misceffect 1;
	end;
OnTimer8000:
	misceffect 0,getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	end;
OnTimer10000:
	misceffect 245;
	end;
OnTimer11000:
	misceffect 131,getmdnpcname("�t���[�h���q�E�n�C�l��#02");
	unittalk getnpcid(0,getmdnpcname("�t���[�h���q�E�n�C�l��#02")),"�t���[�h���q : �c�c������A�ǂ���������Ă�����!?";
	initnpctimer;
	end;
}
2@mir.gat,105,68,7	script	�N����#hunter05				3454,{
	end;
OnTimer1000:
	misceffect 182;
	end;
OnTimer2000:
	misceffect 266,getmdnpcname("�w�����g�E���x���u���O#02");
	end;
OnTimer4000:
	unittalk "�H�H�H : ���ƂȂ����|���I";
	misceffect 4;
	end;
OnTimer4500:
	unittalk getnpcid(0,getmdnpcname("�w�����g�E���x���u���O#02")),"�w�����g : ����͂�����̑䎌���I";
	misceffect 5,getmdnpcname("�w�����g�E���x���u���O#02");
	end;
OnTimer7000:
	misceffect 1;
	end;
OnTimer8000:
	misceffect 0,getmdnpcname("�w�����g�E���x���u���O#02");
	end;
OnTimer10000:
	misceffect 245;
	end;
OnTimer11000:
	misceffect 131,getmdnpcname("�w�����g�E���x���u���O#02");
	unittalk getnpcid(0,getmdnpcname("�w�����g�E���x���u���O#02")),"�w�����g : �����炠����!!!!";
	initnpctimer;
	end;

}
2@mir.gat,92,77,7	script	�N����#hunter06				3454,{
	end;
OnTimer1000:
	misceffect 180;
	end;
OnTimer2000:
	misceffect 266,getmdnpcname("�|�[�E���n���g#02");
	end;
OnTimer4000:
	unittalk getnpcid(0,getmdnpcname("�|�[�E���n���g#02")),"�|�[ : �܂������B���������ʔ����͍D�܂Ȃ���B";
	misceffect 29;
	end;
OnTimer5000:
	misceffect 5,getmdnpcname("�|�[�E���n���g#02");
	end;
OnTimer7000:
	misceffect 186;
	end;
OnTimer8000:
	misceffect 0,getmdnpcname("�|�[�E���n���g#02");
	end;
OnTimer10000:
	misceffect 32;
	end;
OnTimer12000:
	unittalk getnpcid(0,getmdnpcname("�|�[�E���n���g#02")),"�|�[ : ���̏ꂩ��o�čs���Ă���Ȃ����ȁI";
	initnpctimer;
	end;
}

2@mir.gat,107,77,0	script	#royal_evt02	139,1,1,{
	end;
OnTouch:
	stopnpctimer;
	donpcevent getmdnpcname("�N���l�J�[�E�n�C�l��#01")+ "::OnStart";
	hideonnpc;
	end;
OnTimer5000:
	initnpctimer;
	misceffect 222;
	end;
}

2@mir.gat,97,80,7	script	�t���[�h���q�E�n�C�l��#01	10120,{
	unittalk "�t���[�h���q : �c�c�Â��ɁB";
	end;
}
2@mir.gat,100,80,7	script	�j�[�q���E�n�C�l��#02		10114,{}

2@mir.gat,97,77,7	script	�X�L�A�E�l���E�X#02			10116,{}
2@mir.gat,100,77,7	script	�X�s�[�J�E�l���E�X#01		10115,{}

2@mir.gat,97,68,7	script	�A�C�U�b�N�E�E�B�O�i�[#01	10126,{}
2@mir.gat,100,68,7	script	�J�g�����E�E�B�O�i�[#01		10125,{}
2@mir.gat,97,71,7	script	�����B�G���E�E�B�O�i�[#01	10132,{}
2@mir.gat,100,71,7	script	�����Q���E�E�B�O�i�[#01		989,{}

2@mir.gat,103,80,2	script	�L���T�����E�Q�I���O#01		10121,{}
2@mir.gat,106,80,2	script	�G�����X�g�E�Q�I���O#01		985,{}

2@mir.gat,103,77,2	script	�|�[�E���n���g#01			993,{}

2@mir.gat,103,74,2	script	�}�N�V�[�~���A��#01			10133,{}
2@mir.gat,106,74,2	script	���H���t�E���x���u���O#01	10128,{}
2@mir.gat,103,71,2	script	�w�����g�E���x���u���O#01	10127,{}
2@mir.gat,106,71,2	script	�A�O�l�X�E���x���u���O#01	10130,{}

2@mir.gat,97,74,7	script	�A�C�[���E�A�m#01			983,{}
2@mir.gat,100,74,7	script	�C�A���E�o���^�[#01			55,{}

2@mir.gat,99,77,2	script	�G�����X�g�E�Q�I���O#02		985,{
	if(.phase < 3)
		end;
	mes "[�G�����X�g]";
	mes "�������ցI�@�����I";
	close2;
	hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#02");
	hideonnpc getmdnpcname("�L���T�����E�Q�I���O#02");
	end;
}
2@mir.gat,103,17,2	script	�G�����X�g�E�Q�I���O#03		985,{
	mes "[�G�����X�g]";
	mes "�c�c";
	mes "�n�C�l���Ƃ̃j�[�q���B";
	mes "�債�����̂��B";
	next;
	mes "[�G�����X�g]";
	mes "�s�[�^�[�����h����A";
	mes "���̍����U���Ɣے肳��A";
	mes "�N�����������Ƃ��ł��Ȃ������B";
	next;
	mes "[�G�����X�g]";
	mes "�����ƂɁA";
	mes "�܂����̂悤�Ȓj���c�c";
	mes "�ʔ����ȁB";
	close;
}

2@mir.gat,95,74,4	script	�A�C�U�b�N�E�E�B�O�i�[#02	10126,{
	if(.phase < 3) {
		unittalk "�A�C�U�b�N : �撣���ĉ������I";
		npcskillsupport 34,10;
		sc_start 10,240000,10;
	}
	end;
}
2@mir.gat,97,75,3	script	�J�g�����E�E�B�O�i�[#02		10125,{}
2@mir.gat,98,72,2	script	�����B�G���E�E�B�O�i�[#02	10132,{}
2@mir.gat,96,72,3	script	�����Q���E�E�B�O�i�[#02		989,{
	if(.phase < 3) {
		unittalk "�����Q�� : ��낵�����肢���܂��I";
		npcskillsupport 29,10;
		sc_start 12,240000,10;
		end;
	}
	mes "[�����Q��]";
	mes "�݂�ȑ��v�ł����H";
	mes "�ЂƂ܂��������痣��܂��傤�B";
	close2;
	hideonnpc getmdnpcname("�����B�G���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�����Q���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�J�g�����E�E�B�O�i�[#02");
	end;
}
2@mir.gat,106,69,2	script	�w�����g�E���x���u���O#02	10127,{
	if(.phase < 3) {
		unittalk "�w�����g : �ӂ�I";
		end;
	}
	mes "[�w�����g]";
	mes "�S���A�������ȁI";
	mes "�@";
	mes "�c�c�������͐�ɖ߂点�Ă��炤���B";
	mes "�Ƒ��̊�F��������łȁB";
	close2;
	hideonnpc getmdnpcname("�w�����g�E���x���u���O#02");
	hideonnpc getmdnpcname("�A�O�l�X�E���x���u���O#02");
	hideonnpc getmdnpcname("���H���t�E���x���u���O#02");
	hideonnpc getmdnpcname("�}�N�V�[�~���A��#02");
	end;
}
2@mir.gat,106,72,2	script	�}�N�V�[�~���A��#02			10133,{}
2@mir.gat,108,72,6	script	���H���t�E���x���u���O#02	10128,{}
2@mir.gat,107,73,2	script	�A�O�l�X�E���x���u���O#02	10130,{
	if(.phase < 3) {
		unittalk "�A�O�l�X : �`���җl�I�@���C��t���āI";
	}
	end;
}

2@mir.gat,100,75,2	script	�L���T�����E�Q�I���O#02		10121,{
	if(.phase < 3) {
		unittalk "�L���T���� : �킽�����̋F�肪���Ȃ��̗͂ɂȂ邱�Ƃ��I";
		npcskillsupport 28,1748;
		heal 1748,0;
	}
	end;
}
2@mir.gat,108,76,6	script	�X�s�[�J�E�l���E�X#02		10115,{
	if(.phase < 3) {
		unittalk "�X�s�[�J : �c�c�X�L�A�c�c";
	}
	end;
}
2@mir.gat,109,78,6	script	�X�L�A�E�l���E�X#03			10116,{
	if(.phase < 3) {
		unittalk "�X�L�A : �c�c�ǂ����炱��ȓz�炪���ꂽ�̂ł��傤��?!";
		end;
	}
	mes "[�X�L�A]";
	mes "�ӂ��A�܂��͂������痣��܂��傤�B";
	mes "�X�s�[�J�I�@�s�����I";
	close2;
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#03");
	hideonnpc getmdnpcname("�X�s�[�J�E�l���E�X#02");
	end;
}
2@mir.gat,94,78,4	script	�|�[�E���n���g#02			993,{
	if(.phase < 3) {
		unittalk "�|�[ : �c�c�͂͂��A�܂��������Ő키���ƂɂȂ�Ƃ́I";
		end;
	}
	mes "[�|�[]";
	mes "�����߂�Ƃ��悤�B";
	close2;
	hideonnpc getmdnpcname("�|�[�E���n���g#02");
	end;
}
2@mir.gat,107,80,0	script	�C�A���E�o���^�[#02			55,{}
2@mir.gat,108,82,6	script	�A�C�[���E�A�m#02			983,{
	if(.phase < 3) {
		unittalk "�A�C�[���E�A�m : �G�k�Ȃ񂩂���]�T������܂���I";
		end;
	}
	mes "[�A�C�[���E�A�m]";
	mes "�Ȃ�Ƃ������Ƃ��c�c";
	mes "�Ƃ肠����";
	mes "��U�A��������o�܂��傤�B";
	next;
	mes "[�A�C�[���E�A�m]";
	mes "�݂�Ȗ����Łc�c";
	close2;
	hideonnpc getmdnpcname("�A�C�[���E�A�m#02");
	hideonnpc getmdnpcname("�C�A���E�o���^�[#02");
	end;
}
2@mir.gat,97,82,1	script	�t���[�h���q�E�n�C�l��#02	10120,{
	if(.phase < 3) {
		unittalk "�t���[�h���q : ���̎҂����𗊂ށB";
		end;
	}
	mes "[�t���[�h���q]";
	mes "�c�c���������҂�A��Ă�������o��B";
	unittalk getnpcid(0,getmdnpcname("�t���[�h���q�E�n�C�l��#02")),"�t���[�h���q : �c�c���������҂�A��Ă�������o��B";
	close2;
	hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#02");
	hideonnpc getmdnpcname("�L���T�����E�Q�I���O#02");
	hideonnpc getmdnpcname("�����B�G���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�����Q���E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�J�g�����E�E�B�O�i�[#02");
	hideonnpc getmdnpcname("�w�����g�E���x���u���O#02");
	hideonnpc getmdnpcname("�A�O�l�X�E���x���u���O#02");
	hideonnpc getmdnpcname("���H���t�E���x���u���O#02");
	hideonnpc getmdnpcname("�}�N�V�[�~���A��#02");
	hideonnpc getmdnpcname("�X�L�A�E�l���E�X#03");
	hideonnpc getmdnpcname("�X�s�[�J�E�l���E�X#02");
	hideonnpc getmdnpcname("�|�[�E���n���g#02");
	hideonnpc getmdnpcname("�A�C�[���E�A�m#02");
	hideonnpc getmdnpcname("�C�A���E�o���^�[#02");
	end;
}
2@mir.gat,101,93,7	script	�N���l�J�[�E�n�C�l��#02		10119,{
	if(EP16_1QUE == 9) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�s�[�^�[�̏����v�������[���B";
		mes "�ꍏ�������蓖�����˂΁c�c";
		next;
		mes "[�N���l�J�[]";
		mes "��������₩�ɑޏo���Ă���B";
		mes "�o�����͊J���Ă���B";
		mes "���΂炭��l�ɂ��ė~�����c�c";
		close2;
		cutin "ep16_kronecker_granz_heine",255;
		end;
	}
	if(.phase == 2) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�s�[�^�[�̏����v�������[���B";
		mes "�ꍏ�������蓖�����˂΁c�c";
		close2;
		cutin "ep16_kronecker_granz_heine",255;
		end;
	}
	if(.phase == 3) {
		cutin "ep16_kronecker_granz_heine",2;
		mes "[�N���l�J�[]";
		mes "�c";
		mes "�c^4d4dff�e���O���[���A^000000���������c�c";
		next;
		menu "�e���O���[���A�H",-;
		mes "[�N���l�J�[]";
		mes "�Â����A";
		mes "���[���~�b�h�K�b�c�����ɓ`��鉤�����B";
		mes "�����ɂƂ��ē��ʂȂ��̂Ȃ̂��B";
		next;
		mes "[�N���l�J�[]";
		mes "�܂����c�c�I";
		mes "��قǂ̓z�炪�����o�����̂��c�c!?";
		mes "�Ȃ�Ƃ��������c�c!!";
		next;
		mes "[�N���l�J�[]";
		mes "���肦�Ȃ��c�c";
		mes "�����ɉ�������̂��A�����ƈȊO��";
		mes "�����Ēm��͂����Ȃ��̂��I";
		next;
		mes "[�N���l�J�[]";
		mes "�c�c�܂����c�c";
		mes "����A����Ȃ͂��́c�c";
		next;
		mes "[�N���l�J�[]";
		mes "��U�A��������ޏo���Ă���c�c";
		mes "���͏������ׂ鎖������B";
		mes "���������s�[�^�[�̋~��ɌĂ�";
		mes "���m�B�����邾�낤�B";
		next;
		mes "[�N���l�J�[]";
		mes "�܂��c���Ă���҂�����";
		mes "���ӂ̕����҂��������";
		mes "���₩�ɑޏo����悤�ɁB";
		mes "�����̊ԁA�V���̕����͕��󂷂�I";
		setquest 7693;
		delquest 7692;
		set EP16_1QUE,9;
		hideonnpc getmdnpcname("�t���[�h���q�E�n�C�l��#02");
		hideonnpc getmdnpcname("�j�[�q���E�n�C�l��#03");
		hideonnpc getmdnpcname("�G�����X�g�E�Q�I���O#02");
		hideonnpc getmdnpcname("�L���T�����E�Q�I���O#02");
		hideonnpc getmdnpcname("�����B�G���E�E�B�O�i�[#02");
		hideonnpc getmdnpcname("�����Q���E�E�B�O�i�[#02");
		hideonnpc getmdnpcname("�A�C�U�b�N�E�E�B�O�i�[#02");
		hideonnpc getmdnpcname("�J�g�����E�E�B�O�i�[#02");
		hideonnpc getmdnpcname("�w�����g�E���x���u���O#02");
		hideonnpc getmdnpcname("�A�O�l�X�E���x���u���O#02");
		hideonnpc getmdnpcname("���H���t�E���x���u���O#02");
		hideonnpc getmdnpcname("�}�N�V�[�~���A��#02");
		hideonnpc getmdnpcname("�X�L�A�E�l���E�X#03");
		hideonnpc getmdnpcname("�X�s�[�J�E�l���E�X#02");
		hideonnpc getmdnpcname("�|�[�E���n���g#02");
		hideonnpc getmdnpcname("�A�C�[���E�A�m#02");
		hideonnpc getmdnpcname("�C�A���E�o���^�[#02");
		hideoffnpc getmdnpcname("to_prt_lib");
		hideoffnpc getmdnpcname("�G�����X�g�E�Q�I���O#03");
		close2;
		cutin "ep16_kronecker_granz_heine",255;
		end;
	}
	end;
}
2@mir.gat,101,94,0	script	�s�[�^�[�E�n�C�l��#01		987,{}
2@mir.gat,101,95,3	script	�|�ꂽ�s�[�^�[#02			10117,{}
2@mir.gat,103,95,2	script	�j�[�q���E�n�C�l��#03		10114,{
	if(.phase < 3) {
		end;
	}
	mes "[�j�[�q��]";
	mes "�Ȃ�Ƃ��������c�c";
	close;
}
