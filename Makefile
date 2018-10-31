build: pointer.klib
build: main.kexe

pointer.klib: pointer.def
	cinterop -def $^ -pkg pointer -o pointer

main.kexe: main.kt pointer.klib
	konanc main.kt -l pointer.klib -o main

clean:
	rm -rf *.klib *-build/ *.kexe
