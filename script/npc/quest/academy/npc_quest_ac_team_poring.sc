//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[�@�|�����c(��)
//
//                                                 by Pneuma
//------------------------------------------------------------

//�~�X�e�B
ac_cl_area.gat,63,184,4	script	�~�X�e�B#ac_Misty	507,{

	function checkitemblank2;
	function checkweight2;
	function Information;
	set '@novice, callfunc("AC_GetNovice");

	switch(AC_QUEST_LV_6){
	/////////   ���b   /////////
	case 0:
		switch(AC_QUEST_ST_6){
		case 0:
			mes "[��̐�A]";
			mes "���[���I�@���[�[��!!";
			mes "�\�R�̌N�A�N�����[�B";
			mes "�@";
			mes "�]�ǂ������炩��������]";
			emotion 1,"";
			next;
			mes "[��̐�B]";
			mes "�����Ƃ������琺���o���Ȃ���";
			mes "�C�Â��Ă��炦�Ȃ��̂��I";
			setquest 100800;
			set AC_QUEST_ST_6,1;
			next;
			emotion 12;
			mes "[��̐�A]";
			mes "���[�����I";
			mes "�����Ă���̂��[���I";
			mes "�@";
			mes "[��̐�B]";
			mes "������" + (Sex ? "����������":"���킢��") + "�N�Ȃ̂��I";
			next;
			if(select("�����A���ł����H","�C�̂����̂悤��")==2){
				emotion 16;
				mes "[��̐�A]";
				mes "�����I�@�������!!";
				mes "�����[�c�c";
				mes "�@";
				mes "�]�r���ɂ��ꂽ�悤�Ȑ���";
				mes "�@�w��ɕ��������]";
				close;
			}
			set '@talked,1;
		case 1:
			if('@talked){
				mes "[��̐�A]";
				mes "���������A�����̌N�����I";
				mes "�}�ɌĂю~�߂Ă��܂��āA���܂�̂��B";
				next;
			} else {
				mes "[��̐�A]";
				mes "���ʂ��c�c�������̂��c�c";
				mes "�Ăт������̂�";
				mes "�N�������Ă���ʂƂ́c�c";
				next;
				menu "�ǂ������̂ł����H",-;
				emotion 0;
				mes "[��̐�A]";
				mes "���A���Ȃ�ƁH";
				mes "����́A���V�ɕ����Ă���̂�!?";
				mes "�c�c";
				mes "���A���������̂���!!";
				mes "���V�̘b�𕷂��Ă���I";
				next;
			}
			mes "[��̐�A���~�X�e�B]";
			mes "�܂��͎��ȏЉ��ȁB";
			mes "���V�̖��́A�~�X�e�B����B";
			mes "������̂����́c�c�l�R�����a����B";
			next;
			mes "�]�~�X�e�B�̂��΂ɂ���";
			mes "�@���Ƃ����ۂ̐��������̂�";
			mes "�@����������グ�Ă���]";
			next;
			menu "�����H�@�����A�͂�",-;
			emotion 20,"";
			mes "[��̐�B���l�R����]";
			mes "�~�X�e�B�A�����{��ɓ���̂��I";
			next;
			emotion 0;
			mes "[�~�X�e�B]";
			mes "�킩���Ă���I";
			mes "�����猾�����Ǝv���Ă����̂���B";
			next;
			menu "����ŉ��̗p�ł��傤",-,"���������Ă�������",-;
			mes "[�~�X�e�B]";
			mes "�����ė~�����̂���I";
			mes "�@";
			mes "���́A�����������Ă��܂��Ă̂��c�c";
			mes "������Ȃ��č����Ă���̂���B";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�͂����A�������������̂��B";
			mes "�����̊Ԃ����z�𗎂Ƃ������c�c";
			next;
			mes "[�~�X�e�B]";
			mes "����ȏ�͌����ł���c�c";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B���A�h�W�Ȃ̂������̂��B";
			mes "�@";
			mes "" + (Sex ? "��":"�ޏ�") + "���b�𕷂��Ă���邾���ł�";
			mes "���肪�����̂��I";
			next;
			emotion 28;
			mes "[�~�X�e�B]";
			mes "�����c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�ǂ�����H";
			mes "�ꏏ�ɒT���Ă���ʂ��H";
			mes "�ܘ_�A";
			mes "�{�����e�B�A�Ƃ͌���ʁB";
			mes "�����΂��肾���A������悤�I";
			next;
			if(select("�͂��c�c�킩��܂���","���ł�")==2){
				emotion 28;
				mes "[�~�X�e�B]";
				mes "�ނނ��I";
				mes "���A�������A";
				mes "�c�O����̂��c�c";
				mes "�ƂĂ��c�O����c�c";
				next;
				mes "[�l�R����]";
				mes "���Ƃ���`����";
				mes "����Ăق����̂��B";
				next;
				menu "�����܂Ō����Ȃ�A��`���܂��傤",-;
			}
			emotion 20,"";
			emotion 2;
			mes "[�~�X�e�B]";
			mes "������!!";
			mes "���ɒ��邼��";
			next;
			mes "[�~�X�e�B]";
			mes "���Ȃ݂ɁA���������Ȃ񂶂Ⴊ";
			mes "�厖�ȃA�N�Z�T���[�łȁB";
			mes "�@";
			mes "���˂��ˏ_�炩���āA";
			mes "�t�T�t�T�����������m�Ȃ񂶂�B";
			next;
			mes "[�l�R����]";
			mes "�܂��A�z�E�L�̂悤�Ȃ��̂Ȃ̂��I";
			next;
			emotion 23;
			mes "[�~�X�e�B]";
			mes "�z�E�L�ł͂Ȃ����I";
			next;
			emotion 21;
			mes "[�~�X�e�B]";
			mes "�c�c�Ō�ɂ��̃A�N�Z�T���[��";
			mes "�m�F�����ꏊ������񂶂Ⴊ";
			mes "�����́u^FF0000�|����^000000�v��";
			mes "�����������Ă��Ă̂��B";
			next;
			mes "[�~�X�e�B]";
			mes "�z��ɂ͗����Ă���A�C�e����";
			mes "�̓��ɗ��ߍ��ޏK���������āA";
			mes "������Ƃł�����������̂Ȃ�";
			mes "�ς����񂵂Ă��܂��̂���!!";
			next;
			emotion 9, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�c�c�c�c";
			next;
			emotion 32;
			mes "[�~�X�e�B]";
			mes "����̃A�N�Z�T���[��";
			mes "�z��^FF0000�|����^000000��";
			mes "�Ɛl�ɈႢ�Ȃ��̂����!!";
			next;
			mes "[�~�X�e�B]";
			mes "�c�c���̏ꏊ�ɂ���z������ׂ�";
			mes "���ׂ�Ƃ͌���Ȃ��̂���B";
			next;
			mes "[�~�X�e�B]";
			mes "^FF00005�C^000000�A5�C�ł悢�B";
			mes "�|������|���āA";
			mes "���Ƃ����A�N�Z�T���[���Ȃ���";
			mes "�m�F���Ă��Ăق����̂���B";
			mes "���ނ��I";
			next;
			mes "[�~�X�e�B]";
			mes "���������A���ꂩ��s���Ă��炤�ꏊ��";
			mes "�A�J�f�~�[����������čs����̂���B";
			mes "�@";
			mes "����̓��V�����@�ő��邪�A";
			mes "��Ŏ����̑��ōs���Ă݂�̂�";
			mes "�ǂ��̂ł͂Ȃ����̂��H";
			next;
			mes "[�~�X�e�B]";
			mes "�o���̏����͗ǂ����H";
			mes "�@";
			mes "����Ƃ��A�����̗͂ōs�����̂��H";
			next;
			if(select("�����ōs���܂�","���ł��o���ł��܂�")==1){
				set '@nowarp,1;
				mes "[�~�X�e�B]";
				mes "�������I";
				mes "���������̂��B";
				mes "�@";
				mes "�����A���ɖ������肵����";
				mes "���ł��߂��Ă���̂����";
			} else {
				if('@novice){
					mes "[�~�X�e�B]";
					mes "�������������Ƃ�����΁A";
					mes "���n�́u^FF0000���J�o���[�v���[�g^000000�v��";
					mes "�u^FF0000�A�J�f�~�[�{�b�N�X^000000�v��T���̂���B";
					mes "�@";
					mes "�����ƁA�N�̏����ɂȂ邶���B";
				} else {
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
				}
			}
			next;
			Information 1,0;
			if('@nowarp){
				mes "[�~�X�e�B]";
				mes "����ł́A�s���Ă���̂���!!";
				close2;
				chgquest 100800,100801;
				set AC_QUEST_ST_6, 2;
			} else {
				mes "[�~�X�e�B]";
				mes "���҂��Ă��邼�I";
				mes "�ł́c�c";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				chgquest 100800,100801;
				set AC_QUEST_ST_6, 2;
				if('@novice) warp "ac_prac_01.gat",225,31;
				else         warp "pay_fild04.gat",200,178;
			}
			end;
		case 2:
			if(!(checkquest(100801)&0x4)){
				mes "[�~�X�e�B]";
				mes "������H�@�ǂ������̂���H";
				next;
				switch(select("�|�����ƃl�R�����c�c���Ă��܂���","��ꂽ�c�c","�u^FF0000�|����^000000�v�ɂ��ċ�����")){
				case 1:
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�m���Ɏ��Ă���̂��c�c";
					mes "�@";
					mes "�]�~�X�e�B�͂����ނ��";
					mes "�@�T��̃l�R�����������낵��";
					mes "�@�ꂢ���]";
					next;
					mes "[�~�X�e�B]";
					mes "�������A�l�R�����a��";
					mes "�u^FF0000�|����^000000�v�Ƃ͈Ⴄ�̂���I";
					mes "�@";
					mes "�l�R�����a�̂ق����͂邩�ɋ�������";
					next;
					mes "[�~�X�e�B]";
					mes "��������A����";
					mes "�A�N�Z�T���[�̑{�����挈����I";
					next;
					mes "[�~�X�e�B]";
					break;
				case 2:
					while(1){
						mes "[�~�X�e�B]";
						mes "�܁A�҂āI�@���߂Ă͂�����I";
						mes "���߂��炻���Ŗ`���I������!!";
						mes "�@";
						mes "�܂��Ă⃏�V�̖����c�c";
						mes "�����A����A�C�ɂ���łȂ����B";
						next;
						menu "�͂��c�c",-;
						emotion 20,"";
						emotion 19;
						mes "[�~�X�e�B]";
						mes "�ł���ł���I";
						mes "�N�Ȃ�ł���!!";
						mes "�ǂ����Ă����Œ��߂�̂���!!";
						mes "���߂���_���Ȃ̂���!!!!";
						mes "�@";
						mes "�ǂ�����H�@�ł��邶���H";
						next;
						if(select("�͂����I","����ł��c�c")==1){
							emotion 33;
							mes "[�~�X�e�B]";
							mes "���񂤂�A��������낻�������B";
							mes "�N�Ȃ�ł��邼��";
							mes "�������`�������W����I";
							mes "�@";
							break;
						}
					}
					break;
				case 3:
					mes "[�~�X�e�B]";
					mes "�z�̓s���N�̃i�}���m����I";
					mes "�@";
					mes "�x�g�x�g�����̂ŁA";
					mes "���������������E���K��������B";
					mes "���V�����Ƃ�������";
					mes "���x�����Ă����ꂽ�����c�c";
					close;
				}
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				set '@nowarp, (select("�����ŕ����܂�","���肢���܂�")==1);
				Information 1,0;
				if('@nowarp){
					emotion 21;
					mes "[�~�X�e�B]";
					mes "�Ȃ񂶂Ⴀ";
					mes "�Â���Ηǂ��̂ɂ̂��c�c";
					mes "�@";
					mes "�܂��A����΂�񂶂Ⴜ�I";
					close;
				}
				emotion 78;
				savepoint "ac_cl_area.gat",53,181;
				mes "[�~�X�e�B]";
				mes "�N�Ƃ����z�́c�c�������Ȃ��̂���";
				mes "������x�A���@�ő����Ă�낤�B";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				close2;
				if('@novice)
					warp "ac_prac_01.gat",225,31;
				else
					warp "pay_fild04.gat",200,178;
				end;
			}
			mes "[�~�X�e�B]";
			mes "����J�������̂�";
			mes "�����āc�c���܂ʁI";
			mes "�@";
			mes "�N�𑗂��Ă��番�������̂��Ⴊ�A";
			mes "���V�̂Ȃ������A�N�Z�T���[��";
			mes "�l�R�����a�������Ă������̂���I";
			next;
			emotion 0,"";
			emotion 17;
			mes "[�~�X�e�B]";
			mes "�Ƃ�����ŁA�����T�����͌��������B";
			mes "�@";
			mes "�N�ɂ́A���f���������̂��B";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�A";
			mes "���ƂŃ|���������ɂ�";
			mes "�ӂ��Ă���̂��I";
			mes "�|���������͙l�߂������̂��I";
			next;
			emotion 19;
			mes "[�~�X�e�B]";
			mes "���A����͂����";
			mes "�l�R�����a���E���Ă�������";
			mes "�����C�t���Ă���΁c�c";
			next;
			emotion 7, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�E���Ă��܂��̂͏K���Ȃ̂��I";
			mes "�����������Ƃ����~�X�e�B�������̂��I";
			mes "�@";
			mes "�ނ���A�E���Ă���������";
			mes "���ӂ��ė~�����̂��I";
			next;
			menu "�c�c",-;
			mes "[�~�X�e�B]";
			mes "�܂��܂��A�����|���������łȂ��B";
			mes "�񑩂̗炶������ȁB";
			mes "�@";
			mes "���[�ށc�c�N�̓R�R�̐��k�����H";
			mes "�Ȃ�΁A�P�ʂ���낤�I";
			mes "���Ƃɑ�R�K�v���Ⴉ��Ȃ�!!";
			next;
			mes "[�~�X�e�B]";
			mes "�����ƁA����������";
			mes "�N�̖��́A�Ȃ�ƌ����̂���H";
			next;
			menu "���O�𖼏��",-;
			emotion 46;
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "�c�c";
			mes "�c�c�ǂ�������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����!!";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 2,"";
			chgquest 100801,100803;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight(569,50)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 50;
			chgquest 100803,100804;
			if(checkre()) {
				getexp 10,0;
				getexp 10,0;
				getexp 0,1;
				getexp 0,1;
			}
			else {
				getexp 20,0;
				getexp 20,0;
				getexp 0,8;
				getexp 0,8;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			mes "[�~�X�e�B]";
			mes "���������A�P�ʂ̎����Ⴊ�ȁc�c";
			mes "���[���ƃ~�b�h�ɂ͓������Ⴜ�H";
			mes "�@";
			mes "�����Ęb���Ă͂Ȃ�ʁc�c";
			mes "�΂ꂽ�烏�V�炪�{����łȁB";
			next;
			menu "�͂��A�킩��܂���",-;
			mes "[�~�X�e�B]";
			mes "���񂤂��@��������I";
			mes "�|�����c�ɓ���ʂ��H";
			next;
			menu "�|�����c�H",-;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�|�����c�Ƃ́I";
			mes "���E�����|�Ɋׂ�邽��";
			mes "���X�����𑱂���g�D�̖�����I";
			mes "�����ɂ��킷�l�R�����a��";
			mes "���̃|�����c�̒c���Ȃ̂���!!";
			next;
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���ށI";
			mes "���邵�イ�Ȃ��̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�͂��͂��c�c�X�S�C�f�X�l�[�B";
			mes "�@";
			mes "�Łc�c�ǂ�����H";
			mes "�N�Ȃ犽�}���邼�H";
			next;
			menu "�͂��A���\�ł�",-,"�������A���\�ł�",-;
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ǒf��Ƃ������Ƃł͂Ȃ����I";
			next;
			mes "[�~�X�e�B]";
			mes "��Ȃ��̂��`�B";
			mes "�܂��C���������炢�ł������̂���B";
			mes "�@";
			mes "�|�����c�́A��ɐV�����c���������";
			next;
			menu "����ȏ�t�������͎̂~�߂悤",-;
			emotion 54,"";
			emotion 36, "�l�R����#ac_Necorin";
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���V�����c���Ă��琏���c�c";
			mes "�@";
			mes "�c�c���āA���[���I";
			mes "�����Ă��邩���`�A���[�[���c�c";
			next;
			mes "[�l�R����]";
			mes "�܂��A���U���s�Ȃ̂��c�c";
			mes "�~�X�e�B�́A��ł��d�u���Ȃ̂��I";
			next;
			mes "�]�ς������l�g�Əo����Ă��܂����B";
			mes "�@�ނ�i�H�j�́u�|�����c�v�Ƃ���";
			mes "�@���̑g�D�炵���]";
			next;
			mes "[^FF0000���b�I��^000000]";
			mes "�]���b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��4�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 2,1;
			close2;
			set AC_QUEST_LV_6,1;
			set AC_QUEST_ST_6,0;
			chgquest 100804,200950;
			set AC_CREDIT, AC_CREDIT+5;
			end;
		}
		break;
	/////////   ��j�b   /////////
	case 1:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<4){
				emotion 56, "�~�X�e�B#ac_Misty"; //54753
				mes "[�~�X�e�B]";
				mes "�l�R�����a�I";
				mes "��A��߂�̂���I";
				mes "��������̌Y�����͌��Ȃ̂���B";
				mes "�@";
				mes "���������l�R�����a���c�c";
				next;
				emotion 29, "�l�R����#ac_Necorin"; //54754
				mes "[�l�R����]";
				mes "����������Ƃ����ƍ����̂��I";
				mes "�o�傷��̂��I";
				next;
				emotion 4,""; //self
				mes "�]���߂Â��̂͂�߂Ă������]";
				next;
				mes "[^FF0000���b�I��^000000]";
				mes "�]���b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��4�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				next;
				Information 2,1;
				close;
			}
			mes "[�~�X�e�B]";
			mes "��ς���[�A��ςȂ̂���[!!";
			mes "�@";
			mes "�͂��͂��c�c";
			mes "�@";
			mes "�����ցc�c�S�z�b�S�z�b�c�c";
			next;
			mes "�]�u�|�����c�v�̃~�X�e�B��";
			mes "�@�Ђǂ��Q�ĂĂ���悤���]";
			next;
			menu "���x�͈�̂ǂ�������ł����H",-;
			emotion 20,"";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I�@�ǂ�����!!";
			mes "�����Ă���ʂ��H";
			mes "�A�J�f�~�[�H������ςȂ̂���!!";
			mes "�ˑR�A�����Ă��܂����̂���!!";
			next;
			menu "�H����!?",-;
			emotion 23,"";
			emotion 79, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����āA�]���҂�";
			mes "�o�Ă��܂����̂���c�c";
			next;
			menu "����ȁA��̒N���c�c",-;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�]���҂Ƃ́c�c";
			next;
			mes "[�~�X�e�B]";
			mes "���V�Ȃ̂���I";
			mes "���V�̕�����ςȂ̂���!!";
			mes "���������đ���Ȃ̂���!!!!";
			next;
			emotion 55,"";
			mes "[�l�R����]";
			mes "�~�X�e�B�́A�H���Ӓn�������̂��I";
			mes "�H�ו��̎��ƂȂ�ƁA";
			mes "�Ƃ���Ƀp�j�b�N�ɂȂ�̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�×���茾�������H";
			mes "���������Ă͐�͏o���ʂƁc�c";
			mes "�@";
			mes "���V�̋M�d�Ȉ��炬�̎��Ԃ�";
			mes "���s���`�ɗ�������Ă���̂���!!";
			next;
			menu "�c�c�p�����v���o���܂���",-;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������A�҂̂���I";
			mes "�@";
			mes "���̂܂܂ł́A";
			mes "�N�̂��т������Ȃ�̂��Ⴜ�H";
			mes "�N�͖{���ɗǂ��̂��H";
			mes "���邶���H�@�������邶���`�H";
			next;
			menu "�c�c�m���ɂ����͌���܂���",-;
			mes "[�~�X�e�B]";
			mes "�����ł���I";
			mes "���V�Ȃ�ɒ������āA";
			mes "�H�������p�ł��Ȃ�������";
			mes "�˂��~�߂��̂���I";
			mes "�@";
			mes "����́c�c�}�L�������̂���!!";
			next;
			menu "�}�L??",-;
			mes "[�~�X�e�B]";
			mes "�}�L���Ȃ��ׁA";
			mes "�΂��N�����Ȃ��̂���I";
			next;
			mes "[�~�X�e�B]";
			mes "���@�ŉ΂��N�����Ƃ������";
			mes "����ɂ͂���̂��Ⴊ";
			mes "�����ł̉Ή����𒲐߂���̂�";
			mes "�n���̖��@�g���ł�����̂���c�c";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Ƃ����킯�ŁA";
			mes "�]���҂������ł����炷�ׁA";
			mes "�}�L���W�߂悤�ł͂Ȃ����I";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�́A���������Ă���̂��B";
			next;
			menu "���̂悤�ł���",-;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�@";
			mes "�����܂Ō����Ȃ�A";
			mes "�l�R�����a�̂��т͖����Ȃ̂���I";
			mes "�@";
			mes "������������������������Ȃ̂���I";
			next;
			emotion 36, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�c�c�c�c";
			mes "�����̂�т肵�Ă���̂��I";
			mes "�@";
			mes "�����I";
			mes "" + strcharinfo(0) + "�I";
			mes "�}���Ń}�L���W�߂ɍs���̂�!!";
			next;
			menu "�������[!!",-;
			emotion 23,"";
			mes "[�~�X�e�B]";
			mes "�܂��܂��c�c";
			mes "����������΂��肶�Ⴊ�A";
			mes "������悤�ł͂Ȃ�����";
			mes "�@";
			mes "�|�����c�����o�Ŏ�`������";
			mes "���S����̂���I";
			next;
			menu "�c�c�c���͉��l���炢�����ł����H",-;
			emotion 29, "�l�R����#ac_Necorin";
			mes "[�~�X�e�B]";
			mes "�����o�[��m�肽������ƁH";
			mes "�ӂӂӂ��A�|�����c�����o�[�́c�c";
			mes "�l�R�����a�I�@���V�I�@�N�̎O�l����I";
			mes "�@";
			mes "�������s�Ȃ̂���!!";
			next;
			menu "���͓��c���Ă܂���I",-;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ׂ������́A�ǂ��ł͂Ȃ�����";
			mes "�@";
			mes "�N�ɂ͊��҂��Ă���̂��Ⴜ�H";
			next;
			menu "�͂��c�c",-;
			mes "[�~�X�e�B]";
			mes "����ł́A�}�L�W�߂̐�������I";
			mes "�u^FF0000�E�B���[^000000�v�Ƃ���";
			mes "�؂̃����X�^�[�������Ă̂��A";
			mes "�z����Ƃ��}�L�͍ō��Ȃ̂���B";
			next;
			mes "[�~�X�e�B]";
			mes "�u^FF0000�E�B���[^000000�v��^FF000010�C^000000�قǓ|���΁A";
			mes "�}�L�͏\���W�܂�͂�����I";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�́A20�C�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�Ȃ񂶂����!?";
			mes "�l�R�����a�c�c�Ђǂ��̂���c�c";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�������Ȃ��A�тׂ̈���I";
			mes "���V���}�L�W�߂����邩�̂��B";
			mes "�@";
			mes "�P�͋}������I";
			mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
			next;
			set '@nowarp, (select("�����ŕ����܂�","���肢���܂�")==1);
			if(!'@nowarp && !'@novice){
				setquest 100805;
				mes "[�l�R����]";
				mes "������Ƒ҂̂��B";
				mes "^FF0000���̉H^000000�͎������̂��H";
				mes "�@";
				mes "�Y��Ă���ƋA�肪";
				mes "��ςȂƂ�������̂��I";
				mes "����ł��A�s���̂��H";
				next;
				if(select("�͂�","������")==2){
					mes "[�l�R����]";
					mes "�������菀���͂��������ǂ��̂��B";
					mes "�܂��A���ł�����̂��B";
					mes "���ꂶ��A�������Ă���̂��I";
					close;
				}
				mes "[�l�R����]";
				mes "�����čs�����ق����ǂ��̂��c�c";
				mes "�@";
				mes "���������Ă��m��Ȃ��̂��I";
				next;
			}
			setquest 100805;
			set AC_QUEST_ST_6,1;
			Information 2,0;
			if('@nowarp){
				mes "[�~�X�e�B]";
				mes "�������c�c";
				mes "���@���g�����������̂Ɏc�O����̂��B";
				mes "�@";
				mes "��������}�L�W�߂�����񂶂Ⴜ�`�B";
				close;
			}
			emotion 78;
			mes "[�~�X�e�B]";
			mes "���ށI";
			mes "�����A�o�w����`�I";
			mes "�@";
			mes "�܁[���A�܁[���A����Ђ��`��";
			mes "�@";
			mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
			savepoint "ac_cl_area.gat",53,180;
			close2;
			if('@novice)
				warp "ac_prac_01.gat",225,31;
			else
				warp "pay_fild08.gat",24,74;
			end;
		case 1:
			if(!(checkquest(100805)&0x4)){
				emotion 1;
				mes "[�~�X�e�B]";
				mes "������H�@�ǂ������̂���H";
				next;
				switch(select("�܂����n�Ɍ������Ă��Ȃ��̂ł����H","��ꂽ�c�c","�u^FF0000�E�B���[^000000�v�ɂ��ċ�����")){
				case 1:
					mes "[�~�X�e�B]";
					mes "���ꂩ��������������B";
					mes "�@";
					mes "���͂̂��c�c�Q�ĂĂ��������łȁA";
					mes "����������Ă����̂�Y�ꂽ�̂���B";
					next;
					emotion 18, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�~�X�e�B�́A";
					mes "���������肷���Ă��Ɂc�c";
					mes "�@";
					mes "���������Ȃ����̂�!!";
					next;
					emotion 77, "�~�X�e�B#ac_Misty";
					mes "[�~�X�e�B]";
					mes "���A����Ȏ��͂Ȃ����H";
					mes "���̒ʂ茳�C�A���C����!!";
					mes "�@";
					mes "�]�~�X�e�B���Ί�ŗ��r��U��񂷂�";
					mes "�@������";
					mes "�@�O�[�L�������ƕ��̒����Ȃ����]";
					next;
					menu "�c�c",-;
					mes "[�~�X�e�B]";
					mes "���A���͂͂͂́c�c";
					mes "�@";
					mes "�܂��A�C�ɂ���łȂ��B";
					mes "�����΂炭�͉䖝�o����̂���B";
					next; 
					mes "[�~�X�e�B]";
					mes "�Ƃɂ����A�ꍏ������";
					mes "�}�L���W�߂悤�ł͂Ȃ����B";
					mes "�@";
					break;
				case 2:
					while(1){
						mes "[�~�X�e�B]";
						mes "�܁A�҂āI�@���߂Ă͂�����I";
						mes "���߂��炻���Ŗ`���I������I";
						mes "�@";
						mes "�܂��Ă⃏�V�̔т��c�c";
						next;
						menu "�͂��c�c",-;
						emotion 20,"";
						emotion 19;
						mes "[�~�X�e�B]";
						mes "�ł���ł���I";
						mes "�N�Ȃ�ł���!!";
						mes "�ǂ����Ă����Œ��߂�̂���!!";
						mes "���߂���_���Ȃ̂���!!!!";
						mes "�@";
						mes "�ǂ�����H�@�ł��邶���H";
						next;
						if(select("�͂����I","����ł��c�c")==1){
							emotion 33;
							mes "[�~�X�e�B]";
							mes "���񂤂�A��������낻�������B";
							mes "�N�Ȃ�ł��邼��";
							mes "�������`�������W����I";
							mes "�@";
							break;
						}
					}
					break;
				case 3:
					mes "[�~�X�e�B]";
					mes "�悤�͖؂̂���������ȁI";
					mes "�@";
					mes "�̂��J���b�J���Ɋ����Ă��邼�B";
					mes "�Ƃ��Ă��悭�R����������ȁB";
					mes "�}�L�̍ޗ��ɂ҂����肶��I";
					close;
				}
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				set '@nowarp, (select("�����ŕ����܂�","���肢���܂�")==1);
				Information 2,0;
				if('@nowarp){
					emotion 55;
					mes "[�~�X�e�B]";
					mes "�E�`�̐V�l�͗��������̂��c�c";
					next;
					menu "������A���c���Ă��܂���āI",-;
					emotion 6,"";
					emotion 12;
					mes "[�~�X�e�B]";
					mes "�C�����čs���ė���̂��Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "����t����΂�̂��Ⴜ";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice)
					warp "ac_prac_01.gat",225,31;
				else
					warp "pay_fild08.gat",24,74;
				end;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���[�A�A���Ă��������ȁH";
			mes "���āA���ʂ͂ǂ���������H";
			next;
			menu "�񑩂̃}�L�ł�",-;
			mes "[�~�X�e�B]";
			mes "�����I�@�ł��������I";
			mes "�@";
			mes "���Ƃ́A��������A�J�f�~�[�H����";
			mes "�}�L��u���Ă���΁c�c";
			next;
			emotion 19, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�c�c";
			mes "�����������Ă���̂͂킩�邪";
			mes "�悾�ꂪ�������ɂȂ��Ă�̂��B";
			mes "�@";
			mes "�͂₭�H���ɍs�����Ȃ̂��I";
			next;
			emotion 77, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��������̂��c�c";
			mes "�@";
			mes "����H";
			mes "����ȏ��ɔ����������ȓ����c�c";
			next;
			mes "�]�~�X�e�B�́A";
			mes "�@�����������ȏ΂݂𕂂��ׂ��";
			mes "�@�v������l�R�����̎���";
			mes "�@����������I�]";
			next;
			emotion 23, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ɂ��A�ɂ��̂�!!";
			mes "����͎��̎��Ȃ̂��I";
			mes "�@";
			mes "�]�l�R�����́A����������~�X�e�B��";
			mes "�@�U�藎�Ƃ���Ƃ΂���ɔ�ђ��˂�]";
			next;
			mes "[�l�R����]";
			mes "�������I";
			mes "���������ɗ����̂��I";
			next;
			menu "���́c�c��`��������́H",-;
			emotion 20,"";
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�@";
			mes "�N�̒P�ʂ𑝂₵�Ă������̂��B";
			mes "���łɁA����������čs���̂��I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 2,"";
			chgquest 100805,100807;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight(569,100)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 100;
			chgquest 100807,100808;
			if(checkre()) {
				getexp 12,0;
				getexp 12,0;
				getexp 0,4;
				getexp 0,4;
			}
			else {
				getexp 88,0;
				getexp 88,0;
				getexp 0,44;
				getexp 0,44;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 19, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ł͋}���ŐH���ɍs���̂��I";
			mes "�܂�����Ȃ̂��I";
			mes "�@";
			mes "�]�l�R�����͌�������";
			mes "�@�~�X�e�B���瓦����";
			mes "�@��ђ��ˁA����Ă������]";
			next;
			emotion 43;
			mes "[�~�X�e�B]";
			mes "�����I�@���V�̓�!!";
			mes "�������A�҂̂��႟�`";
			next;
			mes "[^FF0000���b�I��^000000]";
			mes "�]��O�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��7�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 3,1;
			close2;
			chgquest 100808,200955;
			set AC_QUEST_LV_6,2;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+6;
			end;
		}
		break;
	/////////   ��O�b   /////////
	case 2:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<7){
				mes "�]�~�X�e�B�̓l�R�����̎���";
				mes "�@��������āA";
				mes "�@���������������Ă���B";
				mes "�@�c�c�ǂ����܂�";
				mes "�@�H�ו��ƊԈႦ���Ă���悤���]";
				next;
				emotion 16, "�l�R����#ac_Necorin"; //54754
				mes "[�l�R����]";
				mes "�C�^�^�b�A�~�߂�̂��I";
				mes "�́A�����A�͂₭!!";
				mes "�J���Ă���Ȃ̂��I";
				mes "�����H����������̂��I";
				next;
				emotion 77, "�~�X�e�B#ac_Misty"; //54753
				mes "[�~�X�e�B]";
				mes "�����c�c";
				mes "�@";
				mes "���c�c���c�c�Â����c�c";
				mes "��D���ȃC�`�S�啟��";
				mes "�H�ׂ����̂��Ⴀ�c�c";
				next;
				mes "[^FF0000���b�I��^000000]";
				mes "�]��O�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��7�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				next;
				Information 3,1;
				close;
			}
			emotion 75, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�͂��c�c�������󂢂��̂��c�c";
			mes "�@";
			mes "�]�~�X�e�B�͂�����������";
			mes "�@�J�T�Ȃ��ߑ������Ă���]";
			next;
			mes "�]�}�L���Ȃ�����";
			mes "�@�߂�ꂽ�H���̖���";
			mes "�@�����������Ă���͂����]";
			next;
			menu "�H���֍s�����̂ł́H",-;
			mes "[�~�X�e�B]";
			mes "���ꂪ�A�H���Ɂc�c";
			mes "�A������A�A�����o���̂���B";
			next;
			menu "�A���H",-;
			emotion 1,"";
			mes "[�~�X�e�B]";
			mes "���Ɍ����ɂ����񂶂Ⴊ�c�c";
			mes "�����肵�đ��̑����s����!!";
			mes "�@";
			mes "�������ŉq���̓s����A";
			mes "�H���͂܂��ĊJ�ł���炵���B";
			next;
			menu "���Ⴀ�A�܂��H�ׂĂȂ���ł��ˁH",-;
			mes "[�~�X�e�B]";
			mes "�����Ȃ̂���B";
			mes "���͋C�͂łȂ�Ƃ������Ă���c�c";
			next;
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���݃A�J�f�~�[�E�������o�ŁA";
			mes "�쏜���Ă���炵���̂��B";
			next;
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c�����������ȓ����c�c";
			mes "�@";
			mes "�]�~�X�e�B�̓l�R������";
			mes "�@���x�Ƃ����\��Ō����낵�Ă���]";
			next;
			emotion 23, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "!!";
			mes "�@";
			mes "���ނ̂�!!";
			mes "���̂܂܂ł͎��̖�����Ȃ��̂��B";
			mes "�s��ގ����Ă��Ăق����̂�!!";
			next;
			menu "�f���Ă��_���Ȃ�ł��傤�H",-;
			emotion 54,"";
			mes "[�l�R����]";
			mes "�N�̋��͂Ɋ��ӂ���̂��I";
			mes "�@";
			mes "����ł����|�����c�̈���Ȃ̂��I";
			next;
			menu "����ɂȂ����o���͖����ł�",-;
			mes "[�l�R����]";
			mes "��k�������Ă���ꍇ�ł͂Ȃ��̂��B";
			mes "T�Ƃ́A�u^FF0000���^000000�v�̎��Ȃ̂��B";
			mes "�@";
			mes "�����̑����A�����肵���z�Ȃ̂��I";
			next;
			mes "[�l�R����]";
			mes "�z��͐H�����������ł͂Ȃ��A";
			mes "�ʂ̂Ƃ��납��";
			mes "�N�����Ă��Ă���炵���̂��B";
			mes "�N�͂Ƃ肠�����A";
			mes "^FF000010�C^000000�قǓ|���Ă��Ăق����̂��B";
			next;
			emotion 11, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�u^FF0000���^000000�v�́A�߂��ɒ��Ԃ������";
			mes "�W�c�ŏP���Ă���K��������̂��B";
			mes "�@";
			mes "�͂܂�Ȃ��悤�ɒ��ӂ���̂��I";
			next;
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����c�c�H";
			mes "����ȏ��ɃC�`�S�啟���c�c";
			mes "�@";
			mes "�]�~�X�e�B�͖ڂ����������ƌ��点��";
			mes "�@�l�R�����Ɏ��L�΂����]";
			next;
			mes "[�l�R����]";
			mes "�c�c���悢������āA";
			mes "�~�X�e�B�������̂悤�Ȃ̂��B";
			mes "�@";
			mes "�����ꍏ�̗P�\���Ȃ��̂��I";
			mes "�}���ōs���ė��Ă���Ȃ̂��I";
			next;
			mes "�]�����̊댯��";
			mes "�@�l�R�����͂��̓s�x";
			mes "�@�̂΂����~�X�e�B�̎肩��";
			mes "�@���������Ă���]";
			next;
			set '@nowarp, (select("�}���ōs���Ă��܂�","���n�܂ő����Ăق����ł�")==1);
			if(!'@nowarp && !'@novice){
				mes "[�l�R����]";
				mes "������Ƒ҂̂��B";
				mes "^FF0000���̉H^000000�͎������̂��H";
				mes "�@";
				mes "�Y��Ă���ƋA�肪";
				mes "��ςȂƂ�������̂��I";
				mes "����ł��A�s���̂��H";
				next;
				if(select("�͂�","������")==2){
					mes "[�l�R����]";
					mes "�������菀���͂��������ǂ��̂��B";
					mes "�܂��A���ł�����̂��B";
					mes "���ꂶ��A�������Ă���̂��I";
					close;
				}
				mes "[�l�R����]";
				mes "�����čs�����ق����ǂ��̂��c�c";
				mes "�@";
				mes "���������Ă��m��Ȃ��̂��I";
				next;
			}
			Information 3,0;
			setquest 100810;
			set AC_QUEST_ST_6,1;
			if('@nowarp){
				emotion 21, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "�N�̌������F��̂��I";
				close;
			}
			emotion 78, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����͋}���Ȃ̂��I";
			mes "���ʂȂ̂��I";
			mes "�@";
			mes "�܁[���A�܁[���A����Ђ��`��";
			mes "�@";
			mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
			savepoint "ac_cl_area.gat",53,180;
			close2;
			if('@novice)
				warp "ac_prac_01.gat",225,31;
			else
				warp "prt_fild01.gat",130,340;
			end;
		case 1:
			if(!(checkquest(100810)&0x4)){
				emotion 43;
				mes "�]�߂܂��悤�Ƃ���~�X�e�B��";
				mes "�@����������l�R�����Ƃ�";
				mes "�@����ȍU�h���J��L�����Ă���]";
				next;
				emotion 23, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "�����c�c��Ȃ��̂��I";
				mes "�@";
				mes "�ǂ������̂��I";
				mes "�����͂܂��Ȃ̂�!?";
				next;
				switch(select("���������Ă��܂���","��ꂽ�c�c","�u^FF0000���^000000�v�ɂ��ċ�����")){
				case 1:
					set '@nowarp,1;
					break;
				case 2:
					mes "[�l�R����]";
					mes "�܁c�c�҂̂��I";
					mes "���߂Ă͂����Ȃ��̂��I";
					mes "���r���[�ł����̂��H";
					mes "�@";
					mes "����ȕ��Ɉ�Ă��o���͂Ȃ��̂��I";
					next;
					menu "��ĂĂ�����ĂȂ��ł�",-;
					emotion 0, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "!!!!";
					mes "��Âȓ˂����݂͂���Ȃ��̂��I";
					mes "���������Ƃ����ނ̂��B";
					next;
					menu "���傤���Ȃ��c�c",-;
					emotion 54,"";
					mes "[�l�R����]";
					mes "�N����������Ȃ̂��I";
					mes "���n�܂ő���̂��H";
					next;
					set '@nowarp, (select("�����ŕ����܂�","���肢���܂�")==1);
					if(!'@nowarp && !'@novice){
						mes "[�l�R����]";
						mes "������Ƒ҂̂��B";
						mes "^FF0000���̉H^000000�͎������̂��H";
						mes "�@";
						mes "�Y��Ă���ƋA�肪";
						mes "��ςȂƂ�������̂��I";
						mes "����ł��A�s���̂��H";
						next;
						if(select("�͂�","������")==2){
							mes "[�l�R����]";
							mes "�������菀���͂��������ǂ��̂��B";
							mes "�܂��A���ł�����̂��B";
							mes "���ꂶ��A�������Ă���̂��I";
							close;
						}
						mes "[�l�R����]";
						mes "�����čs�����ق����ǂ��̂��c�c";
						mes "�@";
						mes "���������Ă��m��Ȃ��̂��I";
						next;
					}
					break;
				case 3:
					mes "[�l�R����]";
					mes "��峂͍����肵�Ă��΂��������̂��B";
					mes "���ɂ͑傫���̂�����̂��c�c";
					mes "�ł��A����͏������z�Ȃ̂��B";
					mes "�@";
					mes "1��ł����������ƕt�߂̓�峂�";
					mes "��ĂɏP���Ă���̂��I";
					close;
				}
				Information 3,0;
				if('@nowarp){
					mes "[�l�R����]";
					mes "�N�̌������F��̂��I";
					close;
				}
				emotion 78, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���񂾂̂��I";
				mes "���Ƃ͔C�����̂��B";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice)
					warp "ac_prac_01.gat",225,31;
				else
					warp "prt_fild01.gat",130,340;
				end;
			}
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���c�c�C�`�S�啟�c�c";
			mes "�@";
			mes "�]�~�X�e�B�͏��ɓ|���悤�ɐQ�]����";
			mes "�@�Ђ�����l�R�������������Ă���]";
			next;
			mes "�]����Ȑ���������";
			mes "�@�~�X�e�B������";
			mes "�@�󕠂œ����Ȃ��Ȃ������Ƃ�";
			mes "�@�Ђƒi�������悤���]";
			next;
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����I�@�҂��Ă����̂��I";
			mes "�����ŉ����Ȃ̂��B";
			mes "�@";
			mes "�N�̊��������A";
			mes "�ǂ���瓐峂�";
			mes "�쏜�o�����悤�Ȃ̂��B";
			next;
			mes "[�l�R����]";
			mes "�H���̑�������i�������̂��B";
			mes "�@";
			mes "����͖{���ɏ��������̂��c�c";
			mes "���ӂ���̂��I";
			next;
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���c�c�C�`�S�啟�c�c";
			next;
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���āA�~�X�e�B��H����";
			mes "��Ă����˂΂Ȃ��̂��B";
			mes "�@";
			mes "�����ƁA���̑O�ɒP�ʂ�������̂��I";
			mes "�A�C�e�����T�[�r�X����̂��B";
			mes "��`�@�|���`�����ƁI";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 2,"";
			chgquest 100810,100812;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight(569,150)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 150;
			chgquest 100812,100814;
			if(checkre()) {
				getexp 22,0;
				getexp 22,0;
				getexp 0,12;
				getexp 0,12;
			}
			else {
				getexp 218,0;
				getexp 218,0;
				getexp 0,125;
				getexp 0,125;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			mes "[�H���̕�������]";
			mes "�L���[!!";
			mes "�@";
			mes "^FF0000�D�_�`!!^000000";
			next;
			emotion 0, "�l�R����#ac_Necorin";
			emotion 0,"";
			mes "[�l�R����]";
			mes "!!!!";
			mes "�@";
			mes "�D�_���ł��炵���̂�!!";
			next;
			mes "[�l�R����]";
			mes "���̖`���҃A�J�f�~�[��";
			mes "���^FF0000�|�����c^000000�̓꒣��I";
			mes "�����œD�_�Ȃ��";
			mes "�|�����c�ւ̒���Ƃ�������̂��I";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�I";
			mes "�}���ŐH���Ɍ������̂�!!!!";
			mes "�D�_��߂܂���̂�!!";
			next;
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ɂ��c�c�����c�c���c�c";
			mes "�@";
			mes "�]�~�X�e�B�͂���Ȗڂ�";
			mes "�@�E�����グ��";
			mes "�@�l�R�����ɉ����Ă���]";
			next;
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�N�ɂ͐��b�ɂȂ����̂��B";
			mes "�܂�����Ȃ̂��I";
			mes "�@";
			mes "�|�����c�I�@�����o�w�Ȃ̂�!!";
			next;
			emotion 43, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c�ӂ��c�c";
			next;
			mes "[^FF0000��O�b�I��^000000]";
			mes "�]��l�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��10�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 4,1;
			close2;
			chgquest 100814,200960;
			set AC_QUEST_LV_6,3;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+6;
			end;
		}
		break;
	/////////   ��l�b   /////////
	case 3:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<10){
				emotion 27, "�l�R����#ac_Necorin"; //54754
				mes "[�l�R����]";
				mes "�|�����c�̓꒣����r�炷�Ƃ�";
				mes "�����x���Ȃ̂��I";
				mes "�@";
				mes "�����A�o�w�Ȃ̂�!!";
				next;
				emotion 43, "�~�X�e�B#ac_Misty"; //54753
				mes "[�~�X�e�B]";
				mes "���c�c�C�`�S�啟�c�c";
				next;
				mes "[^FF0000��O�b�I��^000000]";
				mes "�]��l�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��10�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				next;
				Information 4,1;
				close;
			}
			emotion 9, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�c�c�c�c";
			mes "�@";
			mes "�]�~�X�e�B�͂����炪�`�����ނ̂ɂ�";
			mes "�@���������A�����s���ʂĂ��l�q���]";
			next;
			menu "�����Ă��Ȃ��悤�ł����c�c",-;
			mes "[�l�R����]";
			mes "���ށc�c";
			mes "�@";
			mes "�]�l�R�����͏d�X�����������]";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�́A���5��H��������̂��B";
			mes "�т�H�ׂ��Ȃ����́A";
			mes "�������т��������������悤�Ȃ̂��B";
			next;
			menu "���ǁA�H���́H",-;
			mes "[�l�R����]";
			mes "�����Ȃ̂��B";
			mes "��峑ގ������Ă��������A";
			mes "���ǁA�D�_�̂�����";
			mes "�H���͂��܂������ꂽ�܂܂Ȃ̂��B";
			next;
			menu "�D�_�́A�߂܂��Ă��Ȃ��̂ł����H",-;
			emotion 57, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���ꂪ���́c�c";
			mes "�@";
			mes "����͑��肪��������̂��B";
			mes "���̍ł����ȃ����X�^�[�Ȃ̂��c�c";
			next;
			mes "[�l�R����]";
			mes "�N���c�c";
			mes "�D�_�����炵�߂Ăق����̂��c�c";
			mes "�@";
			mes "�]�l�R�����͏d�X�������ߑ����͂���";
			mes "�@��������`���b�A�`���b��";
			mes "�@�f���Ă���]";
			next;
			mes "�]�l�R�����̎�����";
			mes "�@" + strcharinfo(0) + "��";
			mes "�@�ǐS���h����������]";
			next;
			menu "�c�c�Ȃ�ƂȂ��b�������܂���",-;
			emotion 52,"";
			mes "[�l�R����]";
			mes "���΁A���������񂾐l�ނȂ̂��I";
			mes "�@";
			mes "�����ƌ��܂�΁A�b�͑����̂��B";
			mes "���̓G�𓢂��Ăق����̂��I";
			next;
			menu "���ł�",-;
			emotion 28, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���������Ƃ����ނ̂��c�c";
			mes "�@";
			mes "�z�炾���́A";
			mes "�ǂ����Ă��ʖڂȂ̂��c�c";
			next;
			menu "���̂ł����H",-;
			mes "[�l�R����]";
			mes "���͂Ȃ̂��c�c";
			mes "�@";
			mes "��X�́A�T����̋��Ȃ̂��B";
			mes "���̎������������Ŋ��C���c�c";
			next;
			menu "�ǂ�ȘT�ł����H",-;
			mes "[�l�R����]";
			mes "�����I�@���܂�Ă����̂��H";
			mes "�@";
			mes "�Ɛl�́u^FF0000�q�f�U�[�g�E���t^000000�v�Ȃ̂��I";
			mes "�@";
			mes "�z��͓k�}��g��ł�̂��I";
			next;
			emotion 29, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�z��Ȃ�A";
			mes "���C�|���Ă����܂�Ȃ��̂��I";
			mes "�@";
			mes "����₵�ɂ��Ă���Ă������̂��I";
			next;
			menu "����₵�͂�����Ɓc�c",-;
			mes "[�l�R����]";
			mes "���ށc�c�c�O�Ȃ̂��c�c";
			mes "�@";
			mes "�Ȃ��^FF000010�C^000000�ŗǂ��̂��B";
			mes "�@";
			mes "�Ƃɂ����z����A";
			mes "��������|���Ă��Ăق����̂��I";
			next;
			mes "[�l�R����]";
			mes "����ŁA�z�炪�D�_����߂��";
			mes "�H���̕��͉�������";
			mes "�v���̂��I";
			next;
			menu "�킩��܂���",-;
			emotion 21,"";
			mes "[�l�R����]";
			mes "�N�ɂ͖��f�΂��肩���āA";
			mes "�{���ɂ��܂Ȃ��̂��c�c";
			mes "�@";
			mes "�����ꍏ�̗P�\���Ȃ��̂��I";
			mes "���n�܂Ŗ��@�ő���̂��I";
			next;
			set '@nowarp, (select("�����ŕ����܂�","���肢���܂�")==1);
			if(!'@nowarp && !'@novice){
				mes "[�l�R����]";
				mes "������Ƒ҂̂��B";
				mes "^FF0000���̉H^000000�͎������̂��H";
				mes "�@";
				mes "�Y��Ă���ƋA�肪";
				mes "��ςȂƂ�������̂��I";
				mes "����ł��A�s���̂��H";
				next;
				if(select("�͂�","������")==2){
					mes "[�l�R����]";
					mes "�������菀���͂��������ǂ��̂��B";
					mes "�܂��A���ł�����̂��B";
					mes "���ꂶ��A�������Ă���̂��I";
					close;
				}
				mes "[�l�R����]";
				mes "�����čs�����ق����ǂ��̂��c�c";
				mes "�@";
				mes "���������Ă��m��Ȃ��̂��I";
				next;
			}
			Information 4,0;
			emotion 21, "�l�R����#ac_Necorin";
			setquest 100815;
			set AC_QUEST_ST_6,1;
			if('@nowarp){
				mes "[�l�R����]";
				mes "�����Ȃ̂��H";
				mes "�@";
				mes "����ł͂��Ƃ͗��񂾂̂��I";
				mes "�������F��̂��I";
				close;
			}
			emotion 78, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���ꂮ�����������p�Ȃ̂��I";
			mes "����ł͂��Ƃ͗��񂾂̂��B";
			mes "�@";
			mes "�܁[���A�܁[���A����Ђ��`��";
			mes "�@";
			mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
			savepoint "ac_cl_area.gat",53,180;
			close2;
			if('@novice)
				warp "ac_prac_01.gat",225,31;
			else
				warp "prt_fild09.gat",312,193;
			end;
		case 1:
			if(!(checkquest(100815)&0x4)){
				mes "�]�����Ȃ��~�X�e�B��";
				mes "�@�K���ł��Ă����l�R������";
				mes "�@������ɋC�Â����]";
				next;
				emotion 52, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "����͂Ȃ��̂��H";
				mes "���Ă͂��Ȃ��̂��H";
				mes "�z�������₵�ɏo�����̂�!?";
				next;
				switch(select("�����A�}���ōs���Ă��܂�","���ɖ����܂���","�u^FF0000�q�f�U�[�g�E���t^000000�v�ɂ��ċ�����")){
				case 1:
					set '@nowarp,1;
					break;
				case 2:
					mes "[�l�R����]";
					mes "���q�c�c�C�ɂ���ȂȂ̂�!!";
					mes "���x�ł����@�ő���͂���̂��I";
					mes "�@";
					mes "�ǂ�����̂��H";
					next;
					set '@nowarp, (select("�����ōs���܂�","���肢���܂�")==1);
					if(!'@nowarp && !'@novice){
						mes "[�l�R����]";
						mes "������Ƒ҂̂��B";
						mes "^FF0000���̉H^000000�͎������̂��H";
						mes "�@";
						mes "�Y��Ă���ƋA�肪";
						mes "��ςȂƂ�������̂��I";
						mes "����ł��A�s���̂��H";
						next;
						if(select("�͂�","������")==2){
							mes "[�l�R����]";
							mes "�������菀���͂��������ǂ��̂��B";
							mes "�܂��A���ł�����̂��B";
							mes "���ꂶ��A�������Ă���̂��I";
							close;
						}
						mes "[�l�R����]";
						mes "�����čs�����ق����ǂ��̂��c�c";
						mes "�@";
						mes "���������Ă��m��Ȃ��̂��I";
						next;
					}
					break;
				case 3:
					mes "[�l�R����]";
					mes "�z�����������ŕ|���̂��c�c";
					mes "�@";
					mes "���̘T�߁c�c�����ɖi����̂��B";
					mes "�ڂ��s���āA���̎�������";
					mes "�W�c�ő_���Ă���̂��I";
					close;
				}
				Information 4,0;
				if('@nowarp){
					emotion 21, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "��낵�����ނ̂��I";
					mes "�������F��̂��I";
					close;
				}
				emotion 78, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "�K���|���̂��I";
				mes "�o���Ȃ̂��I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice)
					warp "ac_prac_01.gat",225,31;
				else
					warp "prt_fild09.gat",312,193;
				end;
			}
			emotion 10, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���肪�Ƃ��Ȃ̂�!!";
			mes "����̌N�̊���ŁA";
			mes "�D�_������";
			mes "�H����Ԃ��Ă����炵���̂��B";
			mes "�@";
			mes "�d���̌�̃[���s�́A�������̂��I";
			next;
			menu "�ƂĂ��������T�ł�����H",-;
			emotion 20,"";
			mes "[�l�R����]";
			mes "�������Ă��T�͘T�Ȃ̂��B";
			next;
			menu "�����A�܂��c�c�����ł����c�c",-;
			emotion 20,"";
			mes "[�l�R����]";
			mes "�܂��Ȃ��H����";
			mes "�c�Ƃł���悤�ɂȂ�̂��B";
			mes "�@";
			mes "�܂��́A�~�X�e�B�ɔт�^����̂��B";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�I�@�тȂ̂��I";
			mes "�@";
			mes "�]�l�R�����͋󕠂ł������肵�Ă���";
			mes "�@�~�X�e�B�̑O��";
			mes "�@�����������Ȃɂ����̓���u�����]";
			next;
			mes "�]�s�N���Ƃ������Ȃ������~�X�e�B��";
			mes "�@���ɔ�т����I�]";
			next;
			emotion 77, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���I�@���I";
			mes "�@";
			mes "�c�c����ς���͍ō��Ȃ̂����";
			next;
			mes "[�H���̐�]";
			mes "^0000FF���炭���҂����������܂����B";
			mes "�H���̉c�Ƃ��ĊJ�������܂��B^000000";
			next;
			emotion 46, "�l�R����#ac_Necorin";
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "�ǂ����A";
			mes "�S�Ă����ʂ�ɂȂ����̂��I";
			mes "�@";
			mes "��������̕�V��������̂��I";
			mes "��`�@�|���`�����ƁI";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 2,"";
			chgquest 100815,100817;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight(569,200)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 200;
			chgquest 100817,100818;
			if(checkre()) {
				getexp 33,0;
				getexp 33,0;
				getexp 33,0;
				getexp 0,19;
				getexp 0,19;
				getexp 0,19;
			}
			else {
				getexp 333,0;
				getexp 333,0;
				getexp 333,0;
				getexp 0,190;
				getexp 0,190;
				getexp 0,190;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ӂ��c�c";
			mes "������������B";
			next;
			mes "[�~�X�e�B]";
			mes "����H";
			mes "" + strcharinfo(0) + "";
			mes "�ł͂Ȃ����I�@�ǂ������̂���H";
			next;
			menu "�̂�C�ł��˂��c�c",-;
			emotion 54,"";
			emotion 55, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�H";
			mes "�������������������̂���H";
			next;
			emotion 36, "�l�R����#ac_Necorin";
			emotion 9,"";
			mes "[�l�R����]";
			mes "�~�X�e�B�͌�ł��d�u���Ȃ̂��c�c";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�������`�A";
			mes "����Ȃ��`�E���Ȃ��c�c";
			next;
			mes "�]���ǁA�H���̖��́A";
			mes "�@�|�����c�ɂ���đS�ĉ��������B";
			mes "�@";
			mes "�@�|�����c��";
			mes "�@���̑g�D���ƌ����Ă��邪�A";
			mes "�@�{���ɂ����Ȃ̂��낤���H";
			mes "�@�܂��܂��䂪�����g�D���c�c�]";
			next;
			mes "[^FF0000��l�b�I��^000000]";
			mes "�]��ܘb�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��13�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 5,1;
			close2;
			chgquest 100818,200965;
			set AC_QUEST_LV_6,4;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+6;
			end;
		}
		break;
	/////////   ��ܘb   /////////
	case 4:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<13){
				emotion 52, "�~�X�e�B#ac_Misty"; //54753
				mes "[�~�X�e�B]";
				mes "�l�R�����a�I";
				mes "�����������ɋC�Â����̂���I";
				next;
				emotion 1, "�l�R����#ac_Necorin"; //54754
				mes "[�l�R����]";
				mes "���ɋC�Â����̂��H";
				next;
				emotion 29, "�~�X�e�B#ac_Misty"; //54753
				emotion 33, "�l�R����#ac_Necorin"; //54754
				mes "[�~�X�e�B]";
				mes "���͂̂��c�c";
				next;
				mes "�]�l�R�����ƃ~�X�e�B��";
				mes "�@�Ђ��Ђ��R�\�R�\��";
				mes "�@���k�����Ă���]";
				next;
				mes "[^FF0000��l�b�I��^000000]";
				mes "�]��ܘb�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��13�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				next;
				Information 5,1;
				close;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂��B";
			mes "���C�ɂ��Ă��������H";
			next;
			mes "[�~�X�e�B]";
			mes "����͏��������̂����";
			mes "�N�̊���ŐH���͎��ꂽ�̂���B";
			next;
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����������I";
			mes "�|�����c�͈��̑g�D�Ȃ̂���!!";
			mes "�F�����点�˂΂Ȃ��̂���!!!!";
			next;
			emotion 1,"";
			mes "[�~�X�e�B]";
			mes "�C�Â��Ă��������H";
			mes "���̎�����!?";
			next;
			menu "�C�Â��Ė���������ł����H",-;
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Ȃ��!?";
			mes "�m���Ă������̂��I";
			next;
			emotion 54, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�C�Â��ĂȂ��̂́A";
			mes "�~�X�e�B�����Ȃ̂��I";
			mes "�~�X�e�B�́A�{���Ƀo�J�Ȃ̂�!!";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�l�R�����a�Ђǂ��̂���c�c";
			mes "�@";
			mes "�����Ƒ����A";
			mes "�����Ă���Ă��ǂ����̂��c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�܂��c�c�߂������Ȃ̂���I";
			mes "�C�ɂ����畉���Ȃ̂���I";
			mes "�@";
			mes "���������A��������I";
			mes "����ǂ����̂������Ă̂���";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ǂ��ɒu�������̂��c�c�����Ɓc�c";
			mes "�����H";
			mes "�������A��������";
			mes "�@";
			mes "���̖��@���Ȃ񂶂Ⴊ�c�c";
			mes "�R�R�̏����悭�ǂ�ł݂�̂���I";
			next;
			mes "�]�~�X�e�B�́A�₽���";
			mes "�@�V�~���炯�̖��@����";
			mes "�@" + strcharinfo(0) + "��";
			mes "�@�ڑO�ɂ��������B";
			mes "�@���̖{�̃^�C�g���́c�c�]";
			next;
			menu "^FF0000�N�ɂł����閂�@�̔��^000000�H",-;
			emotion 5,"";
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��������A��򂶂�I";
			mes "�������N�ɂł�����̂���!!";
			mes "�@";
			mes "�ʔ����������H";
			next;
			menu "���ʂ͏����Ă���̂ł����H",-;
			emotion 1,"";
			mes "[�~�X�e�B]";
			mes "���ꂪ�킩��Ȃ��̂���c�c";
			mes "�@";
			mes "�̐S�̃y�[�W���A���҂��ɂ����";
			mes "�j���Ă����ĂȂ��c�c";
			next;
			menu "�N������Ȏ����c�c",-;
			emotion 20, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�{���́A";
			mes "�~�X�e�B���W���[�X�����ڂ����̂��B";
			mes "�W���[�X�����݂Ȃ���ǂނ���Ȃ̂��B";
			mes "�@";
			mes "�~�X�e�B�́A�R�����Ă�̂��B";
			next;
			menu "����ς�A�����������ł���",-;
			emotion 54,"";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�`�I";
			mes "�΂炳�Ȃ��Ă��ǂ��ł͂Ȃ����c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�����Ȃ̂���I";
			mes "���V���W���[�X�����ڂ����̂���I";
			mes "�@";
			mes "�ł��A�������Ŋy���݂������������H";
			next;
			menu "�c�c������ǂ��������̂ł����H",-;
			emotion 54,"";
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���������Ă��邩�I";
			mes "�@";
			mes "����ȂɊy�������Ȃ���";
			mes "���Ȃ��킯���Ȃ������H";
			next;
			mes "[�~�X�e�B]";
			mes "�����ɂ��`�������W����̂���I";
			mes "�@";
			mes "���͊������Ă����";
			mes "���y���݂Ȃ̂����";
			next;
			menu "�m���ɔ��̌��ʂ͋C�ɂȂ邯�ǁc�c",-;
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�A";
			mes "��͂�C�ɂȂ�悤����ȁB";
			next;
			mes "[�~�X�e�B]";
			mes "�܂��܂��A";
			mes "����Ă���l���悤�ł͂Ȃ�����";
			mes "�@";
			mes "�܂��́A��鎖���̐S�Ȃ̂���I";
			mes "�����̃A���c�c�~���������H";
			next;
			menu "���傤���Ȃ��ł���",-;
			emotion 14,"";
			emotion 56, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����Ȏ��������A";
			mes "�{���͍���Ă݂����񂶂��H";
			mes "�@";
			mes "�f���Ɍ����Ηǂ��̂ɂ̂���";
			next;
			mes "[�~�X�e�B]";
			mes "���Ă��āA";
			mes "���@����ǂތ��肶��Ɓc�c";
			mes "�@";
			mes "�ӂނӂށc�c";
			next;
			mes "[�~�X�e�B]";
			mes "�Ԃ����̂��̍��c�c";
			mes "�����̏`�c�c";
			mes "�X�|�A�̓��c�c";
			mes "�}���h���S���̎��I";
			mes "�@";
			mes "����炪�K�v�Ȃ悤����I";
			next;
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�Ԃ����̂�^000000";
			mes "^FF0000�E^000000^FF0000����^000000";
			mes "^FF0000�E^000000^FF0000�X�|�A^000000";
			mes "^FF0000�E^000000^FF0000�}���h���S��^000000";
			mes "�Ȃ̂��I";
			next; 
			mes "[�~�X�e�B]";
			mes "�l�R�����a�͕��m�肾�̂��B";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING04_mobinfo	{
				switch(getarg(0)){
				case 100820:
					mes "[�~�X�e�B]";
					mes "�����̂��̂�����ȁB";
					mes "�@";
					mes "�ۑ��Ȃǎ���C�̑����Ƃ����";
					mes "��������A������B";
					mes "�J�`�J�`�Ȃ��̂����Ⴊ�A";
					mes "�������A���F�����̂��̂��Ȃ̂���I";
					break;
				case 100822:
					mes "[�~�X�e�B]";
					mes "���ӂȂǂɂ܂�ɐ������������B";
					mes "�@";
					mes "�̎�ł�����n�[�u�́A";
					mes "�|�[�V�����̍ޗ��ɂ��Ȃ�悤����B";
					mes "���������A���X�ނ���Ȃ���";
					mes "���F�A�����̐����Ȃ̂���I";
					break;
				case 100824:
					mes "[�~�X�e�B]";
					mes "���̂��̂���������B";
					mes "�@";
					mes "�������ƌ����Ă��A";
					mes "�U�����Ȃ���ΏP���Ă��Ȃ��̂���B";
					mes "�����𑽂��܂�ł����Ă̂��c�c";
					mes "���̗͂Ɏセ������ȁB";
					break;
				case 100826:
					mes "[�~�X�e�B]";
					mes "�A�������\�����������X�^�[����I";
					mes "�@";
					mes "���������ɁA��������l�q�����Ă��Ă�";
					mes "�c�^�ōU�����Ă��̂���c�c";
					mes "�������A���z����擾�o����s�́A";
					mes "�l�X�ȏ㋉��i�̍ޗ��ɂ��Ȃ�̂���I";
					break;
				}
				return;
			}
			function	AC_PORING04_warp;
			function	AC_PORING04	{
				set '@questid,0;
				//100820,���@�̔��@,0,1085,20,0,0,0,0
				//100822,���@�̔��@,0,1079,10,0,0,0,0
				//100824,���@�̔��@,0,1014,5,0,0,0,0
				//100826,���@�̔��@,0,1020,5,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�Ԃ����̂�^000000","^FF0000����^000000","^FF0000�X�|�A^000000","^FF0000�}���h���S��^000000")){
					case 1:
						AC_PORING04_mobinfo 100820;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�Ԃ����̂�^000000�v����ȁH";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100820;
						break;
					case 2:
						AC_PORING04_mobinfo 100822;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000����^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100822;
						break;
					case 3:
						AC_PORING04_mobinfo 100824;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X�|�A^000000�v����ȁH";
						mes "�@";
						mes "^FF00005�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100824;
						break;
					case 4:
						AC_PORING04_mobinfo 100826;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�}���h���S��^000000�v����ȁH";
						mes "�@";
						mes "^FF00005�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100826;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�l�R����]";
				mes "����Ȃ̂��I";
				mes "�@";
				switch(AC_QUEST_ST_6){
				case 100820: mes "�u^FF0000�Ԃ����̂�^000000�v���A"; break;
				case 100822: mes "�u^FF0000����^000000�v���A"; break;
				case 100824: mes "�u^FF0000�X�|�A^000000�v���A"; break;
				case 100826: mes "�u^FF0000�}���h���S��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂��I";
				next;
				mes "[�~�X�e�B]";
				mes "�c��̓��V���W�߂悤�I";
				mes "����Ė����Ɣ��f������A";
				mes "���ł��߂��Ă���̂���I";
				mes "�@";
				mes "��������c�c";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING04_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				end;
			}
			function	AC_PORING04_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 5,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100820:
					case 100822:
					case 100824: warp "ac_prac_01.gat",225,31; break;
					case 100826: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100820: warp "prt_fild10.gat",82,104;  break;
					case 100822: warp "gef_fild08.gat",200,352;  break;
					case 100824: warp "pay_fild01.gat",278,18; break;
					case 100826: warp "prt_fild02.gat",305,22; break;
					}
				}
				return;
			}
			AC_PORING04;
			end;
		case 100820:
		case 100822:
		case 100824:
		case 100826:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "���̍ޗ��́A";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100820: set '@select$,'@select$ + "�u^FF0000�Ԃ����̂�^000000�v�ɂ��ċ�����";  break;
				case 100822: set '@select$,'@select$ + "�u^FF0000����^000000�v�ɂ��ċ�����";  break;
				case 100824: set '@select$,'@select$ + "�u^FF0000�X�|�A^000000�v�ɂ��ċ�����"; break;
				case 100826: set '@select$,'@select$ + "�u^FF0000�}���h���S��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING04_warp 0;
					end;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂���I";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING04_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING04;
					end;
				case 3:
					AC_PORING04_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ǂ���������H";
			mes "���n�̂ق��́H";
			next;
			menu "����ŗǂ��ł����H",-;
			mes "[�~�X�e�B]";
			mes "����J��������̂��B";
			mes "���ꂾ������Ώ\������I";
			mes "�@";
			mes "�N�x��������O��";
			mes "���@�̔����Ɏ��|����̂���I";
			next;
			menu "����ėǂ������ł�",-;
			mes "[�~�X�e�B]";
			mes "���ꂾ������΁A";
			mes "4�E5��͎��s�ł���������̂��c�c";
			next;
			emotion 1, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����ȂɎ��s�������Ȃ̂��H";
			next;
			mes "[�~�X�e�B]";
			mes "���₢��A���ꂾ����R�W�߂Ă���";
			mes "���ꂽ�Ƃ������Ƃ�����";
			next;
			emotion 18,"";
			mes "[�l�R����]";
			mes "�������A���s�̎����l����";
			mes "�ޗ��𑽂߂ɗp�ӂ����̂��Ɓc�c";
			mes "�@";
			mes "����ς�~�X�e�B�́A";
			mes "�����l���ĂȂ��Ȃ������̂��B";
			mes "���S�����̂��I";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�l�R�����a�����܂Ō���Ȃ��Ă��c�c";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "������������A������������B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6,100828;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight2(569,200, 645,10)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 200;
			getitem 645, 10;
			chgquest 100828,100829;
			if(checkre()) {
				getexp 30,0;
				getexp 30,0;
				getexp 30,0;
				getexp 30,0;
				getexp 30,0;
				getexp 30,0;
				getexp 0,5;
				getexp 0,5;
				getexp 0,5;
				getexp 0,5;
				getexp 0,5;
				getexp 0,5;
			}
			else {
				getexp 300,0;
				getexp 300,0;
				getexp 300,0;
				getexp 300,0;
				getexp 300,0;
				getexp 300,0;
				getexp 0,50;
				getexp 0,50;
				getexp 0,50;
				getexp 0,50;
				getexp 0,50;
				getexp 0,50;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��`���A�ł͂���������";
			mes "�K�v�Ȃ��̂́c�c�ӂނӂށc�c";
			mes "�@";
			mes "�����i�߂�H���I";
			mes "�ڎw���͑傫���炶��I";
			next;
			emotion 12, "�l�R����#ac_Necorin";
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "����ł́A�܂�����Ȃ̂��I";
			next;
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "���[���l�R�����a�`�I";
			mes "�������Ȃ��ƒu���Ă䂭���[!!";
			next;
			mes "[^FF0000��ܘb�I��^000000]";
			mes "�]��Z�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��16�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 6,1;
			close2;
			chgquest 100829,200970;
			set AC_QUEST_LV_6,5;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+7;
			end;
		}
		break;
	/////////   ��Z�b   /////////
	case 5:
		switch(AC_QUEST_ST_6){
		case 0:
			mes "�]�|�����c�̃l�R������";
			mes "�@�~�X�e�B�̂����p��";
			mes "�@�傫�ȓ�Ƃ��̑��������ȍޗ���";
			mes "�@���߂�����Ă����]";
			next;
			emotion 33, "�~�X�e�B#ac_Misty";
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���́A";
			mes "�X�|�A�̓��ƐԂ����̂��̍���";
			mes "�݂���؂�ɂ���̂��[�I";
			next;
			if(BaseLevel<16){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��Z�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��16�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 33, "�~�X�e�B#ac_Misty";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�`�B";
			mes "�@";
			mes "�X�|�A�̓��݂̂���؂�́A";
			mes "���̂������ڂɂ��݂�̂��Ⴀ�`�I";
			next;
			menu "���́[�A���v�ł����H",-;
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "�N�Ȃ̂���H";
			mes "�܂őO�������Ȃ��̂���c�c";
			next;
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�A";
			mes "" + strcharinfo(0) + "��";
			mes "�����̂��B";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "����Ȃ炻���ƁA";
			mes "���O�������Ă��ꂽ��ǂ��̂ɁA";
			mes "��Ȃ��̂��c�c";
			mes "�@";
			mes "�l�R�����a�A������Ɗ�����Ă���B";
			next;
			mes "�]�~�X�e�B�͖ڂ��������A";
			mes "�@�ӂ�ӂ�ƕ����Ă������]";
			next;
			menu "���ł킩��Ǝv�����̂Łc�c",-;
			emotion 18, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�̋L���͂́A";
			mes "�O����������Y��郌�x���Ȃ̂��B";
			mes "�@";
			mes "�ǂ����悤���Ȃ��̂��B";
			next;
			mes "[�~�X�e�B]";
			mes "���܂�̂��c�c";
			mes "�@";
			mes "����A���������o�����I";
			mes "������͑��v����I";
			next;
			menu "�������c�c�{���ł����H",-;
			emotion 32,"";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�@";
			mes "�����ł��ǂ�����A";
			mes "���V��M�p���Ă���c�c";
			next; 
			switch(select("�킩��܂����M�p���܂�","�킩��܂����M�p���܂���")){
			case 1:
				emotion 18,"";
				break;
			case 2:
				emotion 22,"";
				mes "[�~�X�e�B]";
				mes "�������I";
				mes "�M�p���c�c�Ȃ��H";
				mes "�@";
				mes "�M�p���ė~�����̂���c�c";
				next;
				break;
			}
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������́A��΂ɑ��v����I";
			mes "�@";
			mes "�u�D�M�v�ɂ̂��������";
			mes "���S����̂���I";
			next;
			emotion 9, "�l�R����#ac_Necorin";
			emotion 9,"";
			mes "[�l�R����]";
			mes "����������Ȃ�u��D�v�Ȃ̂��c�c";
			next;
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�c�c�c�c";
			mes "�@";
			mes "�u��M�v�ɂ̂��������";
			mes "���S����̂���I";
			next;
			menu "�c�c�c�c",-;
			mes "[�~�X�e�B]";
			mes "�����ƁA";
			mes "���������Ζ��@���ɂ��ƁA";
			mes "�܂��܂��ޗ����K�v��������I";
			next;
			menu "�����K�v�Ȃ̂ł����H",-;
			emotion 54, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ꂪ�ȁc�c";
			mes "�}�ɖ��@�����Í�������ĂĂȁB";
			mes "�@";
			mes "�����ς��Ǐo���Ȃ��̂���B";
			next;
			mes "�]�~�X�e�B�͋^�╄�𕂂��ׂȂ���";
			mes "�@�����������@�������グ�Ă���B";
			mes "�@�c�c���̖��@���̃^�C�g������";
			mes "�@�㉺���t�ɂȂ��Ă����]";
			next;
			menu "����A�㉺�t���܂���c�c",-;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�c�c�c�c!!";
			next;
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "��";
			mes "�A�h�o�C�X�ŉ�Ǐo�������I";
			mes "����������ȁI";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�͂ǂ����Ă�";
			mes "�Í��ɂ������݂����Ȃ̂��I";
			next;
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���Ă��āA���@����ǂތ��肶��ƁA";
			mes "�@";
			mes "�ӂނӂށc�c";
			next;
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���b�J�[�̉H�c�c";
			mes "�z�[�l�b�g�̉H�c�c";
			mes "�A���o�[�i�C�g�̖ځc�c";
			mes "�}���h���S���̎��I";
			mes "�@";
			mes "����炪�K�v�Ȃ悤����I";
			next;
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000���b�J�[^000000";
			mes "^FF0000�E^000000^FF0000�z�[�l�b�g^000000";
			mes "^FF0000�E^000000^FF0000�A���o�[�i�C�g^000000";
			mes "^FF0000�E^000000^FF0000�}���h���S��^000000";
			mes "�Ȃ̂��I";
			next;
			switch(select("�킩��܂���","����H�@������Ƒ҂��āH")){
			case 1:
				emotion 33,"";
				break;
			case 2:
				emotion 1,"";
				mes "[�~�X�e�B]";
				mes "���H";
				mes "�ǂ������̂���H";
				next;
				menu "�}���h���S���̎��͑O��c�c",-;
				emotion 23, "�~�X�e�B#ac_Misty";
				mes "[�~�X�e�B]";
				mes "���A�������I";
				mes "�@";
				mes "�������A����Ȃ������̂���I";
				next;
				menu "�c�c�{���ł����H",-;
				emotion 4, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "����Ȃ��Ȃ����̂́A";
				mes "�~�X�e�B���]���������Ȃ���";
				mes "�O�j�O�j�ƂԂ��Ă邩��Ȃ̂��B";
				mes "�@";
				mes "�Ђ�����Ԃ��āA";
				mes "�S���n�ʂɗ��Ƃ����̂��c�c";
				next;
				mes "[�~�X�e�B]";
				mes "�Ⴄ�̂��႟�`�B";
				mes "�@";
				mes "�����c�c�����������ȃ����S��";
				mes "�C������Ă��c�c";
				mes "�@";
				mes "�d���Ȃ������̂���I";
				next;
				emotion 17, "�~�X�e�B#ac_Misty";
				mes "[�~�X�e�B]";
				mes "������͋C�����邩��";
				mes "�����Ăق����̂���c�c";
				mes "�@";
				mes "����������Ղ肷��̂���I";
				next;
				menu "���傤���Ȃ��ł��ˁc�c",-;
				break;
			}
			mes "[�~�X�e�B]";
			mes "�{���ɂ��܂�̂��B";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�ǂ�ɂ��邩�I��łق����̂���I";
			function	AC_PORING05_mobinfo	{
				switch(getarg(0)){
				case 100830:
					mes "[�~�X�e�B]";
					mes "���y�D���̃o�b�^����B";
					mes "�@";
					mes "�����炩�����o���Ȃ�����A";
					mes "���Q����B";
					mes "�W�����v���鎞�̉����A";
					mes "���邳���̂���_�ȍ����Ȃ̂���B";
					break;
				case 100832:
					mes "[�~�X�e�B]";
					mes "�����I����ȁB";
					mes "�����I�ׂ̈ɓ����Ă���B";
					mes "�@";
					mes "���Ȃ݂ɁA";
					mes "���z�̗��Ƃ��I�̐j�͐l�C���i�łȁA";
					mes "������������Ă����l�����邼�B";
					break;
				case 100834:
					mes "[�~�X�e�B]";
					mes "�J�^�c��������ȁB";
					mes "�d���k�ɕ����Ă��邼�B";
					mes "�@";
					mes "�k���k���Ɠ����đ����x�����A";
					mes "�k���d���Ō��ɂ͏��������̂���B";
					break;
				case 100836:
					mes "[�~�X�e�B]";
					mes "�A�������\�����������X�^�[����I";
					mes "�@";
					mes "���������ɁA��������l�q�����Ă��Ă�";
					mes "�c�^�ōU�����Ă��̂���c�c";
					mes "�������A���z����擾�o����s�́A";
					mes "�l�X�ȏ㋉��i�̍ޗ��ɂ��Ȃ�̂���I";
					break;
				}
				return;
			}
			function	AC_PORING05_warp;
			function	AC_PORING05	{
				set '@questid,0;
				//100830,���@�̔��A,0,1052,40,0,0,0,0
				//100832,���@�̔��A,0,1303,40,0,0,0,0
				//100834,���@�̔��A,0,1094,10,0,0,0,0
				//100836,���@�̔��A,0,1020,10,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000���b�J�[^000000","^FF0000�z�[�l�b�g^000000","^FF0000�A���o�[�i�C�g^000000","^FF0000�}���h���S��^000000")){
					case 1:
						AC_PORING05_mobinfo 100830;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000���b�J�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100830;
						break;
					case 2:
						AC_PORING05_mobinfo 100832;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�z�[�l�b�g^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100832;
						break;
					case 3:
						AC_PORING05_mobinfo 100834;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�A���o�[�i�C�g^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100834;
						break;
					case 4:
						AC_PORING05_mobinfo 100836;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�}���h���S��^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100836;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�l�R����]";
				mes "����Ȃ̂��I";
				mes "�@";
				switch(AC_QUEST_ST_6){
				case 100830: mes "�u^FF0000���b�J�[^000000�v���A"; break;
				case 100832: mes "�u^FF0000�z�[�l�b�g^000000�v���A"; break;
				case 100834: mes "�u^FF0000�A���o�[�i�C�g^000000�v���A"; break;
				case 100836: mes "�u^FF0000�}���h���S��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂��I";
				next;
				mes "[�~�X�e�B]";
				mes "�c��̓��V���W�߂悤�I";
				mes "����Ė����Ɣ��f������A";
				mes "���ł��߂��Ă���̂���I";
				mes "�@";
				mes "��������c�c";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING05_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING05_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 6,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100830: warp "ac_prac_02.gat",108,33; break;
					case 100832: warp "ac_spec_01.gat",283,34; break;
					case 100834: warp "ac_prac_02.gat",108,33; break;
					case 100836: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100830: warp "prt_fild04.gat",380,332; break;
					case 100832: warp "mjolnir_04.gat",165,196; break;
					case 100834: warp "gef_fild09.gat",225,28; break;
					case 100836: warp "prt_fild02.gat",305,22; break;
					}
				}
				return;
			}
			AC_PORING05;
			end;
		case 100830:
		case 100832:
		case 100834:
		case 100836:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "���̍ޗ��́A";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100830: set '@select$,'@select$ + "�u^FF0000���b�J�[^000000�v�ɂ��ċ�����";  break;
				case 100832: set '@select$,'@select$ + "�u^FF0000�z�[�l�b�g^000000�v�ɂ��ċ�����";  break;
				case 100834: set '@select$,'@select$ + "�u^FF0000�A���o�[�i�C�g^000000�v�ɂ��ċ�����"; break;
				case 100836: set '@select$,'@select$ + "�u^FF0000�}���h���S��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING05_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂���I";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING05_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING05;
					end;
				case 3:
					AC_PORING05_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ǂ���������H";
			mes "���n�̂ق��́H";
			next;
			menu "����ŗǂ��ł����H",-;
			mes "[�~�X�e�B]";
			mes "����J�������̂��B";
			mes "���ꂾ������΁A�o�b�`������I";
			mes "�@";
			mes "�N�x��������O�ɁA";
			mes "���@�̔����Ɏ��|����̂���I";
			next;
			menu "���x�͋C�����Ă��������ˁH",-;
			emotion 32,"";
			mes "[�~�X�e�B]";
			mes "���x�͂����ƌ��Ă邩����v����I";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����ɂ��Ă��A";
			mes "��̂ǂ�Ȍ��ʂ�����̂��̂��c�c";
			mes "�@";
			mes "�y���݂���Ȃ���";
			next;
			menu "�����ł���",-;
			emotion 2,"";
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���̗\�z�ł́u�΂���v�Ȃ̂��I";
			mes "�@";
			mes "�΂����~�܂�Ȃ��āA";
			mes "�݂�Ȃ��A����͂��Ȃ̂��c�c";
			mes "���̊Ԃɐ��E�𐪕�����̂�!!";
			next;
			mes "[�~�X�e�B]";
			mes "���₢��A";
			mes "�u���V�̖��߂𕷂���v";
			mes "�Ƃ����̂��A������̂��c�c";
			next;
			menu "���߂𕷂���!?",-;
			emotion 1,"";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ށI�@���́c�c";
			mes "���V�ɂ͋��\�Ȏo�オ����̂���I";
			mes "�@";
			mes "�o��̂������ŁA";
			mes "���V�͂��������c�c";
			next;
			emotion 76, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o��͕�������p�Ȃ̂��Ⴊ�A";
			mes "���������͕��������Ȃ̂���B";
			mes "�@";
			mes "���������̕s�����͎E�l�I����c�c";
			next;
			mes "[�~�X�e�B]";
			mes "���́A";
			mes "���̗����̘r�𔃂���";
			mes "�A�T�V���M���h��";
			mes "�������Ă���̂���B";
			mes "�@";
			mes "�Ȃ�ł��A�Ŗ������Ă���炵�����H";
			next;
			menu "���̖�ŉ����������́H",-;
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���V�����߂���΁A";
			mes "�o�オ���������悤�ɂȂ邶���H";
			mes "�@";
			mes "���̗������݂�Ȃ��H�ׂ�΁A";
			mes "���V�Ɠ����ꂵ�݂𖡂키�̂���I";
			next;
			emotion 20,"";
			mes "[" + strcharinfo(0) + "]";
			mes "�i���̖���݂�Ȃ�";
			mes "���܂����ق��������̂ł́c�c�H";
			mes "�@";
			mes "����A�~�X�e�B�ɂ͖ق��Ă������j";
			next;
			menu "���낵���ł���",-;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����������";
			mes "�@";
			mes "����[�A�y���݂���Ȃ��B";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "������������A������������B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6,100838;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight2(569,200, 602,5)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 200;
			getitem 602, 5;
			chgquest 100838,100839;
			if(checkre()) {
				getexp 65,0;
				getexp 65,0;
				getexp 65,0;
				getexp 65,0;
				getexp 0,25;
				getexp 0,25;
				getexp 0,25;
				getexp 0,25;
			}
			else {
				getexp 650,0;
				getexp 650,0;
				getexp 650,0;
				getexp 650,0;
				getexp 0,250;
				getexp 0,250;
				getexp 0,250;
				getexp 0,250;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���āc�c�܂��́A";
			mes "�}���h���S���̎�����ł�̂��I";
			mes "�@";
			mes "��ł���A";
			mes "����ނ��Đ����̏`��������";
			mes "�O�j�O�j�ƂԂ��̂��I";
			next;
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o��I";
			mes "�҂��Ă���̂���!!";
			mes "�����������V�̌����Ȃ�Ɂc�c";
			mes "�@";
			mes "�t�b�t�b�t�b�B";
			next;
			menu "�o���Œ��������̂ł���",-;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�c�c�o���H";
			mes "�@";
			mes "���������Ă���̂���H";
			mes "���V�͒j���Ⴜ�H";
			next;
			menu "!?",-;
			emotion 0,"";
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ǂ�����ǂ����Ă��j����낣�H";
			mes "�@";
			mes "���������ȁH�@�l�R�����a�B";
			next;
			emotion 22, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ǂ�����ǂ����Ă����Ȃ̂��B";
			next;
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����Ȕn���ȁI";
			mes "�@";
			mes "�������H�@�ǂ������̂���c�c";
			mes "�@";
			mes "^0000FF���@�V�@�́@�j�@���@��@�I^000000";
			next;
			menu "�т����肵�܂����c�c",-;
			mes "[�~�X�e�B]";
			mes "�N�͂ǂ��ɖڂ����Ă�̂���H";
			mes "�N�̖ڂ͐ߌ���!?";
			mes "�@";
			mes "�܂����������Ď���Ȃ̂���B";
			next;
			emotion 9,"";
			mes "[" + strcharinfo(0) + "]";
			mes "�i�ǂ���玩���ł��C�Â��Ȃ��Ԃ�";
			mes "��J�����܂��Ă����悤���B";
			mes "�A���ĐQ������������������Ȃ��c�c�j";
			mes "�@";
			mes "�]" + strcharinfo(0) + "��";
			mes "�@���т���Ԃ����]";
			next;
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���[���ǂ��֍s���̂���H";
			mes "�@";
			mes "���[���c�c���[���c�c";
			next;
			mes "[^FF0000��Z�b�I��^000000]";
			mes "�]�掵�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��19�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			mes "[^FF0000��Z�b�I��^000000]";
			mes "�]�掵�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��19�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 7,1;
			close2;
			chgquest 100839,200975;
			set AC_QUEST_LV_6,6;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+7;
			end;
		}
		break;
	/////////   �掵�b   /////////
	case 6:
		switch(AC_QUEST_ST_6){
		case 0:
			mes "�]�|�����c�̃~�X�e�B��";
			mes "�@�l��l�y���[�܂��Ă��܂�������";
			mes "�@���̒��g�����邮��";
			mes "�@�����񂵂Ă���B";
			mes "�@���ׂ̗Œc���̃l�R������";
			mes "�@�e���V����������ђ��˂Ă����]";
			next;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�I";
			mes "�����Ɓc�c�����ƂȂ̂��I";
			mes "�@";
			mes "���̖��@���ɂ��ƁA";
			mes "���ƗF�B�ɂȂ�܂��u�߂�̂��I";
			next;
			if(BaseLevel<19){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]�掵�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��19�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���͗F�B�I�@���͗F�B�I";
			next;
			menu "�~�X�e�B����A�����Ԗڂ��c�c",-;
			emotion 4,"";
			mes "[�l�R����]";
			mes "" + strcharinfo(0) + "";
			mes "�������ɗ����̂�!!";
			next;
			menu "�܂����A�܂��ޗ��ł����H",-;
			emotion 33, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���̂܂����Ȃ̂�!!";
			mes "�@";
			mes "���ꂪ�Ō�̍ޗ��ɂȂ�̂��I";
			next;
			menu "�킩��܂����B�Ƃ��Ă��܂�",-;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "�������肪�悭�ď�����̂��B";
			mes "�@";
			mes "���Ă̒ʂ�A�~�X�e�B��";
			mes "�K�����u�߂��Ƃ����Ă���̂��I";
			mes "�l�肪����Ȃ��̂��B";
			next;
			mes "[�l�R����]";
			mes "���b�J�[�̗t�c�c";
			mes "���[���e�[���̑��c�c";
			mes "�X�P���g���̘r�c�c";
			mes "�q�h���̔�I";
			mes "�@";
			mes "����炪�K�v�Ȃ̂��I";
			next;
			emotion 54, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "	���͗F�B�I";
			mes "���͂Ƃ����c�c";
			mes "�@";
			mes "�ӂ��c�c��ꂽ�̂���B";
			next;
			emotion 6, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����I�@�T�{���Ă���_���Ȃ̂�!!";
			mes "�@";
			mes "�]�z���ʂ����Ĉꑧ���~�X�e�B��";
			mes "�@�l�R�����͊�����ꂽ�B";
			mes "�@�~�X�e�B�͍Q�ĂāA��Ƃ��ĊJ����]";
			next;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���͗F�B�I�@���͗F�B�I";
			next;
			emotion 54, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "������Ɩڂ𗣂��Ƃ�������Ȃ̂��B";
			mes "�@";
			mes "�������z�Ȃ̂��B";
			next;
			menu "�ł��A�撣���Ă܂���",-;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "���s������Ӗ����Ȃ��̂��I";
			mes "�@";
			mes "�����̂����͑厖�Ȃ̂��I";
			next;
			menu "�Ƃ���Ŏ����͉����W�߂���c�c",-;
			emotion 1,"";
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��I";
			next;
			mes "[�l�R����]";
			mes "�ޗ����Ƃ��̂́A���[���Ɓc�c";
			mes "^FF0000�E^000000^FF0000���b�J�[^000000";
			mes "^FF0000�E^000000^FF0000���[���e�[��^000000";
			mes "^FF0000�E^000000^FF0000�X�P���g��^000000";
			mes "^FF0000�E^000000^FF0000�q�h��^000000";
			mes "�Ȃ̂��I";
			next; 
			emotion 52,""; 
			mes "[�l�R����]"; 
			mes "�ǂ�ɂ���̂��I�Ԃ̂��I"; 
			mes "�@"; mes "��������`���Ă��ꂽ��"; 
			mes "�P�ʂ�������̂��I"; 
			function	AC_PORING06_mobinfo	{
				switch(getarg(0)){
				case 100840:
					mes "[�l�R����]";
					mes "���y�D���̃o�b�^�Ȃ̂��B";
					mes "�@";
					mes "�����炩�����o���Ȃ�����A";
					mes "���Q�Ȃ̂��B";
					mes "�W�����v���鎞�̉����A";
					mes "���邳���̂���_�ȍ����Ȃ̂��B";
					break;
				case 100842:
					mes "[�l�R����]";
					mes "���������X�^�[�Ȃ̂��B";
					mes "�@";
					mes "�����̂悤�Ɍ����邪�c�c";
					mes "���͐A���Ȃ̂�!!";
					mes "�΂Ɏセ���Ȃ̂��B";
					break;
				case 100844:
					mes "[�l�R����]";
					mes "�|�ꂽ�`���҂��A";
					mes "���ɂȂ��Ă�݂��������̂�!!";
					mes "�@";
					mes "���킢�̂��c�c";
					mes "�ł����Ȃ�U����A";
					mes "�񕜖��@�Ɏア�̂��I";
					break;
				case 100846:
					mes "[�l�R����]";
					mes "�C�\�M���`���N�Ȃ̂��B";
					mes "�@";
					mes "���ӂ̃����X�^�[�ŁA";
					mes "�������Ƃ͂Ȃ��̂��B";
					mes "�ł��A����������P���Ă���̂��B";
					mes "�������ɂ͉������Ȃ̂��I";
					break;
				}
				return;
			}
			function	AC_PORING06_warp;
			function	AC_PORING06	{
				set '@questid,0;
				//100840,���@�̔��B,0,1052,50,0,0,0,0
				//100842,���@�̔��B,0,1024,20,0,0,0,0
				//100844,���@�̔��B,0,1076,30,0,0,0,0
				//100846,���@�̔��B,0,1068,20,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000���b�J�[^000000","^FF0000���[���e�[��^000000","^FF0000�X�P���g��^000000","^FF0000�q�h��^000000")){
					case 1:
						AC_PORING06_mobinfo 100840;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000���b�J�[^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000050�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻���Ȃ̂��B";
						set '@questid, 100840;
						break;
					case 2:
						AC_PORING06_mobinfo 100842;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000���[���e�[��^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻���Ȃ̂��B";
						set '@questid, 100842;
						break;
					case 3:
						AC_PORING06_mobinfo 100844;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�X�P���g��^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000030�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻���Ȃ̂��B";
						set '@questid, 100844;
						break;
					case 4:
						AC_PORING06_mobinfo 100846;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�q�h��^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻���Ȃ̂��B";
						set '@questid, 100846;
						break;
					}
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					emotion 33, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�����X�^�[��ς���̂��H";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂��I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�l�R����]";
				mes "����Ȃ̂��I";
				mes "�@";
				switch(AC_QUEST_ST_6){
				case 100840: mes "�u^FF0000���b�J�[^000000�v���A"; break;
				case 100842: mes "�u^FF0000���[���e�[��^000000�v���A"; break;
				case 100844: mes "�u^FF0000�X�P���g��^000000�v���A"; break;
				case 100846: mes "�u^FF0000�q�h��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂��I";
				next;
				mes "[�l�R����]";
				mes "�c��͎����W�߂�̂�";
				mes "����Ė����Ɣ��f������A";
				mes "���ł��߂��Ă���̂��I";
				mes "�@";
				mes "���@�Ō��n�܂ő���̂��H";
				next;
				AC_PORING06_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING06_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 7,0;
				if(getarg(0)){
					emotion 21, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�N�̌������F��̂��I";
					mes "�@";
					mes "�������菀�������Ċ撣��̂��B";
					close;
				}
				emotion 78, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���ށI";
				mes "�����A�o�w�Ȃ̂��I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100840: warp "ac_prac_02.gat",108,33; break;
					case 100842: warp "ac_prac_02.gat",108,33; break;
					case 100844: warp "ac_spec_02.gat",124,59; break;
					case 100846: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100840: warp "prt_fild04.gat",380,332; break;
					case 100842: warp "pay_fild06.gat",69,286; break;
					case 100844: warp "pay_dun00.gat",21,183; break;
					case 100846: warp "iz_dun02.gat",339,328; break;
					}
				}
				return;
			}
			AC_PORING06;
			end;
		case 100840:
		case 100842:
		case 100844:
		case 100846:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				emotion 53;
				mes "[�~�X�e�B]";
				mes "���͗F�B�I�@���͗F�B�I";
				next;
				mes "[�l�R����]";
				mes "���q�͂ǂ��Ȃ̂��H";
				mes "�@";
				mes "���̍ޗ��́A";
				mes "�����ɏW�܂��Ă�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100840: set '@select$,'@select$ + "�u^FF0000���b�J�[^000000�v�ɂ��ċ�����";  break;
				case 100842: set '@select$,'@select$ + "�u^FF0000���[���e�[��^000000�v�ɂ��ċ�����";  break;
				case 100844: set '@select$,'@select$ + "�u^FF0000�X�P���g��^000000�v�ɂ��ċ�����"; break;
				case 100846: set '@select$,'@select$ + "�u^FF0000�q�h��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING06_warp 0;
				case 2:
					emotion 4, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "���������������̂��H";
					next;
					mes "[�l�R����]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂��B";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��A�ǂ��̂��H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33, "�l�R����#ac_Necorin";
						mes "[�l�R����]";
						mes "���ށB";
						mes "����΂�̂����B";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő���̂��H";
						next;
						AC_PORING06_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�ł́A���߂đI�Ԃ̂��I";
					AC_PORING06;
					end;
				case 3:
					AC_PORING06_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "���A��Ȃ̂���B";
			next;
			menu "�u�ߏI������̂ł����H",-;
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ށI";
			mes "�����A���ƗF�B�ɂȂꂽ�̂���I";
			next;
			mes "[�~�X�e�B]";
			mes "��������ǂ���������H";
			mes "���n�̂ق��́H";
			next;
			menu "����ŗǂ��ł����H",-;
			mes "[�~�X�e�B]";
			mes "����J�������̂��B";
			mes "���ꂾ������΂΂����肶��I";
			mes "�@";
			mes "�N�x��������O�ɁA";
			mes "���@�̔����Ɏ��|����̂���I";
			next;
			menu "���悢�抮���ł���",-;
			emotion 2,"";
			emotion 19, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�҂̂��I";
			mes "����Y�ꂿ��ʖڂȂ̂��I";
			next;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�I";
			mes "�ǂ��֍s���Ă������̂���H";
			next;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�Ō�̍ޗ����W�߂ɍs���Ă��̂��B";
			mes "�@";
			mes "�����I�@������g���̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�����c�c�Y��Ă��̂���B";
			mes "�@";
			mes "�t�b�t�b�t�b�B";
			mes "���Ɏo��Ɏd�Ԃ������鎞���I";
			next;
			menu "���ʂ��܂�������Ȃ��̂ɁH",-;
			mes "[�~�X�e�B]";
			mes "���₢��c�c��΂�";
			mes "�u���V�̖��߂𕷂���v�Ȃ̂���I";
			mes "���V�̒��N�̊������������Ă���I";
			mes "�@";
			mes "���܂ō�������ƁA�c��̍ޗ���";
			mes "�傫����ɓ���Ďύ��ނ̂���I";
			next;
			emotion 9,"";
			mes "[�l�R����]";
			mes "�~�X�e�B�̊��͓������������Ȃ��̂��B";
			mes "���̗\�z�ł́u�΂���v�Ȃ̂��I";
			mes "�@";
			mes "�΂����~�܂�Ȃ��Ă݂�ȍ���̂��B";
			mes "���̊Ԃɐ��E�𐪕�����̂��I";
			next;
			misceffect 17, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Ō�̎d�グ�Ȃ̂���I";
			next;
			misceffect 608, "�~�X�e�B#ac_Misty";
			emotion 7, "�l�R����#ac_Necorin";
			emotion 7, "�~�X�e�B#ac_Misty";
			emotion 7,"";
			mes "�]����������";
			mes "�@" + strcharinfo(0) + "�B��";
			mes "�@��ݍ��񂾁I�]";
			next;
			mes "[�~�X�e�B]";
			mes "�S�z�b�S�z�b�c�c";
			mes "�@";
			mes "��[�A�C���[�W���Ă��̂Ƃ͈Ⴄ�̂��B";
			mes "����ȏ��ʂ����o���Ȃ��̂��c�c";
			next;
			mes "[�l�R����]";
			mes "����ł͈�l�������Ȃ��̂��c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�܂��A�o�����͏o�����̂���I";
			mes "�����A�o��Ɉ��܂��Ă��̂���I";
			next;
			menu "�ǂ�����Ĉ��܂���́H",-;
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�B";
			mes "���̓��񂾎o��̗���g���̂���I";
			mes "�@";
			mes "����͎o��̈�Ԃ��C�ɓ���̗�c�c";
			mes "�����T���Ă���͂��Ȃ̂���I";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�A�������ǂ�����̂��B";
			next;
			emotion 19,"";
			mes "[�~�X�e�B]";
			mes "�o��́A�����������Ĕ��Ă���B";
			mes "���V�̏��ɗ�݂̍肩�𕷂��ɗ���̂�";
			mes "���Ԃ̖�肶��I";
			mes "�@";
			mes "�����Łc�c�h�{�h�����N��";
			mes "�R�����Ĉ��܂���̂���I";
			next;
			menu "����ς�~�߂��ق����c�c",-;
			emotion 0, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����烏�V�ł����v������";
			mes "�@";
			mes "�����Ɣ��������o��������";
			mes "�ȒP�ȍ�ƂȂ̂���I";
			mes "�@";
			mes "�c�c���I�@�o�オ�����I";
			next;
			cutin "job_black_hucke03.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c�~�X�e�B�c�c���̑厖�ȗ�B";
			mes "�c�c�m��Ȃ��H";
			next;
			emotion 19, "�l�R����#ac_Necorin";
			emotion 19,"";
			mes "[�~�X�e�B]";
			mes "�����c�c���V�͒m��񂼁H";
			mes "�@";
			mes "������o��A����ꂶ���H";
			mes "�h�{�h�����N����I";
			mes "�o��̂��߂ɍ�����̂���I";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c";
			mes "�c�c���肪�Ƃ��B";
			mes "�~�X�e�B�c�c�C�������c�c";
			mes "�@";
			mes "�]�q���b�P�͉h�{�h�����N�ƋU��ꂽ";
			mes "�@�������ł��܂����I�]";
			next;
			cutin "job_black_hucke02.bmp", 255;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�c�c";
			mes "���񂾁I�@���񂾂̂���I";
			next;
			mes "[�q���b�P]";
			mes "�c�c�c�c!!";
			mes "�����c�c�́c�c����Ȃ��B";
			mes "�c�c���c�c���܂����I";
			next;
			mes "[�~�X�e�B]";
			mes "�o��c�c";
			mes "����͉h�{�h�����N�ł͂Ȃ��B";
			mes "���@�̔��Ȃ̂���I";
			mes "�@";
			mes "�����A";
			mes "���V�̖��߂𕷂��Ă��炨�����̂��B";
			next;
			menu "�������c�c",-,"���o������v�ł����H",-;
			cutin "job_black_hucke01.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c�c!?";
			mes "�́c�c���c�c������B";
			mes "�܂�Łc�c�́c�c�݂Ȃ���I";
			next;
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ނނ��A";
			mes "�ǂ���疂�@�̔��̐��̂́A";
			mes "���N�ɂȂ�򂾂����悤�Ȃ̂��I";
			mes "�@";
			mes "����ł͐��E�����ł��Ȃ��̂��B";
			mes "�c�c�c�O�Ȃ̂��B";
			next;
			cutin "job_black_hucke02.bmp", 255;
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���c�c����Ȃ��I";
			mes "�@";
			mes "�]���̎��A�~�X�e�B�̉�����";
			mes "�@�q���b�P�̗邪�]�������Ă��܂����]";
			next;
			cutin "job_black_hucke03.bmp", 2;
			mes "[�q���b�P]";
			mes "����c�c���́c�c��I";
			mes "�c�c�x���c�c�D�_";
			mes "�Ɛl�c�c�~�X�e�B�I";
			mes "���́A�{�����I";
			next;
			cutin "job_black_hucke03.bmp", 255;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ЂႠ�������B";
			mes "�o�オ�{�����I";
			mes "�@";
			mes "�}���œ�����̂���`!!";
			next;
			emotion 16, "�l�R����#ac_Necorin";
			emotion 16,"";
			mes "[�l�R����]";
			mes "����̌��́A";
			mes "�~�X�e�B��l�őS��������̂��B";
			mes "�@";
			mes "����";
			mes "" + strcharinfo(0) + "�́A";
			mes "�֌W�Ȃ��̂��I";
			next;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���V�����̂Ă�Ȃ�č����̂���I";
			mes "�@";
			mes "�����Ă���Ȃ̂���`�`!!";
			mes "�@";
			mes "�]�~�X�e�B�́A��ڎU�ɓ����������]";
			next;
			cutin "job_black_hucke03.bmp", 2;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c�҂̂ł��I";
			mes "�@";
			mes "�]�������~�X�e�B���q���b�P���ǂ��B";
			mes "�@" + strcharinfo(0) + "��";
			mes "�@�l�R�����͂��̗l�q�����������]";
			next;
			cutin "job_black_hucke03.bmp", 255;
			emotion 19, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ӂ��c�c���������̂��B";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�N�̒P�ʂ𑝂₵�Ă������̂��B";
			mes "���łɁA������v���[���g�Ȃ̂��I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100848;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight2(569,200, 11518,50)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 200;
			getitem 11518, 50;
			chgquest 100848,100849;
			if(checkre()) {
				getexp 90,0;
				getexp 90,0;
				getexp 90,0;
				getexp 90,0;
				getexp 0,60;
				getexp 0,60;
				getexp 0,60;
				getexp 0,60;
			}
			else {
				getexp 900,0;
				getexp 900,0;
				getexp 900,0;
				getexp 900,0;
				getexp 0,600;
				getexp 0,600;
				getexp 0,600;
				getexp 0,600;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			mes "[�l�R����]";
			mes "�N���啪�����Ȃ��Ă����̂��B";
			mes "�@";
			mes "���ꂩ��A�����Ƌ��������X�^�[��";
			mes "�ǂ�ǂ�o�Ă���̂��c�c";
			mes "�@";
			mes "�߂����Ɋ撣��̂��I";
			next;
			menu "�͂����A����΂�܂��I",-;
			emotion 14,"";
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�܂�������������X�������ނ̂��B";
			mes "�@";
			mes "����ł͂܂�����Ȃ̂��B";
			next;
			mes "�]���͌��ʓI�ɗǂ������o�����B";
			mes "�@";
			mes "�@�ޗ��W�߂͑�ς��������A";
			mes "�@���̌��ʂ��y���݂���������";
			mes "�@�|�����c�ɂ�";
			mes "�@�`���Ȃ��ł����ׂ����낤�]";
			next;
			mes "[^FF0000�掵�b�I��^000000]";
			mes "�]�攪�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��22�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 8,1;
			close2;
			chgquest 100849, 200980;
			set AC_QUEST_LV_6,7;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+7;
			end;
		}
		break;
	/////////   �攪�b   /////////
	case 7:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<22){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]�攪�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��22�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂�";
			mes "���C�ɂ��Ă��������H";
			next;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̌�A�o��ɕ߂܂��Ăȁc�c";
			mes "�����̋��Ԃ�f�r���Ă������̂���B";
			mes "�@";
			mes "�Ȃ񂹁A���̎o��̗�����";
			mes "��ʂɐH�ׂ�����ꂽ�̂��Ⴉ��Ȃ��B";
			next;
			menu "����͑�ςł�����",-;
			mes "[�l�R����]";
			mes "�~�X�e�B�͂��΂炭�A";
			mes "�������ڂ����Ă��Ȃ������̂��B";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̗����̖��͒n���������̂���c�c";
			mes "�ߋ��ŋ��̖��������̂���B";
			next;
			mes "[�~�X�e�B]";
			mes "���������A���̑O��������";
			mes "���N���ɂ������񔄂�Ă̂��c�c";
			mes "���������������ς��Ȃ̂���I";
			mes "�@";
			mes "�������łق�A���������̂���I";
			next;
			emotion 0,"";
			mes "�]���������āA�~�X�e�B����������c�c";
			mes "�@�{�I�̉e�ɕs���R��";
			mes "�@^0000FF����^000000�͂������]";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "�]�������ے����鍕���肵���傫�Ȋp";
			mes "�@�S�Ă��Ȃ������l�ȑ傫�Ȋ��̉e";
			mes "�@�b�̂悤�ɑf���������ԑ́]";
			next;
			mes "�]�S�Ă������������̂悤��";
			mes "�@�傫�ȓ�����́A";
			mes "�@���ɂ��Ŗ��؂��";
			mes "�@�����������������B�]";
			next;
			mes "�]�ԑ̂ɂ́A�����J��";
			mes "�@�������F�|�����c�`�m!!";
			mes "�@�ƃ��S�܂Ńv�����g����Ă���";
			mes "�@";
			mes "�@^0000FF���{�b�g^000000�ł������]";
			next;
			menu "���{�b�g!?",-;
			emotion 3, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����Ȃ̂���I";
			mes "���������������H";
			mes "���O�́u�o�t�H�����v�Ȃ̂���I";
			next;
			emotion 3, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����̃o�t�H���b�g�l��";
			mes "���`�[�t�ɂ��č�����̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "���̑g�D�Ƃ����΃��{�b�g�����H";
			mes "����Ő��E����������̂���I";
			next;
			menu "!!",-;
			emotion 19,"";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "���̎戵�������ɂ��ƂȁA";
			mes "��o�t�H�����v�𓮂����ׂɂ�";
			mes "����ȔR�����K�v�ɂȂ�̂���!!";
			next;
			mes "�]�ǂ����A�~�X�e�B��";
			mes "�@�厖�ɘe�ɕ����Ă���{��";
			mes "�@�o�t�H�����̐������̂悤���B";
			mes "�@�₽�牘��Ă���̂́A";
			mes "�@�o�t�H�����̑g�ݗ��Ă�";
			mes "�@�]�������������Ȃ̂��낤���H�]";
			next;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Ȃ񂶂�H";
			mes "�����������Ă݂����̂��H";
			mes "�ق�A�厖�Ɉ����̂��Ⴜ�B";
			next;
			mes "�]�~�X�e�B�������Ă��ꂽ�������ɂ�";
			mes "�@^0000FF�q���p^000000���{�b�g�Ə�����Ă����B";
			mes "�@";
			mes "�@�g�̎���̈��S�������ۏႷ��";
			mes "�@���b�P���x���А���";
			mes "�@��������̂悤���B";
			mes "�@���S���Ӗ�����BLZB�}�[�N�t���]";
			next;
			menu "�c�c�c�c",-;
			emotion 9,"";
			mes "[�~�X�e�B]";
			mes "��������������H";
			mes "�@";
			mes "���̃��V�ł���A";
			mes "����Ƃ̎v���ō쐬�����̂���I";
			next;
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���E�������{��������Ȃ�āc�c";
			mes "�ǂ����̒��ɂȂ������񂶂�Ȃ��B";
			next;
			menu "����Ƃ��������Ă݂����ł���",-;
			emotion 33,"";
			emotion 56, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "������";
			mes "" + strcharinfo(0) + "�́A";
			mes "�m�����ǂ��̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�����ƁA�R���̘b���������̂��B";
			mes "�@";
			mes "�戵�������ɂ��ƂȁA";
			mes "�u�ʂ��v�Ƃ����R�����K�v�炵�����B";
			next;
			mes "�]�|�����c�̓�l��";
			mes "�@" + strcharinfo(0) + "��";
			mes "�@���邤�邳�����ڂ������Ă���B";
			mes "�@����́c�c";
			mes "�@������c�c�c�c�]";
			next;
			menu "�܂��c�c�ł����H",-;
			emotion 32,"";
			emotion 74, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����";
			mes "�@";
			mes "�܂�����Ȃ��c�c";
			next;
			emotion 74, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����B";
			mes "�@";
			mes "�܂��Ȃ̂��c�c";
			next;
			menu "�c�c���傤���Ȃ��ł���",-;
			mes "[�~�X�e�B]";
			mes "��`���Ă���Ă��肪�����̂���B";
			mes "�@";
			mes "�������A����͂��邼�B";
			next;
			emotion 22, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���Ă��āA";
			mes "���̔R�����쐬����ׂ̑f�ނɂ́c�c";
			mes "���[���Ɓc�c";
			mes "�@";
			mes "�]�~�X�e�B�̓L�����L������";
			mes "�@������T���Ă���]";
			next;
			mes "[�l�R����]";
			mes "�u�ʂ��v�̍쐬�@��";
			mes "���{�b�g�̐�������";
			mes "������ĂȂ���������";
			mes "�~�X�e�B�ɒ��ׂ������̂��B";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "�������I";
			mes "�������̂���!!";
			mes "�@";
			mes "�]�ςݏグ��ꂽ�{�̒�����";
			mes "�@�ړ��Ă̖{���������悤���]";
			next;
			mes "[�~�X�e�B]";
			mes "���́u�t���[���̔�@�v�Ƃ���";
			mes "�����ɂ��Ƃ���ȁc�c";
			next;
			emotion 5, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�΃[���[�c�c";
			mes "�e���g�E���V�̔�c�c";
			mes "�X�P���g���̓��c�c";
			mes "�t���[���̎�!!";
			mes "�@";
			mes "����炪�K�v�Ȃ悤����I";
			next;
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�|�|����^000000";
			mes "^FF0000�E^000000^FF0000�X�^�C�i�[^000000";
			mes "^FF0000�E^000000^FF0000�X�P���g��^000000";
			mes "^FF0000�E^000000^FF0000�t���[��^000000";
			mes "�Ȃ̂��I";
			next; 
			mes "[�~�X�e�B]";
			mes "�l�R�����a�͕��m�肾�̂��B";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING07_mobinfo	{
				switch(getarg(0)){
				case 100850:
					mes "[�~�X�e�B]";
					mes "�|�����́A�����m���Ă���ȁH";
					mes "�|�������T�N���݂ɗႦ���";
					mes "���z�́A�����M�݂���ȁ�";
					mes "�@";
					mes "�����A�����ڂ�肩�Ȃ苭���̂���B";
					mes "�\�����ӂ���̂���I";
					break;
				case 100852:
					mes "[�~�X�e�B]";
					mes "�Ă�Ƃ�������ȁB";
					mes "�@";
					mes "�����ڂ́A�������Ďセ�����Ⴊ�A";
					mes "�Ƃ��Ă����΂��������̂���!!";
					break;
				case 100854:
					mes "[�~�X�e�B]";
					mes "�|�ꂽ�`���҂��A";
					mes "���ɂȂ��Ă�݂��������̂���I";
					mes "�@";
					mes "���������낵���̂���c�c";
					mes "�ł����Ȃ�U����A";
					mes "�񕜖��@�Ɏア�̂����";
					break;
				case 100856:
					mes "[�~�X�e�B]";
					mes "�ԂȂ̂���c�c";
					mes "�l��H�ׂ悤�Ƃ���H�l�A���Ȃ̂���I";
					mes "�@";
					mes "�������A�A�������瓮���Ȃ��̂���B";
					mes "��������U���o����Ίy�Ȃ񂶂Ⴊ�ȁB";
					break;
				}
				return;
			}
			function	AC_PORING07_warp;
			function	AC_PORING07	{
				set '@questid,0;
				//100850,���E�������{�@,0,1031,20,0,0,0,0
				//100852,���E�������{�@,0,1174,15,0,0,0,0
				//100854,���E�������{�@,0,1076,40,0,0,0,0
				//100856,���E�������{�@,0,1118,5,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�|�|����^000000","^FF0000�X�^�C�i�[^000000","^FF0000�X�P���g��^000000","^FF0000�t���[��^000000")){
					case 1:
						AC_PORING07_mobinfo 100850;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�|�|����^000000�v����ȁH";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100850;
						break;
					case 2:
						AC_PORING07_mobinfo 100852;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X�^�C�i�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000015�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100852;
						break;
					case 3:
						AC_PORING07_mobinfo 100854;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X�P���g��^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100854;
						break;
					case 4:
						AC_PORING07_mobinfo 100856;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�t���[��^000000�v����ȁH";
						mes "�@";
						mes "^FF00005�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100856;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�l�R����]";
				mes "����Ȃ̂��I";
				mes "�@";
				switch(AC_QUEST_ST_6){
				case 100850: mes "�u^FF0000�|�|����^000000�v���A"; break;
				case 100852: mes "�u^FF0000�X�^�C�i�[^000000�v���A"; break;
				case 100854: mes "�u^FF0000�X�P���g��^000000�v���A"; break;
				case 100856: mes "�u^FF0000�t���[��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂��I";
				next;
				mes "[�~�X�e�B]";
				mes "�c��̓��V���W�߂悤�I";
				mes "����Ė����Ɣ��f������A";
				mes "���ł��߂��Ă���̂���I";
				mes "�@";
				mes "��������c�c";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING07_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING07_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 8,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100850: warp "ac_prac_01.gat",225,31; break;
					case 100852: warp "ac_prac_02.gat",108,33; break;
					case 100854: warp "ac_spec_02.gat",124,59; break;
					case 100856: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100850: warp "pay_fild04.gat",200,178; break;
					case 100852: warp "mjolnir_06.gat",380,74; break;
					case 100854: warp "pay_dun00.gat",21,183; break;
					case 100856: warp "mjolnir_11.gat",23,220; break;
					}
				}
				return;
			}
			AC_PORING07;
			end;
		case 100850:
		case 100852:
		case 100854:
		case 100856:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				emotion 2;
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u�ʂ��v�̍ޗ���";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100850: set '@select$,'@select$ + "�u^FF0000�|�|����^000000�v�ɂ��ċ�����";  break;
				case 100852: set '@select$,'@select$ + "�u^FF0000�X�^�C�i�[^000000�v�ɂ��ċ�����";  break;
				case 100854: set '@select$,'@select$ + "�u^FF0000�X�P���g��^000000�v�ɂ��ċ�����"; break;
				case 100856: set '@select$,'@select$ + "�u^FF0000�t���[��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING07_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂���I";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING07_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING07;
					end;
				case 3:
					AC_PORING07_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "���A��Ȃ̂���B";
			next;
			menu "�f�ނ������Ă��܂���",-;
			mes "[�~�X�e�B]";
			mes "�����������ɂ悱���̂���I";
			next;
			menu "�ǂ���",-;
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���񂤂�c�c���ꂶ��I";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "������������A������������B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100858;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight(569,200)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 200;
			chgquest 100858,100859;
			if(checkre()) {
				getexp 100,0;
				getexp 100,0;
				getexp 100,0;
				getexp 100,0;
				getexp 0,120;
				getexp 0,120;
				getexp 0,120;
				getexp 0,120;
			}
			else {
				getexp 1000,0;
				getexp 1000,0;
				getexp 1000,0;
				getexp 1000,0;
				getexp 0,1200;
				getexp 0,1200;
				getexp 0,1200;
				getexp 0,1200;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�B";
			mes "�@";
			mes "���Ɂu�o�t�H�����v���A";
			mes "�N������̂���I";
			next;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�R�������̂��I";
			mes "�@";
			mes "�]�|�����c�̓�l��";
			mes "�@���@�̔������̂Ɏg���Ă���";
			mes "�@�����ǂ����炩��������o����";
			mes "�@�ޗ����ǂ΂��Ɠ���ĉ΂������]";
			next;
			mes "�i�R�g�R�g�R�g�c�c�j";
			next;
			mes "�i�R�g�R�g�R�g�R�g�c�c�j";
			next;
			mes "�]�o���オ�����炵���R���u�ʂ��v��";
			mes "�@�~�X�e�B�̓��{�b�g�u�o�t�H�����v��";
			mes "�@���������I�]";
			next;
			misceffect 305, "�~�X�e�B#ac_Misty";
			mes "�]�傫�ȋ쓮���Ƌ���";
			mes "�@��������f���o����";
			mes "�@�����n�߂��o�t�H�����]";
			next;
			misceffect 17, "�~�X�e�B#ac_Misty";
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����Ŋ����Ȃ̂��I";
			mes "�u�o�t�H�����v���N������̂��I";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�u�o�t�H�����v�N������I";
			next;
			misceffect 79, "�~�X�e�B#ac_Misty";
			mes "�]���낵���قǑ傫�Ȋ���";
			mes "�@�U��グ�o�t�H������";
			mes "�@�{�I�̋����瓮���o�����]";
			mes "�@";
			mes "�i�o�M���[��!!";
			mes "�@";
			mes "�@�S�S�S�S�S�b�c�c�j";
			next;
			emotion 38, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������̂���I�@�N�������̂���I";
			next;
			mes "�]�l�R������~�X�e�B��";
			mes "�@�o�t�H�����̋N����";
			mes "�@���삵���Ƃ���c�c�]";
			next;
			emotion 23, "�l�R����#ac_Necorin";
			emotion 23, "�~�X�e�B#ac_Misty";
			emotion 23,"";
			mes "�i�u�u�B�[��";
			mes "�@�����c�c";
			mes "�@�����c�c";
			mes "�@�Ղ���";
			mes "�@�J�V�����I�j";
			mes "�@";
			mes "�]�o�t�H�����͓������~�߂Ă��܂����]";
			next;
			mes "[�~�X�e�B]";
			mes "��ꂽ�̂���!?";
			mes "�ǂ����ĂȂ̂���c�c";
			mes "�@";
			mes "���̖{�̒ʂ�ɍ쐬�����̂Ɂc�c";
			next;
			menu "�{�������Ă�������",-;
			mes "[�~�X�e�B]";
			mes "����Ȃ̂���B";
			next;
			mes "�]����Ŋo���E�t���[���̔�@�]";
			mes "�@";
			mes "�]���r��Ȃ�āA�����o�C�o�C!!";
			mes "�@�����Ȃ��q�l���A�����Ă�";
			mes "�@�S�z�䖳�p�I";
			mes "�@�܂��́A���߂��̈ꔽ�ؖȂ�!!�]";
			next;
			menu "���̖{���āc�c",-;
			emotion 1,"";
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�I";
			mes "�u�ʂ��v����Ȃ��̂��I";
			mes "�u�o�t�H�����v�̎戵�������ɂ�";
			mes "�u�߂��v�Ə����Ă���̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�ȁA�Ȃ񂶂���āI";
			next;
			emotion 57, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�@";
			mes "�悭�����炱�̖{�ɂ́A";
			mes "�u�����ɗD������܂̍����v";
			mes "�ƍŌ�ɏ����Ă������̂���c�c";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�V���b�N�Ȃ̂���c�c";
			mes "������S���g���Ă��܂����̂���B";
			mes "�@";
			mes "���͂����Ƃ��Ă����ė~�����̂���B";
			next;
			mes "[^FF0000�攪�b�I��^000000]";
			mes "�]���b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��25�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 9,1;
			close2;
			chgquest 100859,200985;
			set AC_QUEST_LV_6,8;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+8;
			end;
		}
		break;
	/////////   ���b   /////////
	case 8:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<25){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]���b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��25�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂��B";
			mes "���C�ɂ��Ă��������H";
			next;
			emotion 8, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̊ԁA�R���ƊԈႦ��";
			mes "�������܂�";
			mes "��w�ɑ�l�C�Ȃ̂���I";
			mes "��R���ꂽ�̂��႟�B";
			mes "�@";
			mes "�R���쐬���������܂����̂���I";
			next;
			menu "�����ɂ₳�����ł������",-;
			emotion 32,"";
			mes "[�l�R����]";
			mes "���x�����ԈႦ���ɍ��̂��I";
			next;
			menu "�{���ɑ��v�ł����H",-;
			mes "[�~�X�e�B]";
			mes "���v�Ȃ̂���B";
			mes "�l�R�����a�͐M�p�o����̂���I";
			next;
			mes "[�l�R����]";
			mes "���ށI";
			mes "��`���Ă��ꂽ��P�ʂ��グ��̂��B";
			mes "�@";
			mes "�ǂ��Ȃ̂��H";
			next;
			menu "�킩��܂����A��`���܂��傤",-;
			emotion 52, "�l�R����#ac_Necorin";
			emotion 14, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��`���Ă���Ă��肪�����̂����";
			mes "�@";
			mes "���x�������E�������{�a���Ȃ̂���I";
			next;
			mes "[�~�X�e�B]";
			mes "���Ă��āA";
			mes "�u�߂��v���쐬����ׂ̑f�ނ�";
			mes "�@";
			mes "���[���Ɓc�c";
			next;
			mes "�]�~�X�e�B�͑O��̎��Ɠ�����";
			mes "�@�ςݏグ��ꂽ�{�̒�����";
			mes "�@���ړ��Ă̖{��T���Ă���悤���]";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�A����Ȃ̂��I";
			mes "���̖{�ɏ����Ă���̂��B";
			next;
			mes "[�~�X�e�B]";
			mes "�����A�������Ⴛ������B";
			mes "���́u�t���[���̊�Ձv�Ƃ���";
			mes "�����ɂ��Ƃ��ȁc�c";
			next;
			mes "[�~�X�e�B]";
			mes "�T�x�[�W�x�x�̑��c�c";
			mes "�X���[�L�[�̐K���c�c";
			mes "�z�����̃n�T�~�c�c";
			mes "�t���[���̉Ԃт�I";
			mes "�@";
			mes "����炪�K�v�Ȃ悤����I";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�T�x�[�W�x�x^000000";
			mes "^FF0000�E^000000^FF0000�X���[�L�[^000000";
			mes "^FF0000�E^000000^FF0000�z����^000000";
			mes "^FF0000�E^000000^FF0000�t���[��^000000";
			mes "�Ȃ̂��I";
			next; 
			mes "[�~�X�e�B]";
			mes "�l�R�����a�͕��m�肾�̂��B";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING08_mobinfo	{
				switch(getarg(0)){
				case 100860:
					mes "[�~�X�e�B]";
					mes "�����̂���I";
					mes "�@";
					mes "�u�q��@�u�q��@�u�q��";
					mes "�@";
					mes "�������Ė{���ɉ����̂���!!";
					mes "�����͎̂q���̂��������Ȃ̂���B";
					break;
				case 100862:
					mes "[�~�X�e�B]";
					mes "���ʂ�����ȁB";
					mes "�@";
					mes "�Ƃ��Ă��p���������艮�Ȃ̂ŁA";
					mes "���܂Ɏp���B���Ă��܂��̂���!!";
					mes "�������A�B��ď����񕜂��邩��";
					mes "���ӂ���̂��Ⴜ�I";
					break;
				case 100864:
					mes "[�~�X�e�B]";
					mes "�傫�ȃN���K�^����ȁB";
					mes "�@";
					mes "�����́A����قǑ����Ȃ��̂���B";
					mes "���@�̉r���ɔ�������";
					mes "�U�����Ă���̂���I";
					break;
				case 100866:
					mes "[�~�X�e�B]";
					mes "�ԂȂ̂���c�c";
					mes "�l��H�ׂ悤�Ƃ���H�l�A���Ȃ̂���I";
					mes "�@";
					mes "�������A�A�������瓮���Ȃ��̂���B";
					mes "��������U���o����Ίy�Ȃ񂶂Ⴊ�ȁB";
					break;
				}
				return;
			}
			function	AC_PORING08_warp;
			function	AC_PORING08	{
				set '@questid,0;
				//100860,���E�������{�A,0,1167,100,0,0,0,0
				//100862,���E�������{�A,0,1056,25,0,0,0,0
				//100864,���E�������{�A,0,1128,20,0,0,0,0
				//100866,���E�������{�A,0,1118,10,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�T�x�[�W�x�x^000000","^FF0000�X���[�L�[^000000","^FF0000�z����^000000","^FF0000�t���[��^000000")){
					case 1:
						AC_PORING08_mobinfo 100860;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�T�x�[�W�x�x^000000�v����ȁH";
						mes "�@";
						mes "^FF0000100�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100860;
						break;
					case 2:
						AC_PORING08_mobinfo 100862;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X���[�L�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000025�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100862;
						break;
					case 3:
						AC_PORING08_mobinfo 100864;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�z����^000000�v����ȁH";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100864;
						break;
					case 4:
						AC_PORING08_mobinfo 100866;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�t���[��^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100866;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6,'@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�~�X�e�B]";
				mes "����Ȃ̂���I";
				switch(AC_QUEST_ST_6){
				case 100860: mes "�u^FF0000�T�x�[�W�x�x^000000�v���A"; break;
				case 100862: mes "�u^FF0000�X���[�L�[^000000�v���A"; break;
				case 100864: mes "�u^FF0000�z����^000000�v���A"; break;
				case 100866: mes "�u^FF0000�t���[��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂���I";
				mes "�@";
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING08_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING08_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 9,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100860:
					case 100862: warp "ac_prac_03.gat",29,337; break;
					case 100864: warp "ac_prac_02.gat",108,33; break;
					case 100866: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100860: warp "prt_fild09.gat",312,193; break;
					case 100862: warp "pay_fild09.gat",19,91; break;
					case 100864: warp "mjolnir_09.gat",106,34; break;
					case 100866: warp "mjolnir_11.gat",23,220; break;
					}
				}
				return;
			}
			AC_PORING08;
			end;
		case 100860:
		case 100862:
		case 100864:
		case 100866:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				emotion 2;
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u�ʂ��v�̍ޗ���";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100860: set '@select$,'@select$ + "�u^FF0000�T�x�[�W�x�x^000000�v�ɂ��ċ�����";  break;
				case 100862: set '@select$,'@select$ + "�u^FF0000�X���[�L�[^000000�v�ɂ��ċ�����";  break;
				case 100864: set '@select$,'@select$ + "�u^FF0000�z����^000000�v�ɂ��ċ�����"; break;
				case 100866: set '@select$,'@select$ + "�u^FF0000�t���[��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING08_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂���I";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING08_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING08;
					end;
				case 3:
					AC_PORING08_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "���A��Ȃ̂���B";
			next;
			menu "�f�ނ������Ă��܂���",-;
			mes "[�~�X�e�B]";
			mes "�����������ɂ悱���̂���I";
			next;
			menu "�ǂ���",-;
			emotion 33, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���񂤂�c�c���ꂶ��I";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "������������A������������B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6,100868;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight2(569,200, 11518,50)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 200;
			getitem 11518, 50;
			chgquest 100868,100869;
			if(checkre()) {
				getexp 200,0;
				getexp 200,0;
				getexp 200,0;
				getexp 0,300;
				getexp 0,300;
				getexp 0,300;
			}
			else {
				getexp 2000,0;
				getexp 2000,0;
				getexp 2000,0;
				getexp 0,3000;
				getexp 0,3000;
				getexp 0,3000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�B";
			mes "�@";
			mes "���x�����I";
			mes "���Ɂc�c�I";
			mes "�u�o�t�H�����v���N������̂���I";
			next;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�u�߂��v�����̂��I";
			mes "�@";
			mes "�]�|�����c�̓�l��";
			mes "�@���@�̔������̂Ɏg���Ă���";
			mes "�@�����ǂ����炩��������o����";
			mes "�@�ޗ����ǂ΂��Ɠ���ĉ΂������]";
			next;
			mes "�i�R�g�R�g�R�g�c�c�j";
			next;
			mes "�i�R�g�R�g�R�g�R�g�c�c�j";
			next;
			mes "�]�o���オ�����炵���R���u�߂��v��";
			mes "�@�~�X�e�B�̓��{�b�g�u�o�t�H�����v��";
			mes "�@���������I�]";
			next;
			misceffect 305, "�~�X�e�B#ac_Misty";
			mes "�]�傫�ȋ쓮���Ƌ���";
			mes "�@��������f���o����";
			mes "�@�����n�߂��o�t�H�����]";
			next;
			misceffect 17, "�~�X�e�B#ac_Misty";
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����Ŋ����Ȃ̂��I";
			mes "�o�t�H�������N������̂��I";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o�t�H�����N������I";
			next;
			misceffect 79, "�~�X�e�B#ac_Misty";
			mes "�]�s���ڂɌ����h��";
			mes "�@�B�ł����傫�ȓ���";
			mes "�@���傫���P���o�����]";
			mes "�@";
			mes "�i�o�M���[��!!";
			mes "�@";
			mes "�@�S�S�S�b�c�c�j";
			next;
			emotion 38, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������̂���I";
			mes "�N�������̂���I";
			mes "���x���������Ȃ̂���I";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�L�h�E�`���E�c�c";
			mes "�V�o���N�I�}�`�N�_�T�C�c�c";
			mes "�@";
			mes "�c�c�b�}!!!!^000000";
			next;
			mes "[�l�R����]";
			mes "�܂��́A�����^�]�Ȃ̂��I";
			mes "������������̂��I";
			next;
			emotion 27, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�䂯�I�@�o�t�H����!!";
			mes "�ˌ�����̂���[�I";
			next;
			mes "�]�������A�o�t�H������";
			mes "�@�����o���Ɠ�����";
			mes "�@�s���傫�Ȗڂ��甭����";
			mes "�@�������������_�ł��J��Ԃ�";
			mes "�@���̂܂܁A���������Ă��܂����]";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�L�h�E�e�C�V�c�c";
			mes "�L�h�E�e�C�V�c�c";
			mes "�@";
			mes "�G�l���M�[�c�c�[���c�c^000000";
			next;
			mes "�i�E�B�[���c�c";
			mes "�c�c�E�B�[��";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�v�V^808080���[";
			mes "^c0c0c0�c�c^000000�j";
			next;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����H";
			mes "�����Ȃ��Ȃ����̂���c�c";
			next;
			emotion 1, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ǂ����ĂȂ̂��H";
			mes "�����͂����Ă�͂��Ȃ̂��B";
			next;
			menu "�戵�������������Ă�������",-;
			mes "[�l�R����]";
			mes "����Ȃ̂��B";
			next;
			emotion 9, "�l�R����#ac_Necorin";
			emotion 9, "�~�X�e�B#ac_Misty";
			mes "�]�l�R�����ɓn���ꂽ";
			mes "�@�u�o�t�H�����v�̎戵�������ɂ�";
			mes "�@�m���Ɂu�߂��v�Ə����Ă���B";
			mes "�@";
			mes "�@�c�c����H";
			mes "�@���̕����������Ă���H�]";
			next;
			emotion 0,"";
			mes "[" + strcharinfo(0) + "]";
			mes "�i����́u�߂��v�ł͂Ȃ�";
			mes "�u�̂��v��!!�j";
			next;
			menu "����u�̂��v�ł���H",-;
			mes "[�l�R����]";
			mes "����Ȕn���ȂȂ̂��I";
			mes "�悭������̂��I";
			mes "�@";
			mes "�c�c!!";
			mes "�ł́A���̍����̖{�́c�c";
			next;
			mes "�]�݂Ȃ���p���[�E�t���[���̊�Ձ]";
			mes "�@";
			mes "�]�g�����A�u�ߕ��A�C�ɂ��Ȃ��B";
			mes "�@�ۂ������얞���A�C�ɂ��Ȃ��B";
			mes "�@�H�ׂđ������s�v�c�ȐH�p��";
			mes "�@�����g���āI�@�����Ă݂�!!";
			mes "�@�n�߂́A�|�C�Y���X�|�A����!!�]";
			next;
			emotion 9,"";
			menu "�̂ɗD�����H�p���������ł�",-;
			emotion 9, "�l�R����#ac_Necorin";
			emotion 9, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�܂��ԈႦ���̂���c�c";
			mes "�@";
			mes "�ł��A���V�̐ӔC����Ȃ��̂��B";
			mes "�l�R�����a�I�@�ǂ����Ă����̂���I";
			next;
			emotion 6, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���邳���̂�!!";
			mes "�c���͉������Ă������̂��I";
			next;
			emotion 57, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�͂��邢�̂���c�c";
			mes "�܂�������S���g���Ă��܂����̂���B";
			mes "�@";
			mes "���́A�����Ƃ��Ă����ė~�����̂���B";
			next;
			mes "[^FF0000���b�I��^000000]";
			mes "�]��\�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��28�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 10,1;
			close2;
			chgquest 100869,200990;
			set AC_QUEST_LV_6,9;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+8;
			end;
		}
		break;
	/////////   ��\�b   /////////
	case 9:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<28){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��28�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�~�X�e�B]";
			mes "�����H";
			mes "" + strcharinfo(0) + "";
			mes "�������ɗ�����";
			next;
			menu "�ǂ������̂ł����H",-;
			emotion 8, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���͂ȁc�c";
			mes "�@";
			mes "���N�u���̉��l���ɐH�p���u�߂��v��";
			mes "�n������Ȃ̂���I";
			mes "�@";
			mes "�u�̂��v�쐬���������܂����̂���I";
			next;
			menu "�g�̂ɗD�������ł������",-;
			emotion 21, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���x�����c�c!!";
			mes "���x�����ԈႦ���ɍ��̂��I";
			mes "�@";
			mes "������N�Ɂu�̂��v�̍쐬���@��";
			mes "�����ꂽ�{���m�F���Ăق����̂��I";
			next;
			menu "�킩��܂����A�����Ă�������",-;
			mes "[�l�R����]";
			mes "���̖{�Ȃ̂��I";
			next;
			mes "�]�p���E�R���v���V��";
			mes "�@";
			mes "�@�|�ڎ��|";
			mes "�@�P�D�p���ƍޗ������킹��";
			mes "�@�Q�D�Ȋw�������N����";
			mes "�@�R�D�q���p���{�b�g�R�������]";
			next;
			menu "���̖{�ŁA�ԈႢ�Ȃ��ł���",-;
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�悩�����̂��I";
			mes "�~�X�e�B�I";
			mes "���������ޗ����W�߂Ă���̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "��l���Ƒ�ςȂ̂���c�c";
			mes "�@";
			mes "�ނނ�!?�@�Ȃ�قǂȂ�قǁH";
			mes "��`���Ă����H";
			mes "����͂��肪�����̂����";
			next;
			menu "��`���Ƃ͌����Ă܂���",-;
			menu "�͂��c�c���傤���Ȃ��ł���",-;
			emotion 40, "�~�X�e�B#ac_Misty";
			emotion 14, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "������";
			mes "" + strcharinfo(0) + "";
			mes "�Ȃ̂��I";
			mes "�@";
			mes "����́A�����Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "���V�����C���o�Ă����̂����";
			mes "�u�̂��v���쐬����ׂ̑f�ނ�";
			mes "�@";
			mes "���[���Ɓc�c";
			next;
			mes "[�~�X�e�B]";
			mes "�z�����̉H�c�c";
			mes "���̂��������c�c";
			mes "���������̐K���c�c";
			mes "�}���h���S���̏`�I";
			mes "�@";
			mes "����炪�K�v�Ȃ悤����I";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�z����^000000";
			mes "^FF0000�E^000000^FF0000���[���[^000000";
			mes "^FF0000�E^000000^FF0000���K���h��^000000";
			mes "^FF0000�E^000000^FF0000�}���h���S��^000000";
			mes "�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�l�R�����a�͕��m�肾�̂��B";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING09_mobinfo	{
				switch(getarg(0)){
				case 100870:
					mes "[�~�X�e�B]";
					mes "�傫�ȃN���K�^����ȁB";
					mes "�@";
					mes "�����́A����قǑ����Ȃ��̂���B";
					mes "���@�̉r���ɔ�������";
					mes "�U�����Ă���̂���I";
					break;
				case 100872:
					mes "[�~�X�e�B]";
					mes "�����邳��Ȃ̂���B";
					mes "���z�́A�������錫���̂���B";
					mes "�@";
					mes "���Ԃ��U�������ƁA";
					mes "��ĂɏP���Ă���̂���B";
					mes "�Ȃ�ׂ�1�C�̏���_���Ƃ����̂���B";
					break;
				case 100874:
					mes "[�~�X�e�B]";
					mes "���̍��Ȃ̂���B";
					mes "�@";
					mes "���ɁA���������f�r���Ă���̂���B";
					mes "���z�̍U���͂Ȃ��Ȃ��ɂ����A";
					mes "���Ȃ�U����A";
					mes "�񕜖��@�Ɏア�̂���I";
					break;
				case 100876:
					mes "[�~�X�e�B]";
					mes "�A�������\�����������X�^�[����I";
					mes "�@";
					mes "���������ɁA��������l�q�����Ă��Ă�";
					mes "�c�^�ōU�����Ă��̂���c�c";
					mes "�������A���z����擾�o����s�́A";
					mes "�l�X�ȏ㋉��i�̍ޗ��ɂ��Ȃ�̂���I";
					break;
				}
				return;
			}
			function	AC_PORING09_warp;
			function	AC_PORING09	{
				set '@questid,0;
				//100870,���E�������{�B,0,1128,40,0,0,0,0
				//100872,���E�������{�B,0,1057,20,0,0,0,0
				//100874,���E�������{�B,0,1064,30,0,0,0,0
				//100876,���E�������{�B,0,1020,60,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�z����^000000","^FF0000���[���[^000000","^FF0000���K���h��^000000","^FF0000�}���h���S��^000000")){
					case 1:
						AC_PORING09_mobinfo 100870;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�z����^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100870;
						break;
					case 2:
						AC_PORING09_mobinfo 100872;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000���[���[^000000�v����ȁH";
						mes "�@";
						mes "^FF000020�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100872;
						break;
					case 3:
						AC_PORING09_mobinfo 100874;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000���K���h��^000000�v����ȁH";
						mes "�@";
						mes "^FF000030�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100874;
						break;
					case 4:
						AC_PORING09_mobinfo 100876;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�}���h���S��^000000�v����ȁH";
						mes "�@";
						mes "^FF000060�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100876;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�l�R����]";
				mes "����Ȃ̂��I";
				mes "�@";
				switch(AC_QUEST_ST_6){
				case 100870: mes "�u^FF0000�z����^000000�v���A"; break;
				case 100872: mes "�u^FF0000���[���[^000000�v���A"; break;
				case 100874: mes "�u^FF0000���K���h��^000000�v���A"; break;
				case 100876: mes "�u^FF0000�}���h���S��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂��I";
				next;
				mes "[�~�X�e�B]";
				mes "�c��̓��V���W�߂悤�I";
				mes "����Ė����Ɣ��f������A";
				mes "���ł��߂��Ă���̂���I";
				mes "�@";
				mes "��������A";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING09_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING09_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 10,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100870: warp "ac_prac_02.gat",108,33; break;
					case 100872: warp "ac_prac_03.gat",29,337; break;
					case 100874: warp "ac_spec_02.gat",124,59; break;
					case 100876: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100870: warp "mjolnir_09.gat",106,34; break;
					case 100872: warp "prt_fild03.gat",368,256; break;
					case 100874: warp "beach_dun3.gat",281,56; break;
					case 100876: warp "prt_fild02.gat",305,22; break;
					}
				}
				return;
			}
			AC_PORING09;
			end;
		case 100870:
		case 100872:
		case 100874:
		case 100876:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				emotion 2;
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u�̂��v�̍ޗ��́A";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100870: set '@select$,'@select$ + "�u^FF0000�z����^000000�v�ɂ��ċ�����";  break;
				case 100872: set '@select$,'@select$ + "�u^FF0000���[���[^000000�v�ɂ��ċ�����";  break;
				case 100874: set '@select$,'@select$ + "�u^FF0000���K���h��^000000�v�ɂ��ċ�����"; break;
				case 100876: set '@select$,'@select$ + "�u^FF0000�}���h���S��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING09_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͑N�x�����Ȃ̂���I";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING09_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING09;
					end;
				case 3:
					AC_PORING09_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12,"";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "���A��Ȃ̂���B";
			next;
			menu "�f�ނ������Ă��܂���",-;
			mes "[�~�X�e�B]";
			mes "�����������ɂ悱���̂���I";
			next;
			menu "�ǂ���",-;
			mes "[�~�X�e�B]";
			mes "���񂤂�c�c���ꂶ��I";
			next;
			menu "�Ƃ���Łc�c",-;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "������������A������������B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100878;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight2(569,300, 645,10)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 300;
			getitem 645, 10;
			chgquest 100878, 100879;
			if(checkre()) {
				getexp 400,0;
				getexp 400,0;
				getexp 400,0;
				getexp 0,500;
				getexp 0,500;
				getexp 0,500;
			}
			else {
				getexp 4000,0;
				getexp 4000,0;
				getexp 4000,0;
				getexp 0,5000;
				getexp 0,5000;
				getexp 0,5000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 29, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�t�b�t�b�t�b�B";
			mes "�@";
			mes "���x�����c�c�I";
			mes "���x�����I�@���x����!!";
			mes "�o�t�H�������N������̂���I";
			next;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�u�̂��v�����̂��I";
			mes "�@";
			mes "�]�|�����c�̓�l��";
			mes "�@���@�̔������̂Ɏg���Ă���";
			mes "�@�����ǂ����炩��������o����";
			mes "�@�ޗ����ǂ΂��Ɠ���ĉ΂������]";
			next;
			emotion 78, "�~�X�e�B#ac_Misty";
			mes "�i�R�g�R�g�R�g�c�c�j";
			next;
			mes "�i�R�g�R�g�R�g�R�g�c�c�j";
			next;
			mes "�]�o���オ�����炵���R���u�̂��v��";
			mes "�@�~�X�e�B�̓��{�b�g�u�o�t�H�����v��";
			mes "�@���������I�]";
			next;
			misceffect 305, "�~�X�e�B#ac_Misty";
			mes "�i�R�g�R�g�R�g�c�c�j";
			mes "�@";
			mes "�]������c�c�]";
			mes "�@";
			mes "�i�R�|�R�|�c�c�h�[���I�j";
			next;
			mes "�]�傫�ȋ쓮���Ƌ���";
			mes "�@��������f���o����";
			mes "�@�����n�߂��o�t�H�����]";
			next;
			misceffect 17, "�~�X�e�B#ac_Misty";
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����Ŋ����Ȃ̂��I";
			mes "�o�t�H�������N������̂��I";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o�t�H�����N������I";
			next;
			misceffect 79, "�~�X�e�B#ac_Misty";
			mes "�]�����������U�蓮����";
			mes "�@�傫�ȓ��ɗ͂��h�肾���B";
			mes "�@����ɁA�ԗւ̉�]���͂𑝂��c�c�]";
			mes "�@";
			mes "�i�o�M���[��!!";
			mes "�@";
			mes "�@�S�S�S�b�c�c�j";
			next;
			emotion 38, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������̂���I";
			mes "�N�������̂���I";
			mes "���x���������Ȃ̂���I";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�L�h�E�`���E�c�c";
			mes "�V�o���N�I�}�`�N�_�T�C�c�c";
			mes "�@";
			mes "�c�c�b�}!!!!^000000";
			next;
			mes "[�l�R����]";
			mes "�܂��́A�����^�]�Ȃ̂��I";
			mes "������������̂��I";
			next;
			emotion 27, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�䂯�I�@�o�t�H����!!";
			mes "�ˌ�����̂���[�I";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�s�s�s�c�c�K�[�K�[�K�[�c�c";
			mes "�@";
			mes "�e�L���A�Z�b�e�C�V�e�N�_�T�C�c�c^000000";
			next;
			mes "[�l�R����]";
			mes "�G�̖��O�c�c";
			mes "����Ȃ̌��܂��Ă���̂��I";
			mes "�T�Ȃ̂��I�@�T�����Ȃ��̂��I";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a���������̂���I";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�s�s�s�c�c�K�[�K�[�K�[�c�c";
			mes "�@";
			mes "�u�T�v�f�X�l�c�c";
			mes "�Z�b�e�C�V�}�V�^�c�c^000000";
			next;
			mes "[�o�t�H����]";
			mes "^0000FF�W�h�E�c�C�r�c�c�J�C�V�I";
			mes "�@";
			mes "�c�c�b�}!!!!^000000";
			next;
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���炟�[�A�ǂ��ɂ����̂���[�I";
			mes "���V�̌������𕷂��̂���`!!";
			next;
			mes "�i�E�B�[���c�c�E�B�[���c�c";
			mes "�K�^�K�^�K�^�K�^�c�c�j";
			mes "�@";
			mes "�]�傫�Ȋ����f���y�����グ�Ȃ���";
			mes "�@�o�t�H�����͉������ւ�";
			mes "�@�삯�čs���Ă��܂����]";
			next;
			menu "�������֍s���Ă��܂��܂�����",-;
			emotion 9,"";
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�S�����𓊓������̂Ɂc�c";
			mes "�ǂ����ɂ����Ă��܂����̂���c�c";
			next;
			emotion 1, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���ǉ������郍�{�b�g�������̂��B";
			mes "�@�\���܂������킩��Ȃ��̂��B";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���͂����Ƃ��Ă����ė~�����̂���B";
			next;
			mes "�]���ǁA���̃��{�͉��������̂��낤�H";
			mes "�@����ɖ��f�������Ȃ���Ηǂ���";
			mes "�@�c�c�]";
			next;
			mes "�]����ɂ��Ă��|�����c�́A";
			mes "�@�v�搫���܂����������悤���c�c";
			mes "�@";
			mes "�@�s��������΂�����ȂƂ�������邵";
			mes "�@���̑g�D�Ƃ����A";
			mes "�@�Ђǂ����������Ă���킯�ł��Ȃ��]";
			next;
			mes "�]�����A���Ȃ��͔ނ�Ƃ��邱�Ƃ�";
			mes "�@�y�����Ȃ��Ă��Ă����]";
			next;
			mes "[^FF0000��\�b�I��^000000]";
			mes "�]��\��b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��31�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 11,1;
			close2;
			chgquest 100879, 200995;
			set AC_QUEST_LV_6,10;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+8;
			end;
		}
		break;
	/////////   ��\��b   /////////
	case 10:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<31){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\��b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��31�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂��B";
			mes "���C�ɂ��Ă��������H";
			next;
			menu "����ɂ���",-;
			emotion 18, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̌�u�o�t�H�����v���������ĂȁA";
			mes "�@";
			mes "�Ȃ�Ɓu�q�f�U�[�g�E���t�v��";
			mes "�ǂ��|���񂵂Ă����̂���I";
			next;
			emotion 18, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�T���H���ɗ��Ȃ��Ȃ����̂��B";
			mes "�������ŐH�������a�Ȃ̂��I";
			next;
			emotion 1,"";
			mes "[�~�X�e�B]";
			mes "���񂤂�B";
			mes "�@";
			mes "���łȁA";
			mes "����o��ɂ������炵�������H";
			next;
			menu "���̎��͑�ςł����ˁc�c",-;
			mes "[�~�X�e�B]";
			mes "����ȗ��A�o�オ�s�@���łȁB";
			mes "�����Ǝ�����ɂ����̂���I";
			next;
			menu "���Ǝ����ł���",-;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����Ȃ񂶂Ⴊ�c�c";
			mes "�@���𒼂��Ăق����̂���B";
			next;
			mes "[�l�R����]";
			mes "���������肳��邩�A";
			mes "�|���Ė������Ȃ��̂��c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�����炻�́c�c";
			mes "�o��̂��@��������`���Ă���ʂ��H";
			next;
			menu "��̓I�ɉ�������̂ł����H",-;
			emotion 1,"";
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o��Ƀv���[���g������̂���I";
			mes "�@";
			mes "������������H�ׂ�΁A";
			mes "�o����@�����悭�Ȃ�̂���I";
			next;
			menu "�H�ו��H",-;
			mes "[�~�X�e�B]";
			mes "�����Ȃ̂���I";
			mes "�@";
			mes "���V�͔�����������H�ׂ��";
			mes "�@���������̂���I";
			mes "�@";
			mes "������u���ɂ̗����v�����̂���I";
			next;
			mes "[�~�X�e�B]";
			mes "�����ł���!!";
			mes "�H�ޏW�߂���`���Ăق����̂���I";
			mes "�@";
			mes "�������A�������̂���B";
			next;
			menu "�����W�߂�΁H",-;
			mes "[�~�X�e�B]";
			mes "�X���[�L�[�̓��c�c";
			mes "���̎�̂Ђ�c�c";
			mes "�L���������̔�c�c";
			mes "�C���̍�!!";
			mes "����炪�K�v�Ȃ̂���I";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�H�ނɊ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�X���[�L�[^000000";
			mes "^FF0000�E^000000^FF0000���[���[^000000";
			mes "^FF0000�E^000000^FF0000�L��������^000000";
			mes "^FF0000�E^000000^FF0000�p�C���[�c�X�P��^000000";
			mes "�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "����Łu���ɂ̗����v������̂���I";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING10_mobinfo	{
				switch(getarg(0)){
				case 100880:
					mes "[�~�X�e�B]";
					mes "���ʂ�����ȁB";
					mes "�@";
					mes "�Ƃ��Ă��p���������艮�Ȃ̂ŁA";
					mes "���܂Ɏp���B���Ă��܂��̂���!!";
					mes "�������A�B��ď����񕜂��邩��";
					mes "���ӂ���̂��Ⴜ�I";
					break;
				case 100882:
					mes "[�~�X�e�B]";
					mes "�����邳��Ȃ̂���B";
					mes "���z�́A�������錫���̂���B";
					mes "�@";
					mes "���Ԃ��U�������ƁA";
					mes "��ĂɏP���Ă���̂���B";
					mes "�Ȃ�ׂ�1�C�̏���_���Ƃ����̂���B";
					break;
				case 100884:
					mes "[�~�X�e�B]";
					mes "�n���l�Y�~����ȁB";
					mes "�@";
					mes "�H�ו�����Ȃ��̂Œ��ӂ���̂���I";
					mes "�܂��A�N���H�ׂȂ��Ǝv�����̂��B";
					mes "�@";
					mes "�����ڂ͏��������^�t�ȓz���Ⴜ�B";
					break;
				case 100886:
					mes "[�~�X�e�B]";
					mes "�C�Ŏ��񂾊C�����A";
					mes "���ɂȂ��Ă�݂��������̂���I";
					mes "�@";
					mes "���Ŏ��ʊC�������Ȃ����̂��c�c";
					mes "���X�C�����Ⴉ��A�ƂĂ��D��I����B";
					mes "���Ȃ�U���Ɖ񕜖��@�Ɏア�̂���B";
					break;
				}
				return;
			}
			function	AC_PORING10_warp;
			function	AC_PORING10	{
				set '@questid,0;
				//100880,�~�X�e�B�̗J�T�@,0,1056,80,0,0,0,0
				//100882,�~�X�e�B�̗J�T�@,0,1057,40,0,0,0,0
				//100884,�~�X�e�B�̗J�T�@,0,1103,30,0,0,0,0
				//100886,�~�X�e�B�̗J�T�@,0,1071,40,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�X���[�L�[^000000","^FF0000���[���[^000000","^FF0000�L��������^000000","^FF0000�p�C���[�c�X�P��^000000")){
					case 1:
						AC_PORING10_mobinfo 100880;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X���[�L�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000080�C^000000���قǓ|���Ă���΁A";
						mes "�H�ނ͏W�܂肻������ȁ�";
						set '@questid, 100880;
						break;
					case 2:
						AC_PORING10_mobinfo 100882;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000���[���[^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�H�ނ͏W�܂肻������ȁ�";
						set '@questid, 100882;
						break;
					case 3:
						AC_PORING10_mobinfo 100884;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�L��������^000000�v����ȁH";
						mes "�@";
						mes "^FF000030�C^000000���قǓ|���Ă���΁A";
						mes "�H�ނ͏W�܂肻������ȁ�";
						set '@questid, 100884;
						break;
					case 4:
						AC_PORING10_mobinfo 100886;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�p�C���[�c�X�P��^000000�v����ȁH";
						mes "�@";
						mes "^FF000040�C^000000���قǓ|���Ă���΁A";
						mes "�H�ނ͏W�܂肻������ȁ�";
						set '@questid, 100886;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�~�X�e�B]";
				mes "����Ȃ̂���I";
				switch(AC_QUEST_ST_6){
				case 100880: mes "�u^FF0000�X���[�L�[^000000�v���A"; break;
				case 100882: mes "�u^FF0000���[���[^000000�v���A"; break;
				case 100884: mes "�u^FF0000�L��������^000000�v���A"; break;
				case 100886: mes "�u^FF0000�p�C���[�c�X�P��^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂���I";
				mes "�@";
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING10_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING10_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 11,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100880:
					case 100882:
					case 100884: warp "ac_prac_03.gat",29,337; break;
					case 100886: warp "ac_spec_02.gat",124,59; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100880: warp "pay_fild09.gat",19,91; break;
					case 100882: warp "prt_fild03.gat",368,256; break;
					case 100884: warp "lhz_fild01.gat",296,376; break;
					case 100886: warp "treasure01.gat",69,24; break;
					}
				}
				return;
			}
			AC_PORING10;
			end;
		case 100880:
		case 100882:
		case 100884:
		case 100886:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u���ɂ̗����v�̐H�ނ́A";
				mes "�����ɏW�܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100880: set '@select$,'@select$ + "�u^FF0000�X���[�L�[^000000�v�ɂ��ċ�����";  break;
				case 100882: set '@select$,'@select$ + "�u^FF0000���[���[^000000�v�ɂ��ċ�����";  break;
				case 100884: set '@select$,'@select$ + "�u^FF0000�L��������^000000�v�ɂ��ċ�����"; break;
				case 100886: set '@select$,'@select$ + "�u^FF0000�p�C���[�c�X�P��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING10_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�H�ނ͑N�x�����Ȃ̂���B";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING10_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING10;
					end;
				case 3:
					AC_PORING10_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12,"";
			mes "[�l�R����]";
			mes "�A���Ă����̂��I";
			mes "���A��Ȃ̂��B";
			next;
			menu "�H�ނ��W�߂Ă��܂���",-;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ꂶ�Ⴑ����I�@������̂���!!";
			mes "����Łu���ɂ̗����v������̂���I";
			mes "�@";
			mes "�����������̂���!!";
			next;
			mes "�]�~�X�e�B�́A�f�����ޗ�����Ɏ��";
			mes "�@���ꂼ��ɍœK�ȉ����������Ă����B";
			mes "�@";
			mes "�@�܂��͍ŏ��ɁA";
			mes "�@�X���[�L�[�̓��ɉ����������]";
			next;
			mes "�]���̎�̂Ђ�́A";
			mes "�@���ʂ������Ȃ����ʂ�";
			mes "�@���ɒ����ƂȂ��Ă���B";
			mes "�@�������A��x�菇���ԈႦ��";
			mes "�@���̕��ʂ́A�f�ނƂ��Ă̋P����";
			mes "�@�u���ԂɎ����Ă��܂��̂��B";
			mes "�@�������������Ɠ��߂�����]";
			next;
			mes "�]�L���������̔�́A";
			mes "�@�������H�ނł͂�����̂�";
			mes "�@�y���΂��t��ƍ��΂��������";
			mes "�@�T���_�̗l�ȐH�������A";
			mes "�@�s�v�c�ȐH�ނɂȂ�]";
			next;
			misceffect 50, "�~�X�e�B#ac_Misty";
			mes "�]�K�x�ɔM���ꂽ���";
			mes "�@����̖��̌��ߎ�Ƃ�����";
			mes "�@���̎�̂Ђ�ō�����o���B";
			mes "�@�\���ȍ���������o��������";
			mes "�@���C���̃X���[�L�[�̓��Ɨ���";
			mes "�@��C�ɋ��΂ɂ���!!�]";
			next;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���͗F�B�I�@���͗F�B�I";
			next;
			mes "�]�d�グ�ɁA���΂̒���";
			mes "�@�\�ߓ�������Ă���������";
			mes "�@���̒�������o��";
			mes "�@������A�^�k�L�̗t�Ŕ킹��B";
			mes "�@�����𑽂��܂ރ^�k�L�̗t��";
			mes "�@�M���ꂽ�C���̍����}���ɗ�₵�A";
			mes "�@��ʂ̐����C�𔭐�������]";
			next;
			mes "�m�~�X�e�B�n";
			mes "�悵���I";
			mes "���̏��C�̒��ɁA����������΁c�c";
			next;
			misceffect 44, "�~�X�e�B#ac_Misty";
			mes "�]���΂����Ă���������������";
			mes "�@�u�₩�ȍ���̏��C�������߂��";
			mes "�@������킳�������A";
			mes "�@�H�~��������Î_���ς����肪";
			mes "�@�ӂ�ɗ������߂��]";
			next;
			mes "�m�~�X�e�B�n";
			mes "�Ō�ɁA�L���������̃T���_���c�c";
			mes "�[�����ɓY���Ă��Ɓc�c";
			next;
			mes "[�~�X�e�B]";
			mes "���Ɂu���ɂ̗����v���o�����̂���I";
			mes "�u�C�����E�����̌b�݃L���������Y���v";
			mes "�����Ȃ̂���I";
			mes "�@";
			mes "�l�R�����a�A";
			mes "���������Ăق����̂���!!";
			next;
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�킩�����̂��B";
			next;
			mes "�m�l�R�����n";
			mes "�c�c!!";
			mes "���܂��̂��I";
			mes "���ꂼ���ɂ̖��Ȃ̂��I";
			mes "�@";
			mes "�]�l�R�����͓݊�Œ@���ꂽ���̂悤��";
			mes "�@�Ռ��ɑł��k���Ă���I�]";
			next;
			menu "���ɂ������������ĉ�����",-;
			mes "[�l�R����]";
			mes "�ǂ����Ȃ̂��B";
			mes "�@";
			mes "�]" + strcharinfo(0) + "��";
			mes "�@���������ɂ����]";
			next;
			menu "��������!!",-;
			emotion 0,"";
			mes "[�~�X�e�B]";
			mes "����Ŏo��̋@�����悭�Ȃ�̂��I";
			mes "�@";
			mes "�c�c�����I�@�o��!!";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c";
			mes "�����������c�c";
			mes "�t�������Ȃ����I";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����A������Ƒ҂��Ăق����̂���I";
			mes "�@";
			mes "�o��ׂ̈ɂ����������̂���c�c";
			mes "�H�ׂĂق����̂���I";
			next;
			cutin "job_black_hucke01.bmp", 2;
			mes "[�q���b�P]";
			mes "�ǂ������c�c";
			mes "�c�c!!";
			mes "���́c�c�������c�c";
			mes "�@";
			mes "������!!!!";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�悩�����̂���B";
			mes "����Ŏo����@�����悭�Ȃ�̂����";
			next;
			cutin "job_black_hucke03.bmp", 2;
			mes "[�q���b�P]";
			mes "�����c�c������肢�c�c";
			mes "�c�c��Ȃ̂Ɂc�c";
			mes "�~�X�e�B�c�c���́A�{�����I";
			next;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ȁA�ȁA�Ȃ�łȂ̂���I";
			mes "�o��ׂ̈ɍ�����̂Ɂ`�B";
			mes "�@";
			mes "�����Ă���Ȃ̂���`�`�c�c";
			next;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c�҂̂ł��I";
			next;
			cutin "job_black_hucke03.bmp", 255;
			menu "�c�c�c�c",-;
			emotion 54, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�c�c�c�c";
			mes "�����S�́A�킩��Ȃ��̂��c�c";
			next;
			menu "���́c�c��V�́c�c�H",-;
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�N�̒P�ʂ𑝂₵�Ă������̂��B";
			mes "���łɁA������v���[���g�Ȃ̂��I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6,100888;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight2(569,300, 602,10)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 300;
			getitem 602, 10;
			chgquest 100888, 100889;
			if(checkre()) {
				getexp 800,0;
				getexp 800,0;
				getexp 0,1400;
				getexp 0,1400;
			}
			else {
				getexp 8000,0;
				getexp 8000,0;
				getexp 0,14000;
				getexp 0,14000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 12, "�l�R����#ac_Necorin";
			emotion 12,"";
			mes "[�l�R����]";
			mes "�܂�������������X�������ނ̂��B";
			mes "�@";
			mes "����ł͂܂�����Ȃ̂��B";
			next;
			mes "[^FF0000��\��b�I��^000000]";
			mes "�]��\��b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��34�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 12,1;
			close2;
			chgquest 100889, 201000;
			set AC_QUEST_LV_6,11;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+9;
			end;
		}
		break;
	/////////   ��\��b   /////////
	case 11:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<34){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\��b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��34�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂��B";
			mes "���C�ɂ��Ă��������H";
			next;
			menu "����ɂ���",-;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̌�A";
			mes "�܂����Ă��o��ɕ߂܂��Ă̂��c�c";
			mes "�@";
			mes "�����̎O�{ �����ڂɂ������̂���B";
			mes "���x�΂���͎��ʂ��Ɓc�c";
			next;
			menu "�c�c��ςł���",-;
			mes "[�l�R����]";
			mes "�~�X�e�B�͎O���Ԃ��Q����ł����̂��B";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "���x�����o��̋@�����Ƃ�̂���I";
			next;
			menu "���x�͂ǂ�����āH",-;
			mes "[�~�X�e�B]";
			mes "����A�o�ォ�瓦����������A";
			mes "�u�o��̕��v���A";
			mes "�{���{���ɂȂ����̂���c�c";
			next;
			emotion 3, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������A�V�����u�o��̕��v��";
			mes "�v���[���g����̂���I";
			mes "�@";
			mes "���x�����A";
			mes "�@�����ǂ��Ȃ鎖�A�ԈႢ�Ȃ��̂���I";
			next;
			emotion 4, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���悢�掄�̐g����Ȃ��̂��c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�����炻�́c�c�����";
			mes "�o��̂��@��������`���Ă���ʂ��H";
			mes "�@";
			mes "�������A�������̂���I";
			next;
			menu "����͉����W�߂�̂ł����H",-;
			mes "[�~�X�e�B]";
			mes "�T�x�[�W�̉�c�c";
			mes "�T���h�}���̍��c�c";
			mes "�C���ɐZ�������z�c�c";
			mes "�W�I�O���t�@�[�̍i��`!!";
			mes "����炪�K�v�Ȃ̂���I";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�f�ނɊ֌W���郂���X�^�[�́c";
			mes "^FF0000�E^000000^FF0000�T�x�[�W^000000";
			mes "^FF0000�E^000000^FF0000�T���h�}��^000000";
			mes "^FF0000�E^000000^FF0000�p�C���[�c�X�P��^000000";
			mes "^FF0000�E^000000^FF0000�W�I�O���t�@�[^000000";
			mes "�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "����Łu�o��̕��v������̂���I";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�@�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING11_mobinfo	{
				switch(getarg(0)){
				case 100890:
					mes "[�~�X�e�B]";
					mes "�@���̍r���A�C�m�V�V�Ȃ̂���c�c";
					mes "���i�͑�l�������A";
					mes "���܂ɓːi���Ă���̂Œ��ӂ���B";
					mes "�@";
					mes "�����ڒʂ�^�t�ŁA";
					mes "�U���͂������̂Œ��ӂ���B";
					break;
				case 100892:
					mes "[�~�X�e�B]";
					mes "���̂������݂����ȃ����X�^�[����B";
					mes "�n��ɏo�Ă鎞�����邪�A";
					mes "�n���ɉB�ꂽ������邼";
					mes "�@";
					mes "�n�ʂ̉������P���Ă���̂�";
					mes "���ӂ���̂���B";
					break;
				case 100894:
					mes "[�~�X�e�B]";
					mes "�C�Ŏ��񂾊C�����A";
					mes "���ɂȂ��Ă�݂��������̂���I";
					mes "�@";
					mes "���Ŏ��ʊC�������Ȃ����̂��c�c";
					mes "���X�C�����Ⴉ��A�ƂĂ��D��I����B";
					mes "���Ȃ�U���Ɖ񕜖��@�Ɏア�̂���B";
					break;
				case 100896:
					mes "[�~�X�e�B]";
					mes "�����ȉԂ̃����X�^�[����B";
					mes "�ړ��͏o���ʂ��A�ƂĂ��d���̂���B";
					mes "�@";
					mes "�������Ȃ�U�����Ă��ʂ��A";
					mes "���ԓ��m�ŉ񕜂��������B";
					break;
				}
				return;
			}
			function	AC_PORING11_warp;
			function	AC_PORING11	{
				set '@questid,0;
				//100890,�~�X�e�B�̗J�T�A,0,1166,25,0,0,0,0
				//100892,�~�X�e�B�̗J�T�A,0,1165,10,0,0,0,0
				//100894,�~�X�e�B�̗J�T�A,0,1071,61,0,0,0,0
				//100896,�~�X�e�B�̗J�T�A,0,1368,5,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�T�x�[�W^000000","^FF0000�T���h�}��^000000","^FF0000�p�C���[�c�X�P��^000000","^FF0000�W�I�O���t�@�[^000000")){
					case 1:
						AC_PORING11_mobinfo 100890;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�T�x�[�W^000000�v����ȁH";
						mes "�@";
						mes "^FF000025�C^000000���قǓ|���Ă���΁A";
						mes "�f�ނ͏W�܂肻������ȁ�";
						set '@questid, 100890;
						break;
					case 2:
						AC_PORING11_mobinfo 100892;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�T���h�}��^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�f�ނ͏W�܂肻������ȁ�";
						set '@questid, 100892;
						break;
					case 3:
						AC_PORING11_mobinfo 100894;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�p�C���[�c�X�P��^000000�v����ȁH";
						mes "�@";
						mes "^FF000060�C^000000���قǓ|���Ă���΁A";
						mes "�f�ނ͏W�܂肻������ȁ�";
						set '@questid, 100894;
						break;
					case 4:
						AC_PORING11_mobinfo 100896;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�W�I�O���t�@�[^000000�v����ȁH";
						mes "�@";
						mes "^FF00005�C^000000���قǓ|���Ă���΁A";
						mes "�f�ނ͏W�܂肻������ȁ�";
						set '@questid, 100896;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�~�X�e�B]";
				mes "����Ȃ̂���I";
				switch(AC_QUEST_ST_6){
				case 100890: mes "�u^FF0000�T�x�[�W^000000�v���A"; break;
				case 100892: mes "�u^FF0000�T���h�}��^000000�v���A"; break;
				case 100894: mes "�u^FF0000�p�C���[�c�X�P��^000000�v���A"; break;
				case 100896: mes "�u^FF0000�W�I�O���t�@�[^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂���I";
				mes "�@";
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING11_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING11_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 12,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100890: warp "ac_prac_03.gat",29,337; break;
					case 100892: warp "ac_spec_03.gat",98,78; break;
					case 100894: warp "ac_spec_02.gat",124,59; break;
					case 100896: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100890: warp "prt_fild10.gat",82,104; break;
					case 100892: warp "moc_fild16.gat",124,377; break;
					case 100894: warp "treasure01.gat",69,24; break;
					case 100896: warp "ein_fild04.gat",184,31; break;
					}
				}
				return;
			}
			AC_PORING11;
			end;
		case 100890:
		case 100892:
		case 100894:
		case 100896:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u�o��̕��v�̑f�ނ́A";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100890: set '@select$,'@select$ + "�u^FF0000�T�x�[�W^000000�v�ɂ��ċ�����";  break;
				case 100892: set '@select$,'@select$ + "�u^FF0000�T���h�}��^000000�v�ɂ��ċ�����";  break;
				case 100894: set '@select$,'@select$ + "�u^FF0000�p�C���[�c�X�P��^000000�v�ɂ��ċ�����"; break;
				case 100896: set '@select$,'@select$ + "�u^FF0000�W�I�O���t�@�[^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING11_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�f�ނ��V�N����Ȃ���";
					mes "�L���C�ɐ��F�ł��Ȃ��̂���B";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING11_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING11;
					end;
				case 3:
					AC_PORING11_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			mes "[�l�R����]";
			mes "�A���Ă����̂��I";
			mes "���A��Ȃ̂��B";
			next;
			menu "�f�ނ��W�߂Ă��܂���",-;
			emotion 12,"";
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���ꂶ�Ⴑ����I�@������̂���!!";
			mes "����Łu�o��̕��v������̂���I";
			mes "�@";
			mes "�����������̂���!!";
			next;
			mes "�m�l�R�����n";
			mes "�����̘r�ɂ͂т����肵���̂��B";
			mes "�ł��A�ٖD�͑��v�Ȃ̂��H";
			next;
			mes "�m�~�X�e�B�n";
			mes "�t�b�t�b�t�b�c�c";
			mes "�@";
			mes "�́A�悭�o��ɍ�炳�ꂽ�̂���I";
			mes "������A�ٖD�͓��ӂȂ̂���I";
			next;
			mes "�]�~�X�e�B�̓l�R�����ɁA";
			mes "�@���M�ɖ�����ꂽ";
			mes "�@�\��Řb�������Ȃ���A";
			mes "�@�����̂Ƃ����l�A�葁���W�߂Ă���";
			mes "�@�f�ނ̏������n�߂��]";
			next;
			mes "�m�~�X�e�B�n";
			mes "���̃p�C���[�c�X�P���̐��n��";
			mes "�����ɒ����q�C�őς����悤�A";
			mes "��v�ɍ���Ă����Ă���ȁc�c";
			next;
			misceffect 21, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "�T���h�}���̍��𔼕����p����";
			mes "�܂��́A���n�̉����􂤂̂���B";
			mes "�@";
			mes "�i���������A���������c�c�j";
			mes "�@";
			mes "�����āA���ɃW�I�O���t�@�[�̍i��`�I";
			next;
			mes "�m�~�X�e�B�n";
			mes "�W�I�O���t�@�[�̍i��`�́A";
			mes "���n�ɓ���ȃR�[�e�B���O��";
			mes "�{���Ă����̂Ɠ����ɐ��F��";
			mes "�s���Ă����̂���!!";
			mes "�@";
			mes "�i����ԁA����ԁc�c�j";
			next;
			misceffect 39, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "�悵���I";
			mes "�����F��������!!";
			mes "����R�[�e�B���O�ɂ́A";
			mes "���̎���𑁂�������ʂ�����̂���B";
			mes "�@";
			mes "�����A�Y��Ă������̂���c�c";
			next;
			mes "�m�~�X�e�B�n";
			mes "�T�x�[�W�̉���c�c";
			mes "�c�c����ȁc�c";
			mes "�d�c�c���c�c";
			mes "�c�c�c�c�̂��႟!!";
			mes "�@";
			mes "�؂ꂽ�̂���I";
			next;
			mes "�m�~�X�e�B�n";
			mes "���̗֐؂�ɂ������";
			mes "�o��̍�����ɂ��Ă���";
			mes "�A�N�Z�T���[�Ȃ̂���I";
			mes "�����ĐH�ו��ł͂Ȃ��̂���!!";
			next;
			misceffect 43, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "���́A�D�����킹�̍�Ƃ���I";
			mes "�@";
			mes "�]�������Ԃ�";
			mes "�@�ǂ�����Ƃ��Ȃ����o����";
			mes "�@�ٖD������������܂����]";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			emotion 55, "�l�R����#ac_Necorin";
			mes "�]�~�X�e�B�̗��r��";
			mes "�@�Ђ�΂΂΂΂���";
			mes "�@�����x��]";
			next;
			mes "�m�l�R�����n";
			mes "�Ȃ񂩁A�����̂��c�c";
			mes "�@";
			mes "�����I";
			mes "�������I";
			mes "�����o���オ���Ă����̂��I";
			next;
			mes "�m�~�X�e�B�n";
			mes "�d�グ�ŁA�c��̍����g����";
			mes "�_���[�W���H���{���āc�c";
			mes "�@";
			mes "�o�����̂���!!";
			next;
			mes "[�~�X�e�B]";
			mes "���Ɂc�c";
			mes "�u�o��̕��v�����������̂���!!";
			mes "�@";
			mes "�u���u���[�A�T�V���X�[�c�v";
			mes "�����Ȃ̂���I";
			next;
			mes "[�l�R����]";
			mes "�~�X�e�B�I";
			mes "�������Ă݂�̂�!!";
			next;
			mes "[�~�X�e�B]";
			mes "�킩�����̂���I";
			mes "�@";
			mes "�悢������Ɓc�c";
			mes "�@";
			mes "�T�C�Y�́A�΂�����Ȃ̂���I";
			next;
			menu "���̎q�݂����c�c",-;
			emotion 55,"";
			emotion 0, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���������Ă��邩�A";
			mes "���V�͒j�c�c�����I�@�o��!!";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c�~�X�e�B�B";
			mes "���c�c���́c�c�����c�c";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o��ׂ̈ɍ�������Ȃ̂���!!";
			mes "�@";
			mes "���񒅂Ăق����̂���c�c";
			mes "�����Ǝ������̂���!!!!";
			next;
			cutin "job_black_hucke03.bmp", 2;
			emotion 20,"";
			mes "[�q���b�P]";
			mes "���́c�c�V�������c�c";
			mes "�c�c�c�c!!";
			mes "�����c�c�������H";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���������̂���I";
			mes "���������V�����ꂽ�̂���I";
			mes "�@";
			mes "�o��Ƃ͑o�q������A";
			mes "����Ȃ��͂������̂��Ⴊ�Ȃ��c�c";
			next;
			cutin "job_black_hucke01.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c";
			mes "�c�c�c�E���I";
			next;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ȁA�ȁA�Ȃ�łȂ̂���I";
			mes "���V�͉������������ĂȂ��̂���I";
			mes "�@";
			mes "�����Ă���Ȃ̂���`�`�c�c";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c�҂̂ł��I";
			next;
			cutin "job_black_hucke02.bmp", 255;
			menu "�c�c�c�c",-;
			mes "[�l�R����]";
			mes "�c�c�c�c";
			mes "���œ{�����̂��H";
			next;
			menu "���́c�c��V�́H",-;
			emotion 20,"";
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�N�̒P�ʂ𑝂₵�Ă������̂��B";
			mes "���łɁA������v���[���g�Ȃ̂��I";
			next;
			menu "���肪�Ƃ��������܂�",-; 
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100898;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight(569,300)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 300;
			chgquest 100898, 100899;
			if(checkre()) {
				getexp 1200,0;
				getexp 1200,0;
				getexp 0,1900;
				getexp 0,1900;
			}
			else {
				getexp 12000,0;
				getexp 12000,0;
				getexp 0,19000;
				getexp 0,19000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 12, "�l�R����#ac_Necorin";
			emotion 12,"";
			mes "[�l�R����]";
			mes "�܂�������������X�������ނ̂��B";
			mes "�@";
			mes "����ł͂܂�����Ȃ̂��B";
			next;
			mes "[^FF0000��\��b�I��^000000]";
			mes "�]��\�O�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��37�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 13,1;
			close2;
			chgquest 100899, 201005;
			set AC_QUEST_LV_6,12;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+9;
			end;
		}
		break;
	/////////   ��\�O�b   /////////
	case 12:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<37){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\�O�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��37�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 6, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����䖝�ł��Ȃ��̂���I";
			mes "�����ɂł�̂���!!";
			next;
			menu "�ˑR�ǂ������̂ł����H",-;
			emotion 4,"";
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̂܂܂ł͐g�������Ȃ��̂���B";
			mes "�o�ォ��g����镐������̂���I";
			next;
			emotion 54, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ŏ����炻������΂悩�����̂��B";
			next;
			menu "�c�c�����Șb�ł���",-;
			emotion 4,"";
			mes "[�~�X�e�B]";
			mes "���v�Ȃ̂���B";
			mes "�@";
			mes "������ƋC�����悭";
			mes "�Q�Ă��炤�����Ȃ̂���!!";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "�u�����e�v������̂��I";
			next;
			menu "�c�c�����K�v�Ȃ̂ł����H",-;
			mes "[�~�X�e�B]";
			mes "�b���͂₢�̂���I";
			mes "�������A�������̂���!!";
			mes "�@";
			mes "�u�����e�v�ɕK�v�ȍޗ��́c�c";
			next;
			mes "[�~�X�e�B]";
			mes "�}�[�e�B���̉�c�c";
			mes "�����f���̏e�c�c";
			mes "�c���n�V�c�c";
			mes "�W�I�O���t�@�[�̌s!!";
			mes "����炪�K�v�Ȃ̂���I";
			next;
			emotion 5, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ޗ��Ɋ֌W���郂���X�^�[�́c�c";
			mes "^FF0000�E^000000^FF0000�}�[�e�B��^000000";
			mes "^FF0000�E^000000^FF0000�����f��^000000";
			mes "^FF0000�E^000000^FF0000�X�P�����[�J�[^000000";
			mes "^FF0000�E^000000^FF0000�W�I�O���t�@�[^000000";
			mes "�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "����Łu�����e�v������̂���I";
			mes "�@";
			mes "�Ƃ�����ŁA�N�ɂ͂ǂꂩ���";
			mes "���܂�ė~�����̂��Ⴊ�c�c";
			mes "�@";
			mes "�����I�ǂ�ɂ��邩�I�Ԃ̂���I";
			function	AC_PORING12_mobinfo	{
				switch(getarg(0)){
				case 100900:
					mes "[�~�X�e�B]";
					mes "���O������ȁB";
					mes "�@";
					mes "���𕉂��ƒn�ʂɐ�����";
					mes "�񕜂������̂Œ��ӂ���B";
					mes "���܂ɖڒׂ������Ă���̂�";
					mes "�C��t����̂���B";
					break;
				case 100902:
					mes "[�~�X�e�B]";
					mes "�e�����������O������ȁB";
					mes "�n�ʂɂ������Ă鎖�������̂���B";
					mes "�@";
					mes "���z����͍U�����Ă��Ȃ����A";
					mes "���Ԃ��U��������";
					mes "�߂��̒��Ԃ���ĂɏP���Ă���̂���B";
					break;
				case 100904:
					mes "[�~�X�e�B]";
					mes "���񂾒Y�z�v���A";
					mes "���ɂȂ��Ă�݂��������̂���B";
					mes "�@";
					mes "�����Ă�c���n�V�ł̍U���́A";
					mes "�ƂĂ������̂Œ��ӂ���B";
					mes "���Ȃ�U����A�񕜖��@�Ɏア�̂���B";
					break;
				case 100906:
					mes "[�~�X�e�B]";
					mes "�����ȉԂ̃����X�^�[����B";
					mes "�ړ��͏o���ʂ��A�ƂĂ��d���̂���B";
					mes "�@";
					mes "�������Ȃ�U�����Ă��ʂ��A";
					mes "���ԓ��m�ŉ񕜂��������B";
					break;
				}
				return;
			}
			function	AC_PORING12_warp;
			function	AC_PORING12	{
				set '@questid,0;
				//100900,�~�X�e�B�̗J�T�B,0,1145,50,0,0,0,0
				//100902,�~�X�e�B�̗J�T�B,0,1628,30,0,0,0,0
				//100904,�~�X�e�B�̗J�T�B,0,1169,25,0,0,0,0
				//100906,�~�X�e�B�̗J�T�B,0,1368,10,0,0,0,0
				while(1){
					next;
					switch(select("^FF0000�}�[�e�B��^000000","^FF0000�����f��^000000","^FF0000�X�P�����[�J�[^000000","^FF0000�W�I�O���t�@�[^000000")){
					case 1:
						AC_PORING12_mobinfo 100900;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�}�[�e�B��^000000�v����ȁH";
						mes "�@";
						mes "^FF000050�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100900;
						break;
					case 2:
						AC_PORING12_mobinfo 100902;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�����f��^000000�v����ȁH";
						mes "�@";
						mes "^FF000030�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100902;
						break;
					case 3:
						AC_PORING12_mobinfo 100904;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�X�P�����[�J�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000025�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100904;
						break;
					case 4:
						AC_PORING12_mobinfo 100906;
						next;
						mes "[�~�X�e�B]";
						mes "�u^FF0000�W�I�O���t�@�[^000000�v����ȁH";
						mes "�@";
						mes "^FF000010�C^000000���قǓ|���Ă���΁A";
						mes "�ޗ��͏W�܂肻������ȁ�";
						set '@questid, 100906;
						break;
					}
					mes "�@";
					mes "���z�ł悢�̂��H";
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				mes "[�~�X�e�B]";
				mes "����Ȃ̂���I";
				switch(AC_QUEST_ST_6){
				case 100900: mes "�u^FF0000�}�[�e�B��^000000�v���A"; break;
				case 100902: mes "�u^FF0000�����f��^000000�v���A"; break;
				case 100904: mes "�u^FF0000�X�P�����[�J�[^000000�v���A"; break;
				case 100906: mes "�u^FF0000�W�I�O���t�@�[^000000�v���A"; break;
				}
				mes "��R��������ꏊ��m���Ă���̂���I";
				mes "�@";
				mes "�悩������";
				mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING12_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING12_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 13,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100900:
					case 100902:
					case 100904: warp "ac_prac_04.gat",261,261; break;
					case 100906: warp "ac_spec_01.gat",283,34; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100900: warp "mjo_dun02.gat",125,60; break;
					case 100902: warp "hu_fild06.gat",34,119; break;
					case 100904: warp "mjo_dun02.gat",125,60; break;
					case 100906: warp "ein_fild04.gat",184,31; break;
					}
				}
				return;
			}
			AC_PORING12;
			end;
		case 100900:
		case 100902:
		case 100904:
		case 100906:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�u�����e�v�̍ޗ���";
				mes "�����ɂ��܂��Ă��邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100900: set '@select$,'@select$ + "�u^FF0000�}�[�e�B��^000000�v�ɂ��ċ�����";  break;
				case 100902: set '@select$,'@select$ + "�u^FF0000�����f��^000000�v�ɂ��ċ�����";  break;
				case 100904: set '@select$,'@select$ + "�u^FF0000�X�P�����[�J�[^000000�v�ɂ��ċ�����"; break;
				case 100906: set '@select$,'@select$ + "�u^FF0000�W�I�O���t�@�[^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING12_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�~�X�e�B]";
					mes "���Ȃ݂ɁA�ޗ��͎��Ԃ��o��";
					mes "�򉻂��Ă��܂��̂���c�c";
					mes "�@";
					mes "�Ⴄ�����X�^�[�ɂ���ƁA";
					mes "���܂ŏW�߂Ă�����������A";
					mes "���ʂɂȂ��Ă��܂��̂��Ⴊ�ǂ����H";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING12_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING12;
					end;
				case 3:
					AC_PORING12_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			mes "[�l�R����]";
			mes "�A���Ă����̂��I";
			mes "���A��Ȃ̂��B";
			next;
			menu "�ޗ����W�߂Ă��܂���",-;
			emotion 12,"";
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�~�X�e�B]";
			mes "���ꂶ�Ⴑ����I�@������̂���!!";
			mes "����Łu�����e�v������̂���I";
			mes "�@";
			mes "�����������̂���!!";
			next;
			mes "�m�l�R�����n";
			mes "�����E�ٖD�E�H��c�c";
			mes "�@";
			mes "�~�X�e�B�̈ӊO�ȍ˔\��";
			mes "�������ꑱ���Ă���̂��B";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "����́A���Ƃ���";
			mes "�����f���������Ă���";
			mes "�e�����H����̂���B";
			mes "���قǓ���͂Ȃ��̂���I";
			next;
			misceffect 2, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "�܂��́A�c���n�V������ȁc�c";
			mes "�@";
			mes "�c�c�ӂʂ��c�c�ӂʂʂ�!!";
			mes "�@";
			mes "�]�X�|���b�I";
			mes "�@�Ƃ����ǂ����������]";
			next;
			misceffect 101, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "�ӂ��c�c";
			mes "��ꂽ�̂���I";
			mes "�@";
			mes "���̎������O���b�v�ɉ��H���āA";
			mes "��ɓ���ނ悤�ɍ�肾���̂���I";
			next;
			emotion 4, "�l�R����#ac_Necorin";
			mes "�m�l�R�����n";
			mes "�f�U�C���΂���ς���Ă����̂��B";
			mes "�{���ɖ����e�Ȃ̂��H";
			mes "�S�z�Ȃ̂��c�c";
			next;
			misceffect 101, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "���v�I�@�S�z�Ȃ��̂��I";
			mes "�@";
			mes "�}�[�e�B���̉���ׂ����J��";
			mes "��肾���āc�c";
			mes "�@";
			mes "����I�@�o�����̂���!!";
			next;
			mes "�m�~�X�e�B�n";
			mes "��́A�W�I�O���t�@�[��";
			mes "�s�̉��H�����邾���Ȃ̂���B";
			mes "�@";
			mes "�������x�Ă��Đ��ɗn���������̂�";
			mes "���͂Ȗ����e�̒e�ɂȂ�̂���I";
			next;
			emotion 33, "�l�R����#ac_Necorin";
			mes "�m�l�R�����n";
			mes "���Ȃ����̕��Ɏg�������̂�";
			mes "���̐A���̒��Ì��ʂ��g����";
			mes "�g�p��̈�Ȃ̂��I";
			next;
			emotion 9, "�~�X�e�B#ac_Misty";
			mes "�m�~�X�e�B�n";
			mes "���̒ʂ�Ȃ̂���I";
			mes "�@";
			mes "�T�d�ɁA�t���āc�c";
			mes "�́A�@�����Y���Y����̂���B";
			next;
			mes "�m�l�R�����n";
			mes "��Ȃ��̂�!!";
			mes "��������݂�������A";
			mes "�݂�ȐQ�Ă��܂��̂�!!";
			next;
			misceffect 305, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���A�䖝�ł���̂���I";
			mes "�@";
			mes "�Ō�ɁA����𐅂ɗn������";
			mes "�n���������ƒe��";
			mes "�g�ݍ��킹����c�c";
			next;
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ӂ��c�c";
			mes "�u�����e�v���o�����̂���c�c";
			mes "�u���e�E�O�b�X���[�i�y�v";
			mes "�����Ȃ̂���I";
			next;
			mes "[�l�R����]";
			mes "����ň��S���ۏႳ�ꂽ�̂��I";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�o��I";
			mes "���ł��������Ă���̂���!!";
			mes "�@";
			mes "�c�c�����I�@�o��!!";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�c�c�~�X�e�B�c�c";
			mes "��΁c�c�������Ȃ�!!";
			next;
			cutin "job_black_hucke02.bmp", 255;
			mes "[�~�X�e�B]";
			mes "�o��!!";
			mes "�N�v�̔[�ߎ��Ȃ̂���I";
			mes "����ł����炤�̂���I";
			next;
			misceffect 107, "�~�X�e�B#ac_Misty";
			mes "�]�h�J�[���c�c�]";
			next;
			emotion 23, "�~�X�e�B#ac_Misty";
			emotion 9, "�l�R����#ac_Necorin";
			emotion 9,"";
			mes "[�~�X�e�B]";
			mes "�������c�c��ꂽ�̂���I";
			next;
			cutin "job_black_hucke03.bmp", 2;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c�܂��c�c���I��";
			mes "�c�c���́A�{�����I";
			mes "���ꂩ��c�c���d�u30���ԁI";
			next;
			cutin "job_black_hucke01.bmp", 2;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���������͂�����̂�!!";
			mes "�Ȃ���ꂽ�񂶂�`�c�c";
			mes "�@";
			mes "�����Ă���Ȃ̂���`�`�c�c";
			next;
			cutin "job_black_hucke02.bmp", 2;
			mes "[�q���b�P]";
			mes "�~�X�e�B�c�c�҂̂ł��I";
			next;
			cutin "job_black_hucke02.bmp", 255;
			menu "�c�c�c�c",-;
			next;
			cutin "job_black_hucke02.bmp", 255;
			menu "�c�c�c�c",-;
			emotion 9,"";
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�c�c�c�c";
			mes "���A�l�W��1�����Ă���̂��B";
			next;
			menu "���́c�c��V�́H",-;
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����������̂��B";
			mes "�@";
			mes "��`�@�|���`�����ƁI";
			mes "�N�̒P�ʂ𑝂₵�Ă������̂��B";
			mes "���łɁA������v���[���g�Ȃ̂��I";
			next; 
			menu "���肪�Ƃ��������܂�",-; 
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100908;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(!checkweight(569,300)){
				set AC_QUEST_ST_6,3;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "���ށB";
				mes "������ƌ��炵�Ă����悤�Ȃ̂��B";
				next;
			}
			getitem 569, 300;
			chgquest 100908, 100909;
			if(checkre()) {
				getexp 2100,0;
				getexp 2100,0;
				getexp 0,2400;
				getexp 0,2400;
			}
			else {
				getexp 21000,0;
				getexp 21000,0;
				getexp 0,24000;
				getexp 0,24000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�܂�������������X�������ނ̂��B";
			mes "�@";
			mes "����ł͂܂�����Ȃ̂��B";
			next;
			emotion 12,"";
			mes "�]���̎o��A���͒����ǂ��̂ł́c�c";
			mes "�@";
			mes "�@�͂����āA�~�X�e�B�͓����؂鎖��";
			mes "�@�o����̂��낤���H";
			mes "�@";
			mes "�@�ǂ����|�����c�́A��鎖��";
			mes "�@�S�Ă����ڂɏo��悤���]";
			next;
			mes "[^FF0000��\�O�b�I��^000000]";
			mes "�]��\�l�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��40�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 14,1;
			close2;
			chgquest 100909, 201010;
			set AC_QUEST_LV_6,13;
			set AC_QUEST_ST_6,0;
			end;
		}
		break;
	/////////   ��\�l�b   /////////
	case 13:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<40){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\�l�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��40�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�v���Ԃ肶��̂�";
			mes "���C�ɂ��Ă��������H";
			next;
			menu "����ɂ���",-;
			emotion 16, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���̌�A���ǎo��ɕ߂܂��Ăȁc�c";
			mes "�����d�ł����󂯂��̂���c�c";
			next;
			mes "[�~�X�e�B]";
			mes "30���Ԃ�����������ꂽ�̂���I";
			mes "30���Ԃ��c�c";
			mes "�@";
			mes "����������͂��ꂾ���ɗ��܂炸�c�c";
			next;
			emotion 79, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���тꂽ�������x�����x��";
			mes "�_�œ˂����ꂽ�̂���c�c";
			mes "�@";
			mes "���������_���ɂȂ邩�Ǝv�����̂���B";
			next;
			menu "�c�c����͑�ςł�����",-;
			emotion 4,"";
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����̌��ł킩�����̂��B";
			mes "���̂܂܂ł́A";
			mes "�|�����c�ɐ�͂Ȃ��̂��I";
			next;
			menu "�����Ȃ�ǂ������̂ł����H",-;
			emotion 0,"";
			mes "[�l�R����]";
			mes "���X�̎��s�ɂ͌������������̂��B";
			mes "�|�����c�ɂ͎Q�d�c�c";
			mes "�܂�A�D�G�ȓ��]�����҂�";
			mes "���Ȃ������̂��c�c";
			next;
			mes "[�l�R����]";
			mes "���̂܂܂ł͑ʖڂȂ̂��B";
			mes "�~�X�e�B�̓��ł͌��E�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�����Ȃ̂���I";
			mes "�N�̂悤�Ȓm�b�̂���l��";
			mes "���c���Ăق����̂���I";
			next;
			menu "�������Ȃ��ł���",-;
			emotion 0, "�l�R����#ac_Necorin";
			emotion 54, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���������ȁc�c";
			mes "����ς���c���Ă���Ȃ��̂���c�c";
			mes "�@";
			mes "�c�c�c�c!?";
			mes "�{���Ȃ̂�!!";
			mes "�R�ł͂Ȃ��̂����!?";
			next;
			emotion 10, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "������̂��I";
			mes "���ɒc�����������̂��I";
			next;
			emotion 38, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�`�I";
			mes "���߂��Ɋ��U���ėǂ������̂��`�B";
			next;
			emotion 14, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�Ƃɂ����悩�����̂��B";
			mes "�@";
			mes "�ł͎������n�߂�̂�!!";
			next;
			mes "[�~�X�e�B]";
			mes "" + strcharinfo(0) + "";
			mes "�����撣��̂��Ⴜ�I";
			mes "�N�Ȃ��Γ��c�o����̂���I";
			next;
			menu "����??",-;
			emotion 1,"";
			emotion 33, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����Ȃ̂��B";
			mes "���c����ɂ͎������K�v�Ȃ̂��B";
			next;
			menu "�������l�����������Č������̂�",-;
			emotion 7,"";
			mes "[�l�R����]";
			mes "����͂���A";
			mes "����͂���Ȃ̂��I";
			next;
			menu "�ǂ�Ȏ����Ȃ̂ł����H",-;
			emotion 11, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "���c�����́A�����X�^�[��|���̂��I";
			mes "�@";
			mes "�u^FF0000�ꎟ����^000000�v�A�u^FF0000�񎟎���^000000�v�A";
			mes "�u^FF0000�ŏI����^000000�v��3�񂠂�̂��I";
			mes "�@";
			mes "�܂��́u^FF0000�ꎟ����^000000�v�Ȃ̂��I";
			next;
			menu "�����̓��e�������Ă�������",-;
			emotion 11, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�u^FF0000�ꎟ����^000000�v�̃����X�^�[�Ȃ̂��I";
			mes "^FF0000�E^000000^FF0000���[���[^000000";
			mes "^FF0000�E^000000^FF0000�X�P�����[�J�[^000000";
			mes "^FF0000�E^000000^FF0000�}�X�L�v���[^000000";
			mes "^FF0000�E^000000^FF0000�X�e�B���O^000000";
			mes "�̂ǂꂩ��I�Ԃ̂��I";
			next;
			mes "[�l�R����]";
			mes "�r���Ń����X�^�[�͕ς�����̂��I";
			mes "�@";
			mes "�������A�ς��Ă��܂��ƁA";
			mes "�ŏ������蒼���Ȃ̂��I";
			next;
			menu "����΂�܂�",-;
			mes "[�l�R����]";
			mes "�����I";
			mes "���̒��̂ǂꂩ���I�Ԃ̂��I";
			mes "�@";
			mes "�~�X�e�B�I";
			mes "�����X�^�[�̐���������̂��I";
			function	AC_PORING13_mobinfo	{
				switch(getarg(0)){
				case 100910:
					mes "[�~�X�e�B]";
					mes "�����邳��Ȃ̂���B";
					mes "���z�́A�������錫���̂���B";
					mes "�@";
					mes "���Ԃ��U�������ƁA";
					mes "��ĂɏP���Ă���̂���B";
					mes "�Ȃ�ׂ�1�C�̏���_���Ƃ����̂���B";
					break;
				case 100912:
					mes "[�~�X�e�B]";
					mes "���񂾒Y�z�v���A";
					mes "���ɂȂ��Ă�݂��������̂���B";
					mes "�@";
					mes "�����Ă�c���n�V�ł̍U���́A";
					mes "�ƂĂ������̂Œ��ӂ���B";
					mes "���Ȃ�U����A�񕜖��@�Ɏア�̂���B";
					break;
				case 100914:
					mes "[�~�X�e�B]";
					mes "�H�l�A������ȁB";
					mes "���z�̈ꌂ�͂ƂĂ������̂���B";
					mes "�@";
					mes "�߂Â��ƐΉ���z�������Ă���̂ŁA";
					mes "����������U������Ƃ����̂���B";
					break;
				case 100916:
					mes "[�~�X�e�B]";
					mes "��܂̂������݂����ȓz�Ȃ̂���B";
					mes "�@";
					mes "���l�N�^�C�����Ă���A�����ڂ�";
					mes "�����ĂƂ��Ă��������ȓz�Ȃ̂���B";
					mes "����̃Q���R�c�͂ƂĂ��ɂ��̂���B";
					break;
				}
				return;
			}
			function	AC_PORING13_warp;
			function	AC_PORING13	{
				set '@questid,0;
				//100910,���c�����@,0,1057,80,0,0,0,0
				//100912,���c�����@,0,1169,50,0,0,0,0
				//100914,���c�����@,0,1780,10,0,0,0,0
				//100916,���c�����@,0,1207,5,0,0,0,0
				setarray '@mobname$, "^FF0000���[���[^000000","^FF0000�X�P�����[�J�[^000000","^FF0000�}�X�L�v���[^000000","^FF0000�X�e�B���O^000000";
				while(1){
					next;
					set '@sel, select(printarray('@mobname$));
					switch('@sel){
					case 1:
						AC_PORING13_mobinfo 100910;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000���[���[^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000080�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100910;
						break;
					case 2:
						AC_PORING13_mobinfo 100912;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�X�P�����[�J�[^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000050�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100912;
						break;
					case 3:
						AC_PORING13_mobinfo 100914;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�}�X�L�v���[^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000010�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100914;
						break;
					case 4:
						AC_PORING13_mobinfo 100916;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�X�e�B���O^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF00005�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100916;
						break;
					}
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				emotion 21, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "" + '@mobname$['@sel-1] + "��";
				mes "����Ȃ̂��I";
				mes "�@";
				mes "�C��������ē|���Ă���̂�!!";
				next;
				mes "[�~�X�e�B]";
				mes "����t�撣��̂��Ⴜ��";
				mes "�@";
				mes "���@��" + '@mobname$['@sel-1] + "��";
				mes "�����n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING13_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING13_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 14,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100910: warp "ac_prac_03.gat",29,337; break;
					case 100912: warp "ac_prac_04.gat",261,261; break;
					case 100914: warp "ac_spec_01.gat",283,34; break;
					case 100916: warp "ac_spec_03.gat",98,78; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100910: warp "prt_fild03.gat",368,256; break;
					case 100912: warp "mjo_dun02.gat",125,60; break;
					case 100914: warp "ra_fild01.gat",306,43; break;
					case 100916: warp "gl_sew03.gat",171,283; break;
					}
				}
				return;
			}
			AC_PORING13;
			end;
		case 100910:
		case 100912:
		case 100914:
		case 100916:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�����Ɉꎟ���������Ȃ��Ă邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100910: set '@select$,'@select$ + "�u^FF0000���[���[^000000�v�ɂ��ċ�����";  break;
				case 100912: set '@select$,'@select$ + "�u^FF0000�X�P�����[�J�[^000000�v�ɂ��ċ�����";  break;
				case 100914: set '@select$,'@select$ + "�u^FF0000�}�X�L�v���[^000000�v�ɂ��ċ�����"; break;
				case 100916: set '@select$,'@select$ + "�u^FF0000�X�e�B���O^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING13_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�l�R����]";
					mes "�r���Ń����X�^�[�͕ς�����̂��I";
					mes "�@";
					mes "�������A�ς��Ă��܂��ƁA";
					mes "�ŏ������蒼���Ȃ̂��I";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING13_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING13;
					end;
				case 3:
					AC_PORING13_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			mes "[�~�X�e�B]";
			mes "��������Ȃ̂����";
			next;
			menu "�|���Ă��܂���",-;
			emotion 12,"";
			emotion 21, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���߂łƂ��Ȃ̂��I";
			mes "�ꎟ�������i�Ȃ̂��I";
			next;
			mes "[�~�X�e�B]";
			mes "�܂��܂��]�T�݂�������̂��B";
			mes "�啪�r�������Ă���̂���I";
			next;
			menu "�����A�܂��܂��ł�",-;
			emotion 22, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����A����Ȏ��͂Ȃ�����";
			mes "�@";
			mes "�������ǂ��S��������̂��B";
			mes "�����撣��̂��Ⴜ�I";
			next;
			mes "[�l�R����]";
			mes "�ꎟ�������i�̕�V�Ȃ̂��I";
			mes "�󂯂Ƃ�̂��B";
			next;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next; 
			menu "���肪�Ƃ��������܂�",-; 
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100918;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight(569,300)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 400;
			chgquest 100918, 100919;
			if(checkre()) {
				getexp 3500,0;
				getexp 3500,0;
				getexp 0,3000;
				getexp 0,3000;
			}
			else {
				getexp 35000,0;
				getexp 35000,0;
				getexp 0,30000;
				getexp 0,30000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 33, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���͓񎟎����Ȃ̂��I";
			next;
			emotion 77, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�񎟎����̓��V����J�����̂���B";
			mes "���������̂��c�c";
			next;
			menu "����Ȃɓ���̂ł����H",-;
			emotion 54, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B�́A";
			mes "�H�ו��̓����ɂ��āA";
			mes "3����񎟎����Ɏ��s�����̂��B";
			mes "�@";
			mes "�̂��琬�����Ă��Ȃ��̂��B";
			next;
			emotion 57, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�@";
			mes "�l�R�����a�A";
			mes "���̘b�͂���ȏサ�Ȃ��Łc�c";
			next;
			mes "[�l�R����]";
			mes "�񎟎����̏���������̂��B";
			mes "����܂ł�����Ƌx�ނ̂��I";
			next;
			menu "�͂��I�@�킩��܂���",-;
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Q�s���Ŏ������s���Ȃ��悤�ɂ̂��B";
			mes "��������x�ނ̂��Ⴜ�[�I";
			next;
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����ł͓񎟎����ŉ���Ȃ̂��I";
			next; 
			mes "[^FF0000��\�l�b�I��^000000]";
			mes "�]��\�ܘb�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��43�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 15,1;
			close2;
			chgquest 100919, 201015;
			set AC_QUEST_LV_6,14;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+10;
			end;
		}
		break;
	/////////   ��\�ܘb   /////////
	case 14:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<43){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\�ܘb�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��43�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�悭�����̂���I";
			mes "�񎟎����̏������o�����̂���I";
			next;
			mes "[�l�R����]";
			mes "�S�̏����͏o�����̂��H";
			next; 
			if(select("�o���܂���","�����������Ԃ���������")==2){
				emotion 33, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "�Q�Ă����������Ă���̂��I";
				close;
			}
			mes "[�l�R����]";
			mes "�u^FF0000�񎟎���^000000�v�́u^FF0000�ꎟ����^000000�v���";
			mes "�͂邩�ɓ���̂��c�c";
			next;
			emotion 52, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�ł��N�Ȃ獇�i�o����ƐM���Ă�̂��I";
			mes "�@";
			mes "�u^FF0000�񎟎���^000000�v�A�u^FF0000�ŏI����^000000�v��";
			mes "�c��2��Ȃ̂��I";
			next;
			menu "�����̓��e�������Ă�������",-;
			emotion 33,"";
			mes "[�l�R����]";
			mes "�u^FF0000�񎟎���^000000�v�̃����X�^�[�Ȃ̂��I";
			mes "^FF0000�E^000000^FF0000�K�C�A�X^000000";
			mes "^FF0000�E^000000^FF0000�e�^000000";
			mes "^FF0000�E^000000^FF0000�l�ʓ���^000000";
			mes "^FF0000�E^000000^FF0000�X�e�B���O^000000";
			mes "����I�Ԃ̂��I";
			next;
			mes "[�l�R����]";
			mes "�r���Ń����X�^�[�͕ς�����̂��I";
			mes "�@";
			mes "�������A�ς��Ă��܂��ƁA";
			mes "�ŏ������蒼���Ȃ̂��I";
			next;
			menu "����΂�܂�",-;
			mes "[�l�R����]";
			mes "�����I";
			mes "���̒��̂ǂꂩ���I�Ԃ̂��I";
			mes "�@";
			mes "�~�X�e�B�I";
			mes "�����X�^�[�̐���������̂��I";
			function	AC_PORING14_mobinfo	{
				switch(getarg(0)){
				case 100920:
					mes "[�~�X�e�B]";
					mes "�����Ȃ����������d���Ȃ̂���B";
					mes "�@";
					mes "�����X�R�b�v�������Ă���̂���B";
					mes "������������o���ƁA";
					mes "����ŉ��x���@�����̂����B";
					break;
				case 100922:
					mes "[�~�X�e�B]";
					mes "�A�}�c���Ŏ��񂾕��m���A";
					mes "���ɂȂ��Ă�݂��������̂���I";
					mes "�@";
					mes "�e�ŉ�������U�����Ă���̂���B";
					mes "�ł����Ȃ�U����A";
					mes "�񕜖��@�Ɏア�̂����";
					break;
				case 100924:
					mes "[�~�X�e�B]";
					mes "�|���炵�����Ȃ̂���c�c";
					mes "�@";
					mes "�؉A���炽������̂����邳�񂪁A";
					mes "���������𓊂��Ă���̂���I";
					mes "�������U���ƁA���ȉ񕜂ɒ��ӂ���B";
					break;
				case 100926:
					mes "[�~�X�e�B]";
					mes "��܂̂������݂����ȓz�Ȃ̂���B";
					mes "�@";
					mes "���l�N�^�C�����Ă���A�����ڂ�";
					mes "�����ĂƂ��Ă��������ȓz�Ȃ̂���B";
					mes "����̃Q���R�c�͂ƂĂ��ɂ��̂���B";
					break;
				}
				return;
			}
			function	AC_PORING14_warp;
			function	AC_PORING14	{
				set '@questid,0;
				//100920,���c�����A,0,1121,40,0,0,0,0
				//100922,���c�����A,0,1403,20,0,0,0,0
				//100924,���c�����A,0,1410,10,0,0,0,0
				//100926,���c�����A,0,1207,10,0,0,0,0
				setarray '@mobname$, "^FF0000�K�C�A�X^000000","^FF0000�e�^000000","^FF0000�l�ʓ���^000000","^FF0000�X�e�B���O^000000";
				while(1){
					next;
					set '@sel, select(printarray('@mobname$));
					switch('@sel){
					case 1:
						AC_PORING14_mobinfo 100920;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�K�C�A�X^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000040�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100920;
						break;
					case 2:
						AC_PORING14_mobinfo 100922;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�e�^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000020�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100922;
						break;
					case 3:
						AC_PORING14_mobinfo 100924;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�l�ʓ���^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000010�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100924;
						break;
					case 4:
						AC_PORING14_mobinfo 100926;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�X�e�B���O^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000010�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100926;
						break;
					}
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�����X�^�[��ς���̂���ȁH";
					mes "�@";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				emotion 21, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "" + '@mobname$['@sel-1] + "��";
				mes "����Ȃ̂��I";
				mes "�@";
				mes "�C��������ē|���Ă���̂�!!";
				next;
				mes "[�~�X�e�B]";
				mes "����t�撣��̂��Ⴜ��";
				mes "�@";
				mes "���@��" + '@mobname$['@sel-1] + "��";
				mes "�����n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING14_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING14_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 15,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100920: warp "ac_prac_04.gat",261,261; break;
					case 100922: warp "ac_spec_02.gat",124,59; break;
					case 100924: warp "ac_spec_01.gat",283,34; break;
					case 100926: warp "ac_spec_03.gat",98,78; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100920: warp "mjo_dun02.gat",125,60; break;
					case 100922: warp "ama_dun01.gat",227,7; break;
					case 100924: warp "gon_dun01.gat",153,48; break;
					case 100926: warp "gl_sew03.gat",171,283; break;
					}
				}
				return;
			}
			AC_PORING14;
			end;
		case 100920:
		case 100922:
		case 100924:
		case 100926:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�����ɓ񎟎��������Ȃ��Ă邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100920: set '@select$,'@select$ + "�u^FF0000�K�C�A�X^000000�v�ɂ��ċ�����";  break;
				case 100922: set '@select$,'@select$ + "�u^FF0000�e�^000000�v�ɂ��ċ�����";  break;
				case 100924: set '@select$,'@select$ + "�u^FF0000�l�ʓ���^000000�v�ɂ��ċ�����"; break;
				case 100926: set '@select$,'@select$ + "�u^FF0000�X�e�B���O^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING14_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�l�R����]";
					mes "�r���Ń����X�^�[�͕ς�����̂��I";
					mes "�@";
					mes "�������A�ς��Ă��܂��ƁA";
					mes "�ŏ������蒼���Ȃ̂��I";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING14_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING14;
					end;
				case 3:
					AC_PORING14_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			mes "[�~�X�e�B]";
			mes "��������Ȃ̂����";
			next;
			emotion 12, "�~�X�e�B#ac_Misty";
			menu "�|���Ă��܂���",-;
			mes "[�l�R����]";
			mes "���߂łƂ��Ȃ̂��I";
			mes "�񎟎������i�Ȃ̂��I";
			next;
			menu "�͂��͂��c�c���܂���",-;
			emotion 19,"";
			emotion 18, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�Ȃ��Ȃ���킵�Ă���悤����̂��B";
			mes "����͂��񂩂������̂��H";
			next;
			menu "�Ȃ�Ƃ����v�ł�",-;
			emotion 19,"";
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "����͂悩�����̂����";
			mes "���܂薳��������łȂ����H";
			mes "�@";
			mes "�킩�������̂��H";
			next;
			menu "�͂�",-;
			mes "[�l�R����]";
			mes "�񎟎������i�̕�V�Ȃ̂��I";
			mes "�󂯂Ƃ�̂��B";
			next;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next; 
			menu "���肪�Ƃ��������܂�",-; 
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100928;
		case 3:
			if(!checkitemblank()){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight(569,400)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 400;
			chgquest 100928, 100929;
			if(checkre()) {
				getexp 4700,0;
				getexp 4700,0;
				getexp 0,3750;
				getexp 0,3750;
			}
			else {
				getexp 47000,0;
				getexp 47000,0;
				getexp 0,37500;
				getexp 0,37500;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���悢��Ō�̎����Ȃ̂��I";
			next;
			emotion 53, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�ŏI�����͓���̂���c�c";
			mes "�������A���܂Ŋw�񂾎�����������";
			mes "�K�����i����͂�����I";
			next;
			menu "�͂����I",-;
			emotion 33, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B����J�������ǁA";
			mes "���i�o�����̂��I";
			next;
			emotion 2, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�A";
			mes "����ȂɖJ�߂Ȃ��Ă���";
			mes "�@";
			mes "���̎����ɍ��i�o�����̂�";
			mes "���̏����V�������Ⴉ��̂���";
			next;
			menu "��Փx���������ł��ˁc�c",-;
			emotion 19,"";
			mes "[�l�R����]";
			mes "���v�Ȃ̂��I";
			mes "�~�X�e�B�����i�o���郌�x���Ȃ̂��B";
			mes "�@";
			mes "�N�Ȃ獇�i�ԈႢ�����̂��I";
			next;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���i�ԈႢ�����Ȃ̂����";
			mes "�@";
			mes "�c�c�c�c�H";
			mes "�l�R�����a�c�c�H";
			mes "����͂ǂ������Ӗ��Ȃ̂���H";
			next;
			emotion 1, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "�ŏI�����̏���������̂��I";
			mes "�@";
			mes "����܂ŁA";
			mes "�񎟎����̔��������A";
			mes "�������莡���̂��I";
			next;
			menu "�͂��I�@�킩��܂���",-;
			emotion 21, "�l�R����#ac_Necorin";
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "������ƁH�@�l�R�����a�H";
			mes "�b�𕷂��Ăق����̂���B";
			mes "�@";
			mes "���V�����i�o���郌�x������";
			mes "�ǂ������Ӗ��Ȃ̂��႟�`�I";
			next;
			emotion 12, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "����ł͍ŏI�����ŉ���Ȃ̂��I";
			next;
			mes "[^FF0000��\�ܘb�I��^000000]";
			mes "�]��\�Z�b�J�n�ɂ́A";
			mes "�@^FF0000BaseLv��46�ȏ�^000000�ɂ���";
			mes "�@�b���|���Ă݂悤�]";
			next;
			Information 16,1;
			close2;
			chgquest 100929, 201020;
			set AC_QUEST_LV_6,15;
			set AC_QUEST_ST_6,0;
			set AC_CREDIT, AC_CREDIT+10;
			end;
		}
		break;
	/////////   ��\�Z�b   /////////
	case 15:
		switch(AC_QUEST_ST_6){
		case 0:
			if(BaseLevel<46){//�������Ȃ̂��I
				mes "[�C���t�H���[�V����]";
				mes "�]��\�Z�b�J�n�ɂ́A";
				mes "�@^FF0000BaseLv��46�ȏ�^000000�ɂ���";
				mes "�@�b���|���Ă݂悤�]";
				close;
			}
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�悭�����̂��I";
			mes "�ŏI�����̏������o�����̂��I";
			next;
			mes "�m�~�X�e�B�n";
			mes "�͂����`�A";
			mes "���V�̑�؂Ȃ�����c�c";
			mes "�@";
			mes "��������������������낤�Ȃ��A";
			mes "��������������낤�Ȃ��c�c";
			next;
			menu "�~�X�e�B�́A�ǂ�������ł����H",-;
			emotion 22,"";
			mes "[�l�R����]";
			mes "�~�X�e�B�Ȃ�";
			mes "�������ł������Ă�̂��B";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����c�c";
			mes "�l�R�����a�A�Ђǂ��̂���B";
			mes "�@";
			mes "���V�̉B���Ă������A";
			mes "�Ă��[���s�[������ɐH�ׂ��̂���I";
			next;
			emotion 32, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�|�����c�̈��������́A";
			mes "�ׂ����������܂ł�";
			mes "�C�ɂ�����ʖڂȂ̂��I";
			mes "�@";
			mes "���܂ł����Ɏ����Ă���ʖڂȂ̂��I";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���V�ɂƂ��Ăׂ͍����Ȃ��̂���B";
			mes "�������Ȃ̂���c�c";
			next;
			menu "���́c�c",-;
			emotion 19,"";
			mes "[�l�R����]";
			mes "�킩�����̂��c�c";
			mes "���x���l�тɁA";
			mes "�Ă��[���s�[�𔃂��Ă���̂��I";
			mes "�@";
			mes "������@���𒼂��̂�!!";
			next;
			emotion 76, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�{�����H�@��΂��Ⴜ!?";
			mes "�񑩂��Ⴉ��ȁI";
			next;
			menu "���́c�c���������c�c�H",-;
			emotion 19,"";
			emotion 0, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����Ƃ����������̂��B";
			mes "��������Y��Ă��̂��c�c";
			next;
			emotion 52, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�����I";
			mes "���悢��ŏI��������ȁI";
			mes "�S�̏����͏o�����̂��̂��H";
			next;
		case 100930:
			if(AC_QUEST_ST_6==1){
				emotion 52;
				mes "[�~�X�e�B]";
				mes "�S�̏����͏o�������̂��H";
				next;
			}
			if(select("�o���܂���","�����������Ԃ���������")==2){
				set AC_QUEST_ST_6, 100930;
				setquest 100930;
				emotion 21, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "����Ă����������Ă���̂��I";
				close;
			}
			emotion 21, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���悢��󂯂�̂���ȁI";
			next;
			mes "[�l�R����]";
			mes "�u^FF0000�ŏI����^000000�v�Ȃ̂��I";
			mes "�@";
			mes "�����̂Ȃ��悤����t�키�̂��I";
			next;
			menu "�����̓��e�������Ă�������",-;
			emotion 5, "�l�R����#ac_Necorin";
			emotion 33,"";
			mes "[�l�R����]";
			mes "�u^FF0000�ŏI����^000000�v�̃����X�^�[�Ȃ̂��I";
			mes "^FF0000�E^000000^FF0000�A�i�R���_�N^000000";
			mes "^FF0000�E^000000^FF0000�S�[����^000000";
			mes "^FF0000�E^000000^FF0000�z�[�h^000000";
			mes "^FF0000�E^000000^FF0000�A�[�`���[�X�P���g��^000000";
			mes "����I�Ԃ̂��I";
			next;
			mes "[�l�R����]";
			mes "�r���Ń����X�^�[�͕ς�����̂��I";
			mes "�@";
			mes "�������A�ς��Ă��܂��ƁA";
			mes "�ŏ������蒼���Ȃ̂��I";
			next;
			menu "����΂�܂�",-;
			emotion 27, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�����I";
			mes "���̒��̂ǂꂩ���I�Ԃ̂��I";
			mes "�@";
			mes "�~�X�e�B�I";
			mes "�����X�^�[�̐���������̂��I";
			function	AC_PORING15_mobinfo	{
				switch(getarg(0)){
				case 100932:
					mes "[�~�X�e�B]";
					mes "�Ԃ��w�r�Ȃ̂���B";
					mes "�@";
					mes "����̓ł́A�A�T�V�����g���ł�";
					mes "�悭�g���Ă���̂����";
					mes "�΂̃w�r�ƈ���Ă��Ȃ苭���̂���B";
					mes "���ӂ��K�v�Ȃ̂���B";
					break;
				case 100934:
					mes "[�~�X�e�B]";
					mes "�傫�Ȑ΂̋��l�Ȃ̂���B";
					mes "�@";
					mes "�̂��Ƃ��Ă��d���A���̕��킾��";
					mes "���������Ȃ����炢�d���̂���B";
					mes "���Ⴊ�A���̕������͒x�����B";
					break;
				case 100936:
					mes "[�~�X�e�B]";
					mes "�����n���ɂ���~�~�Y����ȁB";
					mes "�@";
					mes "�΂Ɏキ�A�����n�ʂɉB��Ă��邼�B";
					mes "���������ɂ��������m���̂��B";
					mes "�΂Ɏア�Ȃ�ʂ̗������n���ɁA";
					mes "�Z�߂΂����Ǝv���񂶂Ⴊ�Ȃ��B";
					break;
				case 100938:
					mes "[�~�X�e�B]";
					mes "���񂾋|�����A";
					mes "���ɂȂ��Ă�݂��������̂���I";
					mes "�@";
					mes "�|�ŉ�������U�����Ă���̂���B";
					mes "�ł����Ȃ�U����A";
					mes "�񕜖��@�Ɏア�̂����";
					break;
				}
				return;
			}
			function	AC_PORING15_warp;
			function	AC_PORING15	{
				set '@questid,0;
				//100932,���c�����B,0,1030,50,0,0,0,0
				//100934,���c�����B,0,1040,50,0,0,0,0
				//100936,���c�����B,0,1127,30,0,0,0,0
				//100938,���c�����B,0,1016,20,0,0,0,0
				setarray '@mobname$, "^FF0000�A�i�R���_�N^000000","^FF0000�S�[����^000000","^FF0000�z�[�h^000000","^FF0000�A�[�`���[�X�P���g��^000000";
				while(1){
					next;
					set '@sel, select(printarray('@mobname$));
					switch('@sel){
					case 1:
						AC_PORING15_mobinfo 100932;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�A�i�R���_�N^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000050�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100932;
						break;
					case 2:
						AC_PORING15_mobinfo 100934;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�S�[����^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000050�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100934;
						break;
					case 3:
						AC_PORING15_mobinfo 100936;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�z�[�h^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000030�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100936;
						break;
					case 4:
						AC_PORING15_mobinfo 100938;
						next;
						mes "[�l�R����]";
						mes "�u^FF0000�A�[�`���[�X�P���g��^000000�v�Ȃ̂��H";
						mes "�@";
						mes "^FF000020�C^000000�قǓ|���Ă���΍��i�Ȃ̂��I";
						set '@questid, 100938;
						break;
					}
					next;
					if(select("���̃����X�^�[�ɂ��܂�","����ς�Ⴄ�����X�^�[�Ɂc")==1) break;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
				}
				chgquest AC_QUEST_ST_6, '@questid;
				set AC_QUEST_ST_6,'@questid;
				emotion 21, "�l�R����#ac_Necorin";
				mes "[�l�R����]";
				mes "" + '@mobname$['@sel-1] + "��";
				mes "����Ȃ̂��I";
				mes "�@";
				mes "�C��������ē|���Ă���̂�!!";
				next;
				mes "[�~�X�e�B]";
				mes "����t�撣��̂��Ⴜ��";
				mes "�@";
				mes "���@��" + '@mobname$['@sel-1] + "��";
				mes "�����n�܂ő��邪�A�ǂ�����H";
				next;
				AC_PORING15_warp (select("�����ŕ����܂�","���肢���܂�")==1);
				return;
			}
			function	AC_PORING15_warp	{
				if(!getarg(0) && !'@novice){
					mes "[�l�R����]";
					mes "������Ƒ҂̂��B";
					mes "^FF0000���̉H^000000�͎������̂��H";
					mes "�@";
					mes "�Y��Ă���ƋA�肪";
					mes "��ςȂƂ�������̂��I";
					mes "����ł��A�s���̂��H";
					next;
					if(select("�͂�","������")==2){
						mes "[�l�R����]";
						mes "�������菀���͂��������ǂ��̂��B";
						mes "�܂��A���ł�����̂��B";
						mes "���ꂶ��A�������Ă���̂��I";
						close;
					}
					mes "[�l�R����]";
					mes "�����čs�����ق����ǂ��̂��c�c";
					mes "�@";
					mes "���������Ă��m��Ȃ��̂��I";
					next;
				}
				Information 16,0;
				if(getarg(0)){
					emotion 54;
					mes "[�~�X�e�B]";
					mes "�������c�c";
					mes "���@���g�����������̂Ɏc�O����̂��B";
					mes "�@";
					mes "�������菀�������Ċ撣��񂶂Ⴜ�`�B";
					close;
				}
				emotion 78;
				mes "[�~�X�e�B]";
				mes "���ށI";
				mes "�����A�o�w����`�I";
				mes "�@";
				mes "�܁[���A�܁[���A����Ђ��`��";
				mes "�@";
				mes "�]^FF0000�Z�[�u�n�_�Ƃ��ċL�^���܂���^000000�]";
				savepoint "ac_cl_area.gat",53,180;
				close2;
				if('@novice){
					switch(AC_QUEST_ST_6){
					case 100932: warp "ac_prac_05.gat",57,170; break;
					case 100934: warp "ac_prac_05.gat",57,170; break;
					case 100936: warp "ac_prac_05.gat",57,170; break;
					case 100938: warp "ac_spec_02.gat",124,59; break;
					}
				}else{
					switch(AC_QUEST_ST_6){
					case 100932: warp "cmd_fild09.gat",210,270; break;
					case 100934: warp "gef_fild08.gat",200,352; break;
					case 100936: warp "moc_fild17.gat",366,272; break;
					case 100938: warp "pay_dun01.gat",283,28; break;
					}
				}
				return;
			}
			AC_PORING15;
			end;
		case 100932:
		case 100934:
		case 100936:
		case 100938:
			if(!(checkquest(AC_QUEST_ST_6)&0x4)){
				mes "[�~�X�e�B]";
				mes "�ǂ�����H�@���q�́�";
				mes "�@";
				mes "�����ɍŏI���������Ȃ��Ă邩�̂��H";
				next;
				set '@select$,"���n�܂ő����Ăق���:�����X�^�[��ύX������:";
				switch(AC_QUEST_ST_6){
				case 100932: set '@select$,'@select$ + "�u^FF0000�A�i�R���_�N^000000�v�ɂ��ċ�����";  break;
				case 100934: set '@select$,'@select$ + "�u^FF0000�S�[����^000000�v�ɂ��ċ�����";  break;
				case 100936: set '@select$,'@select$ + "�u^FF0000�z�[�h^000000�v�ɂ��ċ�����"; break;
				case 100938: set '@select$,'@select$ + "�u^FF0000�A�[�`���[�X�P���g��^000000�v�ɂ��ċ�����"; break;
				}
				switch(select('@select$)){
				case 1:
					AC_PORING15_warp 0;
				case 2:
					emotion 4;
					mes "[�~�X�e�B]";
					mes "�����������������̂��H";
					next;
					mes "[�l�R����]";
					mes "�r���Ń����X�^�[�͕ς�����̂��I";
					mes "�@";
					mes "�������A�ς��Ă��܂��ƁA";
					mes "�ŏ������蒼���Ȃ̂��I";
					next;
					if(select("�͂��A���v�ł�","����ς蓯�������X�^�[��")==2){
						emotion 33;
						mes "[�~�X�e�B]";
						mes "���񂤂�B";
						mes "����t�撣��̂��Ⴜ��";
						mes "�@";
						mes "�悩������";
						mes "���@�Ō��n�܂ő��邪�A�ǂ�����H";
						next;
						AC_PORING15_warp (select("�����ŕ����܂�","���肢���܂�")==1);
					}
					emotion 33;
					mes "[�~�X�e�B]";
					mes "�ł́A���߂đI�Ԃ̂���I";
					AC_PORING15;
					end;
				case 3:
					AC_PORING15_mobinfo AC_QUEST_ST_6;
					close;
				}
			}
			emotion 12, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��������Ȃ̂����";
			next;
			menu "�|���Ă��܂���",-;
			emotion 46, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "���߂łƂ��Ȃ̂��I";
			mes "�ŏI�������i�Ȃ̂��I";
			next;
			emotion 28, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "���Ɍ�y���o�����̂���B";
			next;
			menu "��낵�����肢���܂��A��y�I",-;
			emotion 18,"";
			emotion 0, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��y!?";
			mes "���������Ȃ̂����";
			next;
			emotion 2, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�܂��́A";
			mes "�ŏI�������i�̕�V�Ȃ̂��I";
			mes "�����Ƃ�̂��B";
			next;
			emotion 46, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "��`�@�|���`�����ƁI";
			mes "�ق�A�N�̒P�ʂ𑝂₵�Ă��������B";
			mes "���łɁA������v���[���g����I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			emotion 15,"";
			chgquest AC_QUEST_ST_6, 100940;
		case 3:
			if(!checkitemblank2(2)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000���^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(!checkweight2(569,400, 11518,100)){
				set AC_QUEST_ST_6,3;
				emotion 23;
				mes "[�l�R����]";
				mes "����H";
				mes "�A�C�e�����R�����߂��Ȃ̂��B";
				mes "�u^FF0000�d��^000000�v�����炵�Ă���܂�����̂��I";
				mes "�@";
				mes "[�~�X�e�B]";
				mes "����ȂɎ����Ă������̂�!?";
				close;
			}
			if(AC_QUEST_ST_6==3){
				emotion 33;
				mes "[�~�X�e�B]";
				mes "���񂤂�B";
				mes "������ƌ��炵�Ă����悤����ȁB";
				next;
			}
			getitem 569, 400;
			getitem 11518, 100;
			chgquest 100940, 100942;
			if(checkre()) {
				getexp 6600,0;
				getexp 6600,0;
				getexp 0,4500;
				getexp 0,4500;
			}
			else {
				getexp 66000,0;
				getexp 66000,0;
				getexp 0,45000;
				getexp 0,45000;
			}
			set AC_QUEST_ST_6,4;
		case 4:
			emotion 55,"";
			mes "[�l�R����]";
			mes "���悢��|�����c�A�c��No3��";
			mes "�o�b�W��������̂��I";
			next;
			emotion 32, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a��No1�A";
			mes "���V��No2�Ȃ̂���I";
			next;
			menu "�����������o�b�W�ł���",-;
			emotion 2, "�l�R����#ac_Necorin";
			emotion 2, "�~�X�e�B#ac_Misty";
			emotion 37,"";
			mes "[�l�R����]";
			mes "�����󂯎��̂��I";
			next;
			menu "���肪�Ƃ��������܂�",-;
			mes "[��̐�]";
			mes "�c�c���Ɍ��������I";
			next;
			emotion 23, "�l�R����#ac_Necorin";
			emotion 23, "�~�X�e�B#ac_Misty";
			mes "[�l�R����]";
			mes "���܂����̂��I";
			mes "���[���Ɍ��������̂��I";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�I";
			mes "����������̂���I";
			next;
			menu "���H�@���́A������Ɓc�c",-;
			emotion 19,"";
			cutin "jpn_run03.bmp", 2;
			mes "[���[��]";
			mes "�����ƌ��������͓������Ȃ����I";
			next;
			cutin "jpn_run03.bmp", 255;
			emotion 16, "�l�R����#ac_Necorin";
			mes "[�l�R����]";
			mes "�~�X�e�B������̂��I";
			mes "�@";
			mes "��΂ɂ��܂��Ă͂����Ȃ��̂�!!";
			next;
			emotion 19, "�~�X�e�B#ac_Misty";
			mes "[�~�X�e�B]";
			mes "�l�R�����a�I";
			mes "�@";
			mes "�҂��Ă������ꂥ�[�c�c";
			next;
			cutin "jpn_run02.bmp", 2;
			mes "[���[��]";
			mes "������Ƃ����̂��Ȃ��I";
			mes "����������������񂾂���";
			next;
			menu "�́A�͂��I",-;
			emotion 16,"";
			cutin "jpn_run01.bmp", 2;
			mes "[���[��]";
			mes "���Ȃ��A�|�����c��m��Ȃ��H";
			next;
			switch(select("���́c�c�|�����c�̈���ł�","�������A�m��܂���")){
			case 1: set AC_QUEST_ST_6, 100944; break;
			case 2: set AC_QUEST_ST_6, 100946; break;
			}
			function	AC_PORING_END	{
				switch(AC_QUEST_ST_6){
				case 100944:
					emotion 33,"";
					chgquest 100942, 100944;
					cutin "jpn_run02.bmp", 2;
					mes "[���[��]";
					mes "�ӂӂӁA";
					mes "���ɕ߂܂������B";
					next;
					cutin "jpn_run05.bmp", 2;
					emotion 9,"";
					mes "[���[��]";
					mes "���Ȃ��B�̊�����";
					mes "�ڂ��ނ��Ă������ǁA";
					mes "�����䖝�ł��Ȃ���I";
					next;
					mes "[���[��]";
					mes "���V�l���w�A���N�u���̉��l����";
					mes "�ςȕ��𔄂���āc�c";
					mes "�@";
					mes "���������Ȃ́I";
					mes "���̕ςȃ��{�b�g��!!";
					next;
					menu "���߂�Ȃ����I�@���߂�Ȃ����I",-;
					emotion 17,"";
					cutin "jpn_run03.bmp", 2;
					mes "[���[��]";
					mes "���̂��B���āA�e�ŃR�\�R�\�Ɓc�c";
					mes "�@";
					mes "������������Ă��A";
					mes "���ꂶ��o���Ȃ�����Ȃ���!!";
					next;
					menu "��!?",-;
					cutin "jpn_run05.bmp", 2;
					emotion 23,"";
					mes "[���[��]";
					mes "�H���̕��a������āA";
					mes "�݂�Ȃ����ӂ��Ă���̂Ɂc�c";
					mes "�@";
					mes "��������킹��";
					mes "�������Ȃ�ċ����Ȃ���I";
					next;
					mes "[���[��]";
					mes "���܂��܁A";
					mes "���Ȃ��B�̍���Ă������̂�";
					mes "�������������Ă�������A";
					mes "�������t�������ǁc�c";
					mes "�@";
					mes "����������J�ɁA�|�����c�`�m�ƁI";
					next;
					cutin "jpn_run01.bmp", 2;
					mes "[���[��]";
					mes "�c���ɂ����`���Ȃ����I";
					mes "�@";
					mes "�u�݂�Ȃ̑O�ɏo�Ă���悤�Ɂv���ā�";
					next;
					mes "[���[��]";
					mes "������ˁI";
					next;
					menu "�킩��܂���",-;
					emotion 33,"";
					cutin "jpn_run02.bmp", 2;
					mes "[���[��]";
					mes "���႟�X�������񂾂��B";
					mes "�@";
					mes "�@";
					mes "�c�c�����I�@���������B";
					next;
					cutin "jpn_run03.bmp", 2;
					mes "[���[��]";
					mes "���Ȃ��A�|�����c����";
					mes "��������P�ʂ�������Ă��ł���H";
					next;
					menu "�c�c�͂�",-;
					emotion 4,"";
					cutin "jpn_run02.bmp", 2;
					mes "[���[��]";
					mes "���X�ɂ��Ă��傤�����B";
					mes "�@";
					mes "����Ȏ������Ȃ��Ă��A";
					mes "���������ƒP�ʂ��������B";
					mes "�@";
					mes "���ꂶ��A�����Ɠ`���ĂˁB";
					next;
					cutin "jpn_run02.bmp", 255;
					mes "�]�����͖������i�o�����]";
					mes "�@";
					mes "�]�Ă̒�A��������������";
					mes "�@���܂ł̎��́A";
					mes "�@�S�Ēm���Ă����悤���]";
					next;
					emotion 19, "�~�X�e�B#ac_Misty";
					emotion 19, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�ӂ��A��Ȃ������̂��B";
					mes "���[�����疳���ɓ����؂ꂽ�̂��H";
					mes "�@";
					mes "�ŋ߁A�Ď��̖ڂ��������̂��B";
					next;
					mes "[�~�X�e�B]";
					mes "����H";
					mes "" + strcharinfo(0) + "";
					mes "�ǂ������̂���H";
					next;
					menu "���́c�c",-;
					mes "[�~�X�e�B]";
					mes "�c�c�Ȃ񂶂��!!";
					mes "�@";
					mes "���܂ł̊������A";
					mes "���[���ɑS�ăo���Ă��������!?";
					next;
					emotion 0, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�|�����c��";
					mes "��̑g�D����Ȃ��ƑʖڂȂ̂��I";
					mes "�@";
					mes "�������o����Ƃ́c�c";
					mes "�s�o�������̂��B";
					next;
					emotion 2, "�~�X�e�B#ac_Misty";
					mes "[�~�X�e�B]";
					mes "�܂��A";
					mes "" + strcharinfo(0) + "��";
					mes "�����������̂���!!";
					mes "�l�R�����a�A�ǂ��ł͂Ȃ�����";
					mes "�l�Ɋ��ӂ����̂�";
					mes "�����C�͂��Ȃ��̂����";
					next;
					mes "[�~�X�e�B]";
					mes "�������A���";
					mes "�ǂ��Ńo�����̂���낤�H";
					mes "���������łȂ��A";
					mes "�g�D�̖��O�܂Ńo���Ă���Ƃ́c�c";
					next;
					emotion 54, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�o���Ă��܂��Ă͂��傤���Ȃ��̂��B";
					mes "�@";
					mes "���΂炭�͊��������l���āA";
					mes "�B��邵���Ȃ��̂��I";
					next;
					emotion 28, "�~�X�e�B#ac_Misty";
					mes "�m�~�X�e�B�n";
					mes "�c�����������ƌ����̂�";
					mes "�������ł��Ȃ��͎̂c�O�Ȃ̂���B";
					next;
					mes "�m�l�R�����n";
					mes "�܂������A�c�O�Ȃ̂��c�c";
					next;
					mes "�m�~�X�e�B�n";
					mes "���ꂩ�炶��ƌ����̂ɂ̂��c�c";
					next;
					emotion 21, "�l�R����#ac_Necorin";
					mes "�m�l�R�����n";
					mes "" + strcharinfo(0) + "��";
					mes "�悭�m�点�Ă��ꂽ�̂��B";
					mes "�@";
					mes "�������ŕ߂܂炸�ɂ��񂾂̂��B";
					next;
					mes "�m�l�R�����n";
					mes "�������ĊJ���鎞��������";
					mes "�K�����W����̂��I";
					mes "�@";
					mes "���̎��͂܂��\���̂�!!";
					next;
					mes "�m�~�X�e�B�n";
					mes "��琶�܂ꂽ���͈Ⴆ�ǂ��A";
					mes "�߂܂鎞�͈ꏏ�Ȃ̂���!!";
					mes "�@";
					mes "�����ĕ߂܂�łȂ����H";
					next;
					menu "�͂��I",-;
					emotion 12, "�l�R����#ac_Necorin";
					emotion 12, "�~�X�e�B#ac_Misty";
					emotion 12,"";
					mes "�m�l�R�����n";
					mes "����ł́A�܂�����Ȃ̂��I";
					mes "�@";
					mes "�m�~�X�e�B�n";
					mes "�܂��A����Ȃ̂���I";
					chgquest 100944, 201025;
					set AC_QUEST_LV_6, 16;
					set AC_QUEST_ST_6, 201025;
					close2;
					break;
				case 100946:
					emotion 22,"";
					chgquest 100942, 100946;
					cutin "jpn_run03.bmp", 2;
					mes "[���[��]";
					mes "�{���H";
					mes "�@";
					mes "�c�c�܂�������B";
					mes "���Ȃ��̎���M���Ă������B";
					next;
					cutin "jpn_run05.bmp", 2;
					mes "[���[��]";
					mes "�������x�|�����c������������A";
					mes "�^����Ɏ��ɋ����Ă��傤�����ˁB";
					mes "�@";
					mes "���񂾂��B";
					next;
					menu "�킩��܂���",-;
					emotion 33,"";
					cutin "jpn_run03.bmp", 2;
					mes "[���[��]";
					mes "�c�c�c";
					mes "�܂����������c�c";
					mes "�@";
					mes "��������������̂�";
					mes "����������Ȃ�āc�c";
					next;
					menu "���������܂������H",-;
					cutin "jpn_run04.bmp", 2;
					cutin "jpn_run02.bmp", 2;
					emotion 55,"";
					mes "[���[��]";
					mes "�c�c�I";
					mes "�@";
					mes "�ȁA���ł��Ȃ���B";
					mes "���ꂶ�ጩ���������낵���ˁB";
					next;
					cutin "jpn_run02.bmp", 255;
					mes "�]�����͖������i�o����";
					mes "�@�|�����c�̔閧�͎�鎖���o�����]";
					mes "�@";
					mes "�]����ɂ��Ă����[����";
					mes "�@����`�����������̂��낤�H�]";
					next;
					emotion 19, "�~�X�e�B#ac_Misty";
					emotion 19, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "�ӂ��A��Ȃ������̂��B";
					mes "���[�����疳���ɓ����؂ꂽ�̂��H";
					mes "�@";
					mes "�ŋ߁A�Ď��̖ڂ��������̂��B";
					next;
					mes "[�~�X�e�B]";
					mes "����H";
					mes "" + strcharinfo(0) + "";
					mes "�ǂ������̂���H";
					next;
					menu "���́c�c",-;
					emotion 0, "�~�X�e�B#ac_Misty";
					mes "[�~�X�e�B]";
					mes "����Ȏ����������̂���ȁc�c";
					mes "�낤���o���鏊��������B";
					next;
					emotion 4, "�l�R����#ac_Necorin";
					mes "[�l�R����]";
					mes "��Ȃ������̂��c�c";
					mes "�@";
					mes "�|�����c�́A";
					mes "��̑g�D����Ȃ��ƑʖڂȂ̂��B";
					mes "�@";
					mes "������C������̂�!!";
					next;
					mes "�m�l�R�����n";
					mes "�������Ȃ��A���[����";
					mes "�|�����c�̖����H";
					mes "����́A�o���Ă���̂��H";
					next;
					menu "���������΁A���������c�c",-;
					emotion 4,"";
					emotion 0, "�l�R����#ac_Necorin";
					mes "�m�l�R�����n";
					mes "�ȁA�Ȃ�ƌ������ƂȂ̂��I";
					mes "�~�X�e�B�I";
					mes "�~�X�e�B!!";
					mes "�@";
					mes "���x���͌��ǂǂ��Ȃ����̂�!?";
					next;
					emotion 55, "�~�X�e�B#ac_Misty";
					mes "�m�~�X�e�B�n";
					mes "�s�����������̂��H";
					mes "�@";
					mes "�����ł��e�؂ɕԕi����ւ�";
					mes "�₢���킹�ׁ̈c�c�c�c";
					next;
					emotion 9, "�l�R����#ac_Necorin";
					emotion 9,"";
					mes "�]�~�X�e�B�̒��قƋ���";
					mes "�@�₽����C���|�����c��ݍ��ށ]";
					mes "�@";
					mes "�]�~�X�e�B�ɓ˂��h����";
					mes "�@�s���l�R�����̎����]";
					next;
					emotion 23, "�~�X�e�B#ac_Misty";
					mes "�m�~�X�e�B�n";
					mes "���܂����̂���!!!!";
					mes "�܂������C�Â��Ȃ������̂���I";
					mes "�@";
					mes "�l�R�����a�A";
					mes "�Ȃ��~�߂Ȃ������̂���I";
					next;
					mes "�m�l�R�����n";
					mes "�ނނ��c�c";
					mes "�@";
					mes "�����ɂȂ肷���āA";
					mes "�܂������C�Â��Ȃ������̂��I";
					next;
					mes "�m�~�X�e�B�n";
					mes "�l�A�l�R�����a!!";
					next;
					emotion 54, "�l�R����#ac_Necorin";
					mes "�m�l�R�����n";
					mes "�������A�����̂��I";
					mes "�����Ƃ������̂��I";
					mes "�@";
					mes "���̂��o�����\��������ȏ�́A";
					mes "�قƂڂ肪��߂�܂�";
					mes "���l���邵���Ȃ��̂��c�c";
					next;
					emotion 28, "�~�X�e�B#ac_Misty";
					mes "�m�~�X�e�B�n";
					mes "�������A�c�����������ƌ����̂�";
					mes "�������ł��Ȃ��͎̂c�O�Ȃ̂���c�c";
					next;
					mes "�m�l�R�����n";
					mes "�܂������A�c�O�Ȃ̂��c�c";
					next;
					mes "�m�~�X�e�B�n";
					mes "���ꂩ�炶��ƌ����̂ɂ̂��c�c";
					next;
					emotion 21, "�l�R����#ac_Necorin";
					mes "�m�l�R�����n";
					mes "" + strcharinfo(0) + "��";
					mes "�悭�m�点�Ă��ꂽ�̂��B";
					mes "�@";
					mes "�������ŕ߂܂炸�ɂ��񂾂̂��B";
					next;
					mes "�m�l�R�����n";
					mes "�������ĊJ���鎞��������";
					mes "�K�����W����̂��I";
					mes "�@";
					mes "���̎��͂܂��\���̂�!!";
					next;
					mes "�m�~�X�e�B�n";
					mes "��琶�܂ꂽ���͈Ⴆ�ǂ��A";
					mes "�߂܂鎞�͈ꏏ�Ȃ̂���!!";
					mes "�@";
					mes "�����ĕ߂܂�łȂ����H";
					next;
					menu "�͂��I",-;
					emotion 12, "�l�R����#ac_Necorin";
					emotion 12, "�~�X�e�B#ac_Misty";
					emotion 12,"";
					mes "�m�l�R�����n";
					mes "����ł́A�܂�����Ȃ̂��I";
					mes "�@";
					mes "�m�~�X�e�B�n";
					mes "�܂��A����Ȃ̂���I";
					chgquest 100946, 201030;
					set AC_QUEST_LV_6, 16;
					set AC_QUEST_ST_6, 201030;
					close2;
				}
				return;
			}
		case 100944:
		case 100946:
			AC_PORING_END;
			set AC_CREDIT, AC_CREDIT+10;
			end;
		}
		break;
	/////////   ��\���b�H   /////////
	case 16:
		emotion 1, "�l�R����#ac_Necorin";
		mes "�m�l�R�����n";
		mes "�ނށH�@�N�͒N�Ȃ̂��H";
		mes "�����悤�Ȃ̂��H";
		next;
		menu "�Y�ꂽ�̂ł����H",-;
		emotion 1;
		mes "�m�~�X�e�B�n";
		mes "��̂Ȃ�̎�����H";
		mes "" + strcharinfo(0) + "�Ƃ�";
		mes "�b�������������̂���B";
		mes "�@";
		mes "�c�c�����I";
		next;
		mes "�m�l�R�����n";
		mes "�c�c�c�c";
		mes "�~�X�e�B�͑��ς�炸�o�J�Ȃ̂��c�c";
		mes "�@";
		mes "�݂�ȂŏW�܂��Ă��猩����̂��I";
		mes "�������ĊJ���鎞��������";
		mes "�K�����W����̂��I";
		next;
		emotion 36, "�l�R����#ac_Necorin";
		emotion 28;
		emotion 4,"";
		mes "�m�l�R�����n";
		mes "�~�X�e�B�͌�ł��d�u���Ȃ̂��I";
		mes "����ł́A�܂�����Ȃ̂��I";
		mes "�@";
		mes "�m�~�X�e�B�n";
		mes "�����c�c�l�R�����a�A";
		mes "���d�u���͋����Ăق����̂���c�c";
		close;
	}
	
	function	checkitemblank2	{
		getinventorylist;
		return (100-@inventorylist_count>getarg(0));
	}
	
	function	checkweight2	{
		set '@i,0;
		set '@w,0;
		set '@cnt, getargcount()/2;
		while('@i<'@cnt){
			set '@w, '@w + getiteminfo(getarg('@i*2),6) * getarg('@i*2+1);
			set '@i,'@i+1;
		}
		return (Weight+'@w < MaxWeight);
	}
	
	function	Information	{
		mes "[�C���t�H���[�V����]";
		switch(getarg(0)){
		case 1:
			mes "�]���b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F20";
				mes "JobExp�F2";
			}
			else {
				mes "BaseExp�F40";
				mes "JobExp�F16";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 50��";
			break;
		case 2:	
			mes "�]���b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F24";
				mes "JobExp�F8";
			}
			else {
				mes "BaseExp�F176";
				mes "JobExp�F88";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 100��";
			break;
		case 3:
			mes "�]��O�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F44";
				mes "JobExp�F24";
			}
			else {
				mes "BaseExp�F436";
				mes "JobExp�F250";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 150��";
			break;
		case 4:
			mes "�]��l�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F99";
				mes "JobExp�F57";
			}
			else {
				mes "BaseExp�F999";
				mes "JobExp�F570";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			break;
		case 5:
			mes "�]��ܘb�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F180";
				mes "JobExp�F30";
			}
			else {
				mes "BaseExp�F1800";
				mes "JobExp�F300";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			mes "�X�s�[�h�A�b�v�|�[�V���� 10��";
			break;
		case 6:
			mes "�]��Z�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F260";
				mes "JobExp�F100";
			}
			else {
				mes "BaseExp�F2600";
				mes "JobExp�F1000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			mes "���̉H 5��";
			break;
		case 7:
			mes "�]�掵�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F360";
				mes "JobExp�F240";
			}
			else {
				mes "BaseExp�F3600";
				mes "JobExp�F2400";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			mes "���S�җp�|�[�V���� 50��";
			break;
		case 8:
			mes "�]�攪�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F400";
				mes "JobExp�F480";
			}
			else {
				mes "BaseExp�F4000";
				mes "JobExp�F4800";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			break;
		case 9:
			mes "�]���b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F600";
				mes "JobExp�F900";
			}
			else {
				mes "BaseExp�F6000";
				mes "JobExp�F9000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 200��";
			mes "���S�җp�|�[�V���� 50��";
			break;
		case 10:
			mes "�]��\�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F1200";
				mes "JobExp�F1500";
			}
			else {
				mes "BaseExp�F12000";
				mes "JobExp�F15000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 300��";
			mes "�X�s�[�h�A�b�v�|�[�V���� 10��";
			break;
		case 11:
			mes "�]��\��b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F1600";
				mes "JobExp�F2800";
			}
			else {
				mes "BaseExp�F16000";
				mes "JobExp�F28000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 300��";
			mes "���̉H 10��";
			break;
		case 12:
			mes "�]��\��b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F2400";
				mes "JobExp�F3800";
			}
			else {
				mes "BaseExp�F24000";
				mes "JobExp�F38000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 300��";
			break;
		case 13:
			mes "�]��\�O�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F4200";
				mes "JobExp�F4800";
			}
			else {
				mes "BaseExp�F42000";
				mes "JobExp�F48000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 300��";
			break;
		case 14:
			mes "�]��\�l�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F7000";
				mes "JobExp�F6000";
			}
			else {
				mes "BaseExp�F70000";
				mes "JobExp�F60000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 400��";
			break;
		case 15:
			mes "�]��\�ܘb�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F9400";
				mes "JobExp�F7500";
			}
			else {
				mes "BaseExp�F94000";
				mes "JobExp�F75000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 400��";
			break;
		case 16:
			mes "�]��\�Z�b�@��V/�l���A�C�e���]";
			if(checkre()) {
				mes "BaseExp�F13200";
				mes "JobExp�F9000";
			}
			else {
				mes "BaseExp�F132000";
				mes "JobExp�F90000";
			}
			mes "�A�C�e���F";
			mes "���S�җp�|�[�V���� 400��";
			mes "���S�җp�|�[�V���� 100��";
			break;
		}
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]�l���A�C�e���̏ڍׂ�";
		mes "�m�F���܂����H�]";
		next;
		switch(getarg(0)){
		case 1:
		case 2:
		case 3:
		case 4:
		case 8:
		case 12:
		case 13:
		case 14:
		case 15:
			switch(select("�m�F���Ȃ�","���S�җp�|�[�V����")){
			case 1:
				if(getarg(1)){
					mes "[�C���t�H���[�V����]";
					mes "�]�l���A�C�e���̊m�F��";
					mes "�s���܂���ł����]";
				}
				return;
			case 2:
				mes "[�C���t�H���[�V����]";
				mes "�]���S�җp�|�[�V�����]";
				mes "�`�����n�߂�m�[�r�X�����̂��߂�";
				mes "�p�ӂ��ꂽ�|�[�V�����B";
				mes "^000088HP�����ʉ�^000000����B";
				mes "�d�� : ^7777771^000000";
				break;
			}
			break;
		case 5:
		case 10:
			switch(select("�m�F���Ȃ�","���S�җp�|�[�V����","�X�s�[�h�A�b�v�|�[�V����")){
			case 1:
				if(getarg(1)){
					mes "[�C���t�H���[�V����]";
					mes "�]�l���A�C�e���̊m�F��";
					mes "�s���܂���ł����]";
				}
				return;
			case 2:
				mes "[�C���t�H���[�V����]";
				mes "�]���S�җp�|�[�V�����]";
				mes "�`�����n�߂�m�[�r�X�����̂��߂�";
				mes "�p�ӂ��ꂽ�|�[�V�����B";
				mes "^000088HP�����ʉ�^000000����B";
				mes "�d�� : ^7777771^000000";
				break;
			case 3:
				mes "[�C���t�H���[�V����]";
				mes "�]�X�s�[�h�A�b�v�|�[�V�����]";
				mes "���p����ƏW���͂����߂Ă����";
				mes "����������������B";
				mes "�U�����x(Aspd)���グ����ʂ�����B";
				mes "���ׂẴL�����N�^�[���g�p�ł���B";
				mes "�d�� : ^77777710^000000";
				break;
			}
			break;
		case 6:
		case 11:
			switch(select("�m�F���Ȃ�","���S�җp�|�[�V����","���̉H")){
			case 1:
				if(getarg(1)){
					mes "[�C���t�H���[�V����]";
					mes "�]�l���A�C�e���̊m�F��";
					mes "�s���܂���ł����]";
				}
				return;
			case 2:
				mes "[�C���t�H���[�V����]";
				mes "�]���S�җp�|�[�V�����]";
				mes "�`�����n�߂�m�[�r�X�����̂��߂�";
				mes "�p�ӂ��ꂽ�|�[�V�����B";
				mes "^000088HP�����ʉ�^000000����B";
				mes "�d�� : ^7777771^000000";
				break;
			case 3:
				mes "[�C���t�H���[�V����]";
				mes "�]���̉H�]";
				mes "���̗���؂��p�����������B";
				mes "^000088�Z�[�u�������Ƀ��[�v����B^000000";
				mes "�d�� : ^7777775^000000";
				break;
			}
			break;
		case 7:
		case 9:
		case 16:
			switch(select("�m�F���Ȃ�","���S�җp�|�[�V����","���S�җp�|�[�V����")){
			case 1:
				if(getarg(1)){
					mes "[�C���t�H���[�V����]";
					mes "�]�l���A�C�e���̊m�F��";
					mes "�s���܂���ł����]";
				}
				return;
			case 2:
				mes "[�C���t�H���[�V����]";
				mes "�]���S�җp�|�[�V�����]";
				mes "�`�����n�߂�m�[�r�X�����̂��߂�";
				mes "�p�ӂ��ꂽ�|�[�V�����B";
				mes "^000088HP�����ʉ�^000000����B";
				mes "�d�� : ^7777771^000000";
				break;
			case 3:
				mes "[�C���t�H���[�V����]";
				mes "�]���S�җp�|�[�V�����]";
				mes "�삯�o���̖`���҂̂��߂�";
				mes "�p�ӂ��ꂽ�|�[�V�����B";
				mes "^000088SP��5��^000000����B";
				mes "�q�ɂ��܂߁A��؂̈ړ����o���Ȃ��B";
				mes "�d�� : ^7777775^000000";
				break;
			}
			break;
		}
		if(!getarg(1)) next;
		return;
	}

OnInit:
	waitingroom "�|�����c �Q��I", 0;
	end;
}

//�l�R����
ac_cl_area.gat,64,183,4	script	�l�R����#ac_Necorin	508,{}

//�N�G�X�g�ē��摜�\���pNPC
ac_prac_01.gat,228,31,0	script	#ac_prac_01_enter1	139,5,3{
	if(!(AC_HINT_02 & 0x2)){
		//1���
		cutin "start_038_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x2;
	} else
	if(!(AC_HINT_02 & 0x4)){
		//2���
		cutin "start_040_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x4;
	} else
	if(!(AC_HINT_02 & 0x8)){
		//3���
		cutin "start_042_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x8;
	}
	set @help,1;
}
ac_prac_01.gat,228,36,0	script	#ac_prac_01_enter2	139,5,3{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100801)){
		cutin "q_por_mon_01.bmp",4;
	} else
	if(checkquest(100805)){
		cutin "q_por_mon_02.bmp",4;
	} else
	if(checkquest(100810)){
		cutin "q_por_mon_03.bmp",4;
	} else
	if(checkquest(100815)){
		cutin "q_por_mon_04.bmp",4;
	} else
	if(checkquest(100820)){
		cutin "q_por_mon_05.bmp",4;
	} else
	if(checkquest(100822)){
		cutin "q_por_mon_06.bmp",4;
	} else
	if(checkquest(100824)){
		cutin "q_por_mon_07.bmp",4;
	} else
	if(checkquest(100850)){
		cutin "q_por_mon_15.bmp",4;
	}
}
ac_prac_02.gat,110,33,0	duplicate(#ac_prac_01_enter1)	#ac_prac_02_enter1	139,5,3
ac_prac_02.gat,110,39,0	script	#ac_prac_02_enter2	139,5,3,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100830) || checkquest(100840)){
		cutin "q_por_mon_09.bmp",4;
	} else
	if(checkquest(100834)){
		cutin "q_por_mon_11.bmp",4;
	} else
	if(checkquest(100842)){
		cutin "q_por_mon_12.bmp",4;
	} else
	if(checkquest(100852)){
		cutin "q_por_mon_16.bmp",4;
	} else
	if(checkquest(100864) || checkquest(100870)){
		cutin "q_por_mon_20.bmp",4;
	}
}

ac_prac_03.gat,29,345,0	duplicate(#ac_prac_01_enter1)	#ac_prac_03_enter1	139,5,3
ac_prac_03.gat,23,345,0	script	#ac_prac_03_enter2_1	139,4,1,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100860)){
		cutin "q_por_mon_18.bmp",4;
	} else
	if(checkquest(100862) || checkquest(100880)){
		cutin "q_por_mon_19.bmp",4;
	} else
	if(checkquest(100872) || checkquest(100882) || checkquest(100910)){
		cutin "q_por_mon_21.bmp",4;
	} else
	if(checkquest(100884)){
		cutin "q_por_mon_23.bmp",4;
	} else
	if(checkquest(100890)){
		cutin "q_por_mon_25.bmp",4;
	}
}
ac_prac_03.gat,22,331,0	duplicate(#ac_prac_03_enter2_1)	#ac_prac_03_enter2_2	139,1,4
ac_prac_03.gat,34,337,0	duplicate(#ac_prac_03_enter2_1)	#ac_prac_03_enter2_3	139,1,4

ac_prac_04.gat,266,261,0	duplicate(#ac_prac_01_enter1)	#ac_prac_04_enter1	139,5,1
ac_prac_04.gat,266,265,0	script	#ac_prac_04_enter2	139,5,1,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100900)){
		cutin "q_por_mon_28.bmp",4;
	} else
	if(checkquest(100902)){
		cutin "q_por_mon_29.bmp",4;
	} else
	if(checkquest(100904)){
		cutin "q_por_mon_30.bmp",4;
	} else
	if(checkquest(100920)){
		cutin "q_por_mon_33.bmp",4;
	}
}

ac_prac_05.gat,57,170,0	duplicate(#ac_prac_01_enter1)	#ac_prac_05_enter1	139,1,1
ac_prac_05.gat,59,180,0	script	#ac_prac_05_enter2_1	139,5,1,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100932)){
		cutin "q_por_mon_36.bmp",4;
	} else
	if(checkquest(100934)){
		cutin "q_por_mon_37.bmp",4;
	} else
	if(checkquest(100936)){
		cutin "q_por_mon_38.bmp",4;
	}
}
ac_prac_05.gat,61,170,0	duplicate(#ac_prac_05_enter2_1)	#ac_prac_05_enter2_2	139,1,5
ac_prac_05.gat,59,160,0	duplicate(#ac_prac_05_enter2_1)	#ac_prac_05_enter2_3	139,5,1

ac_spec_01.gat,283,26,0	duplicate(#ac_prac_01_enter1)	#ac_spec_01_enter1	139,1,1
ac_spec_01.gat,279,26,0	script	#ac_spec_01_enter2_1	139,5,1,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100826) || checkquest(100836) || checkquest(100876)){
		cutin "q_por_mon_08.bmp",4;
	} else
	if(checkquest(100832)){
		cutin "q_por_mon_10.bmp",4;
	} else
	if(checkquest(100846)){
		cutin "q_por_mon_14.bmp",4;
	} else
	if(checkquest(100856) || checkquest(100866)){
		cutin "q_por_mon_17.bmp",4;
	} else
	if(checkquest(100896) || checkquest(100906)){
		cutin "q_por_mon_27.bmp",4;
	} else
	if(checkquest(100914)){
		cutin "q_por_mon_31.bmp",4;
	} else
	if(checkquest(100924)){
		cutin "q_por_mon_35.bmp",4;
	}
}
ac_spec_01.gat,283,39,0	duplicate(#ac_spec_01_enter2_1)	#ac_spec_01_enter2_2	139,1,5
ac_spec_01.gat,287,26,0	duplicate(#ac_spec_01_enter2_1)	#ac_spec_01_enter2_3	139,5,1

ac_spec_03.gat,100,78,0	duplicate(#ac_prac_01_enter1)	#ac_spec_03_enter1	139,1,5
ac_spec_03.gat,88,68,0	script	#ac_spec_03_enter2	139,5,1,{
	if(!@help) end; //�A��ɂ͕\�������Ȃ�
	set @help,0;
	if(checkquest(100892)){
		cutin "q_por_mon_26.bmp",4;
	} else
	if(checkquest(100916) || checkquest(100926)){
		cutin "q_por_mon_32.bmp",4;
	}
}

ac_spec_02.gat,13,144,0	script	#ac_spec_02_sub1	139,1,1,{
	if(checkquest(100844) || checkquest(100854)){
		cutin "q_por_mon_13.bmp",4;
	} else
	if(checkquest(100874)){
		cutin "q_por_mon_22.bmp",4;
	} else
	if(checkquest(100886) || checkquest(100894)){
		cutin "q_por_mon_24.bmp",4;
	} else
	if(checkquest(100922)){
		cutin "q_por_mon_34.bmp",4;
	} else
	if(checkquest(100938)){
		cutin "q_por_mon_39.bmp",4;
	}
}
ac_spec_02.gat,82,68,0	duplicate(#ac_spec_02_sub1)	#ac_spec_02_sub2	139,1,1
ac_spec_02.gat,78,174,0	duplicate(#ac_spec_02_sub1)	#ac_spec_02_sub3	139,1,1
ac_spec_02.gat,105,125,0	duplicate(#ac_spec_02_sub1)	#ac_spec_02_sub4	139,1,1
ac_spec_02.gat,181,141,0	duplicate(#ac_spec_02_sub1)	#ac_spec_02_sub5	139,1,1
ac_spec_02.gat,181,70,0	duplicate(#ac_spec_02_sub1)	#ac_spec_02_sub6	139,1,1
