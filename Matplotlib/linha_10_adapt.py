import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
import itertools
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt
import matplotlib.cm as cm           # import colormap stuff!
import numpy as np

#
#mpl.style.use('fast')
#import seaborn as sns
#sns.set()
#sns.set_style("ticks")

def apply_scale(data_list, scale):
    ret_list = []
    for el in data_list:
        ret_list.append(el*scale)
    return ret_list

X_ms = [1, 5, 10, 20]

############### 1ms,  2ms,  5ms,  10ms, 20ms, 50ms

MA_3x3_3OBJ = [5153, 3493, 3406, 3394]
MA_3x3_2OBJ = [3370, 3374, 3628, 3473]
MA_3x3_1OBJ = [3063, 3081, 3089, 3089]
CBM_3x3_3OBJ = [ 140023,  108054,  108065,  108020]
CBM_3x3_2OBJ = [ 84295,  54576,  54584,  54565]
CBM_3x3_1OBJ = [ 25566,  455,  469,  467]

MA_4x4_3OBJ = [24764, 10356, 10436, 10504]
MA_4x4_2OBJ = [10730, 10498, 10559, 10585]
MA_4x4_1OBJ = [10035, 10154, 10126, 10137]
CBM_4x4_3OBJ = [ 343258,  129212,  111460,  111456]
CBM_4x4_2OBJ = [ 235697,  69805,  56831,  56841]
CBM_4x4_1OBJ = [ 99296,  8011,  1584,  1611]

MA_5x5_3OBJ = [146897, 45720, 23291, 19727]
MA_5x5_2OBJ = [20580, 19539, 21520, 19955]
MA_5x5_1OBJ = [19242, 19357, 19310, 19322]
CBM_5x5_3OBJ = [ 782491,  159855,  123240,  116079]
CBM_5x5_2OBJ = [ 539594,  95184,  64615,  59899]
CBM_5x5_1OBJ = [ 231991,  20469,  5466,  3128]

MA_6x6_3OBJ = [443739, 73931, 48302, 31114]
MA_6x6_2OBJ = [35194, 30783, 31272, 31305]
MA_6x6_1OBJ = [32416, 30691, 30751, 30756]
CBM_6x6_3OBJ = [ 1436295,  286125,  157285,  128180]
CBM_6x6_2OBJ = [ 908263,  211569,  97703,  69903]
CBM_6x6_1OBJ = [ 371892,  76749,  21729,  8091]


#Common properties
lw=0.7
fs='none'
Y_scale = 0.00001
Y_axis_label = 'Management latency (ms)'
X_axis_lable = 'Observation window (ms)'
plot_name = '$A_R$ = 10% - '
lstile = '-'
plot_title_y_pos = 0.85

f_size = (4*3, 3)
fig = plt.figure(figsize=f_size)
fig.subplots_adjust(hspace=0.2, wspace=0.2, top = 0.6) #Spacing between plots

