Project: ___e4rat___
url: https://wiki.archlinux.org/title/E4rat#e4rat-lite
package: manjaro: _e4rat-lite-git/ e4rat-git_
config: `/etc/e4rat.conf`

disable the `systemd-readahead-collect` and `systemd-readahead-replay`


collection:
e4rat-collect:
append	`init=/sbin/e4rat-collect` to boot command
runs for 120ms  
to kill `e4rat-collect -k` or `pkill e4rat-collect`
this will create a file at `/var/lib/e4rat/startup.log`

**NOTE**: *Do not forget to remove the e4rat-collect command from your Boot loader configuration file (not necessary if you inserted it on the grub command line)*.

e4rat-realloc:
Upon collection of data run as root `e4rat-realloc /var/lib/e4rat/startup.log`
swtich to rescure mode by `systemctl isolate rescue`

e4rat-preload
Append `init=/sbin/e4rat-preload` permanently to your kernel parameters.

