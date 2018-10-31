#ifndef POINTER_H
#define POINTER_H

typedef struct PointerS *Pointer;

enum { INT = 1, STRING = 2 };

void InitPointer(Pointer *ptr, void *value);
void PrintPointer(Pointer ptr, int type);

#endif