plt.subplot(1, 4, 1)                                #ls='dashed',
plt.plot(X_ms, apply_scale(MA_3x3_3OBJ, Y_scale), marker='s', ls=lstile, linewidth=lw, fillstyle=fs, color='b', label="MA-3OBJ")
plt.plot(X_ms, apply_scale(MA_3x3_2OBJ, Y_scale), marker='o', ls=lstile, linewidth=lw, fillstyle=fs, color='b', label="MA-2OBJ")
plt.plot(X_ms, apply_scale(MA_3x3_1OBJ, Y_scale), marker='^', ls=lstile, linewidth=lw, fillstyle=fs, color='b', label="MA-1OBJ")
plt.plot(X_ms, apply_scale(CBM_3x3_3OBJ, Y_scale), marker='x', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-3OBJ")
plt.plot(X_ms, apply_scale(CBM_3x3_2OBJ, Y_scale), marker='+', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-2OBJ")
plt.plot(X_ms, apply_scale(CBM_3x3_1OBJ, Y_scale), marker='D', ls=lstile, linewidth=lw, fillstyle=fs, color='r', label="CBM-1OBJ")
plt.title(plot_name+'(3x3)', y=plot_title_y_pos)
plt.ylabel(Y_axis_label)
plt.xlabel(X_axis_lable)
plt.xticks(X_ms) 
plt.ylim(-.2, 4.5)
plt.yticks(np.arange(0, 5, step=1))


plt.subplot(1, 4, 2)
plt.plot(X_ms, apply_scale(MA_4x4_3OBJ, Y_scale), marker='s', ls=lstile, linewidth=lw, fillstyle=fs, color='b',  label="MA-3OBJ")
plt.plot(X_ms, apply_scale(MA_4x4_2OBJ, Y_scale), marker='o', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-2OBJ")
plt.plot(X_ms, apply_scale(MA_4x4_1OBJ, Y_scale), marker='^', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-1OBJ")
plt.plot(X_ms, apply_scale(CBM_4x4_3OBJ, Y_scale), marker='x', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-3OBJ")
plt.plot(X_ms, apply_scale(CBM_4x4_2OBJ, Y_scale), marker='+', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-2OBJ")
plt.plot(X_ms, apply_scale(CBM_4x4_1OBJ, Y_scale), marker='D', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-1OBJ")
plt.title(plot_name+'(4x4)', y=plot_title_y_pos)
plt.xlabel(X_axis_lable)
plt.xticks(X_ms) 
plt.ylim(-.2, 4.5)
plt.yticks(np.arange(0, 5, step=1))

plt.subplot(1, 4, 3)
plt.plot(X_ms, apply_scale(MA_5x5_3OBJ, Y_scale), marker='s', ls=lstile, linewidth=lw, fillstyle=fs, color='b',  label="MA-3OBJ")
plt.plot(X_ms, apply_scale(MA_5x5_2OBJ, Y_scale), marker='o', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-2OBJ")
plt.plot(X_ms, apply_scale(MA_5x5_1OBJ, Y_scale), marker='^', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-1OBJ")
plt.plot(X_ms, apply_scale(CBM_5x5_3OBJ, Y_scale), marker='x', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-3OBJ")
plt.plot(X_ms, apply_scale(CBM_5x5_2OBJ, Y_scale), marker='+', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-2OBJ")
plt.plot(X_ms, apply_scale(CBM_5x5_1OBJ, Y_scale), marker='D', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-1OBJ")
plt.title(plot_name+'(5x5)', y=plot_title_y_pos)
plt.xlabel(X_axis_lable)
plt.xticks(X_ms) 
#plt.ylim(0, 40)


plt.subplot(1, 4, 4)
plt.plot(X_ms, apply_scale(MA_6x6_3OBJ, Y_scale), marker='s', ls=lstile, linewidth=lw, fillstyle=fs, color='b',  label="MA-3OBJ")
plt.plot(X_ms, apply_scale(MA_6x6_2OBJ, Y_scale), marker='o', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-2OBJ")
plt.plot(X_ms, apply_scale(MA_6x6_1OBJ, Y_scale), marker='^', ls=lstile, linewidth=lw, fillstyle=fs, color='b',label="MA-1OBJ")
plt.plot(X_ms, apply_scale(CBM_6x6_3OBJ, Y_scale), marker='x', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-3OBJ")
plt.plot(X_ms, apply_scale(CBM_6x6_2OBJ, Y_scale), marker='+', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-2OBJ")
plt.plot(X_ms, apply_scale(CBM_6x6_1OBJ, Y_scale), marker='D', ls=lstile, linewidth=lw, fillstyle=fs, color='r',label="CBM-1OBJ")
plt.title(plot_name+'(6x6)', y=plot_title_y_pos)
plt.xlabel(X_axis_lable)
plt.xticks(X_ms) 
plt.ylim(-.5, 15)
plt.yticks(np.arange(0, 15, step=2))

#minimize the overlap of subplots

plt.tight_layout()
plt.savefig("AR10.pdf")
plt.savefig('AR10.png', dpi=300)
plt.show()


